package irvine.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;

import irvine.util.CliFlags.AnonymousFlag;
import irvine.util.CliFlags.Flag;
import irvine.util.CliFlags.FlagValue;
import irvine.util.CliFlags.InvalidFlagHandler;
import irvine.util.CliFlags.Validator;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Pablo Mayrgundter
 * @author Sean A. Irvine
 */
public class CliFlagsTest extends TestCase {

  protected CliFlags mFlags;

  /** Used by JUnit (called after each test method)  */
  @Override
  protected void setUp() {
    mFlags = new CliFlags();
    mFlags.setInvalidFlagHandler(null);
  }

  /** Used by JUnit (called before each test method)  */
  @Override
  protected void tearDown() {
    mFlags = null;
  }

  private static final String LS = System.lineSeparator();

  public void testRemaining() {
    mFlags.registerRequired("boolean", Boolean.class, "", "");
    assertTrue(!mFlags.setFlags(new String[] {
        "s1",
        "--boolean", "true",
        "s2",
        "s3"}));
  }

  public void testRequired() {
    mFlags.registerRequired("boolean", Boolean.class, "a boolean value", "");
    assertTrue(!mFlags.setFlags(new String[] {
        "s1",
        "s2",
        "s3"}));
    assertEquals("unexpected arguments s1 s2 s3", mFlags.getParseMessage());
    assertEquals("Error: unexpected arguments s1 s2 s3" + LS + LS + "Required flags: " + LS + "      --boolean=A BOOLEAN VALUE " + LS + LS + "Optional flags: " + LS + "  -h, --help                    Print help on command-line flag usage.", mFlags.getUsageString().trim());
  }


  public void testRequiredPM() {
    mFlags.registerRequired("integer", Integer.class, "a integer value", "");
    assertTrue(!mFlags.setFlags(new String[] {"--integer"}));
    assertEquals("Expecting value for flag --integer", mFlags.getParseMessage());
  }


  public void testRepeated() {
    mFlags.registerRequired('b', "boolean", Boolean.class, "a boolean value", "");
    try {
      mFlags.registerRequired("boolean", Boolean.class, "a boolean value", "");
      fail("Should not getCount registering a flag with preexisting long name");
    } catch (final IllegalArgumentException iae) {
      assertEquals("A flag named boolean already exists.", iae.getMessage());
    }

    try {
      mFlags.registerRequired('b', "foolean", Boolean.class, "a boolean value", "");
      fail("Should not getCount registering a flag with preexisting short name");
    } catch (final IllegalArgumentException iae) {
      assertEquals("A flag with short name b already exists.", iae.getMessage());
    }
  }

  public void testTooMany() {
    mFlags.registerOptional("boolean", "a boolean value");
    assertTrue(mFlags.setFlags(new String[] {"--boolean"}));
    assertTrue(!mFlags.setFlags(new String[] {"--boolean", "--boolean"}));
    assertEquals("Attempt to set flag --boolean too many times.", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"--boolean"}));

    mFlags.registerRequired("int", Integer.class, "number", "an integer value");
    assertTrue(mFlags.setFlags(new String[] {"--int", "10"}));
    assertTrue(!mFlags.setFlags(new String[] {"--int", "10", "--boolean", "--int", "10"}));
    assertEquals("Attempt to set flag --int too many times.", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"--int", "10"}));
  }

  private static final String[] ARGS1 = {"--q", "--in", "a"};
  private static final String[] ARGS2 = {"--q", "--in"};

  public void testCLI() {
    mFlags.registerOptional("q", "Suppresses printing error messages and prompts.");
    mFlags.registerOptional("log", "Same as q, but allow logging.");
    mFlags.registerOptional("in", String.class, "<file>", "Takes input from a file instead of the keyboard.");
    mFlags.registerOptional("out", String.class, "<file>", "Sends output to a file instead of the screen.", "default");
    mFlags.setDescription("For help on interactive use or script commands, type 'help' at program startup.");
    if (!mFlags.setFlags(ARGS1)) {
      fail("Shouldn't fail");
    }
    assertTrue(mFlags.isSet("q"));
    assertTrue(mFlags.isSet("in"));

    assertTrue(!mFlags.isSet("out"));
    assertEquals("default", mFlags.getValue("out"));

    assertEquals(Boolean.FALSE, mFlags.getValue("log"));
    assertEquals(Boolean.TRUE, mFlags.getValue("q"));

    if (mFlags.setFlags(ARGS2)) {
      fail("Should have failed.");
    }
  }

  private void validateFlags() {
    assertTrue(mFlags.isSet("boolean"));
    assertTrue(mFlags.getValue("boolean").equals(Boolean.TRUE));

    assertTrue(mFlags.isSet("byte"));
    assertTrue(mFlags.getValue("byte").equals(Byte.valueOf("10")));

    assertTrue(mFlags.isSet("short"));
    assertTrue(mFlags.getValue("short").equals(Short.valueOf("127")));

    assertTrue(mFlags.isSet("char"));
    assertTrue(mFlags.getValue("char").equals('c'));

    assertTrue(mFlags.isSet("int"));
    assertTrue(mFlags.getValue("int").equals(3));

    assertTrue(mFlags.isSet("float"));
    assertTrue(mFlags.getValue("float").equals(4.6F));

    assertTrue(mFlags.isSet("long"));
    assertTrue(mFlags.getValue("long").equals((long) 64234));

    assertTrue(mFlags.isSet("double"));
    assertTrue(mFlags.getValue("double").equals(64324.234));
  }

  public void testSetArgsWithStrings() {
    mFlags.registerRequired("boolean", Boolean.class, "", "");
    mFlags.registerRequired("byte", Byte.class, "", "");
    mFlags.registerRequired("short", Short.class, "", "");
    mFlags.registerRequired("char", Character.class, "", "");

    mFlags.registerRequired("int", Integer.class, "", "");
    mFlags.registerRequired("float", Float.class, "", "");
    mFlags.registerOptional("long", Long.class, "", "");
    mFlags.registerRequired("double", Double.class, "", "");

    mFlags.registerOptional("file", File.class, "", "");

    assertTrue(mFlags.setFlags(new String[] {"--boolean", "true", "--byte", "10", "--short", "127",
                                            "--char", "c",
                                            "--int", "3", "--float", "4.6", "--long", "64234",
                                            "--file", "afilename",
                                            "--double", "64324.234"}));

    validateFlags();


    assertTrue(mFlags.isSet("file"));
    assertTrue(mFlags.getValue("file").equals(new File("afilename")));

    // getOptional and getRequired
    final Collection<?> optional = mFlags.getOptional();
    assertNotNull(optional);
    assertTrue(3 == optional.size()); // always has help
    assertFalse(optional.contains(mFlags.getFlag("boolean")));
    assertTrue(optional.contains(mFlags.getFlag("help"))); // always has help
    assertTrue(optional.contains(mFlags.getFlag("long")));
    assertTrue(optional.contains(mFlags.getFlag("file")));

    final Collection<?> required = mFlags.getRequired();
    assertNotNull(required);
    assertTrue(7 == required.size());
    assertFalse(required.contains(mFlags.getFlag("long")));
    assertTrue(required.contains(mFlags.getFlag("boolean")));
    assertTrue(required.contains(mFlags.getFlag("byte")));
    assertTrue(required.contains(mFlags.getFlag("short")));
    assertTrue(required.contains(mFlags.getFlag("char")));
    assertTrue(required.contains(mFlags.getFlag("int")));
    assertTrue(required.contains(mFlags.getFlag("float")));
    assertTrue(required.contains(mFlags.getFlag("double")));

    // getType
    assertEquals(Boolean.class, mFlags.getFlag("boolean").getParameterType());
    assertEquals(Byte.class, mFlags.getFlag("byte").getParameterType());
    assertEquals(Short.class, mFlags.getFlag("short").getParameterType());
    assertEquals(Character.class, mFlags.getFlag("char").getParameterType());
    assertEquals(Integer.class, mFlags.getFlag("int").getParameterType());
    assertEquals(Long.class, mFlags.getFlag("long").getParameterType());
    assertEquals(Float.class, mFlags.getFlag("float").getParameterType());
    assertEquals(Double.class, mFlags.getFlag("double").getParameterType());
    assertEquals(File.class, mFlags.getFlag("file").getParameterType());
  }


  public void testSetArgsWithProperties() {
    mFlags.registerRequired("boolean", Boolean.class, "", "");
    mFlags.registerRequired("byte", Byte.class, "", "");
    mFlags.registerRequired("short", Short.class, "", "");
    mFlags.registerRequired("char", Character.class, "", "");
    mFlags.registerRequired("int", Integer.class, "", "");
    mFlags.registerRequired("float", Float.class, "", "");
    mFlags.registerOptional("long", Long.class, "", "");
    mFlags.registerRequired("double", Double.class, "", "");

    final Properties props = new Properties();
    props.setProperty("boolean", "true");
    props.setProperty("byte", "10");
    props.setProperty("short", "127");
    props.setProperty("char", "c");
    props.setProperty("int", "3");
    props.setProperty("float", "4.6");
    props.setProperty("long", "64234");
    props.setProperty("double", "64324.234");

    assertTrue(mFlags.setFlags(props));
    validateFlags();
  }

  public void testHelpFlag() {
    final CliFlags f = new CliFlags();
    final Flag<?> x = f.getFlag("help");
    assertNotNull(x);
    assertEquals(Character.valueOf('h'), x.getChar());
    assertEquals("Print help on command-line flag usage.", x.getDescription());
  }

  public void testVariousKinds() {
    Flag<?> f = mFlags.registerOptional("aa", "bb");
    assertNotNull(f);
    assertEquals("bb", f.getDescription());
    f = mFlags.registerOptional('v', "cc", "dd");
    assertNotNull(f);
    assertEquals("dd", f.getDescription());
    f = mFlags.registerRequired(File.class, "hi", "there");
    assertNotNull(f);
    f = mFlags.registerRequired("zz", File.class, "hix", "therex");
    assertNotNull(f);
    f = mFlags.registerRequired('j', "zzz", File.class, "hiz", "therez");
    assertNotNull(f);
    f = mFlags.registerOptional("zzr", File.class, "him", "therem");
    assertNotNull(f);
    f = mFlags.registerOptional('k', "zzx", File.class, "hih hih hih", "thereh thereh thereh thereh thereh thereh thereh thereh thereh thereh thereh thereh");
    assertNotNull(f);
    f = mFlags.registerOptional('l', "zzy", File.class, "hio", "thereo", null);
    assertNotNull(f);
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2"}));
    assertEquals("you must provide values for --zz HIX HI", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2", "-zz", "dog"}));
    assertEquals("Unknown flag -zz", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2", "--zz", "dog"}));
    assertEquals("you must provide a value for HI", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2", "--zz", "dog", "cat"}));
    assertEquals("", mFlags.getParseMessage());
    assertEquals(LS + "Required flags: " + LS + "      --zz=HIX          therex" + LS + "  -j, --zzz=HIZ         therez" + LS + "      HI                there" + LS + LS + "Optional flags: " + LS + "      --aa              bb" + LS + "  -v, --cc              dd" + LS + "  -h, --help            Print help on command-line flag usage." + LS + "      --zzr=HIM         therem" + LS + "  -k, --zzx=HIH HIH HIH thereh thereh thereh thereh thereh thereh thereh thereh" + LS + "                        thereh thereh thereh thereh" + LS + "  -l, --zzy=HIO         thereo" + LS, mFlags.getUsageString());
    assertEquals("cat", mFlags.getAnonymousValue(0).toString());
    try {
      mFlags.getAnonymousValue(1);
    } catch (final IndexOutOfBoundsException e) {
      // ok
    }
    assertEquals(1, mFlags.getAnonymousValues(0).size());
    assertTrue(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2=r", "--zz", "dog", "cat"}));
    assertEquals("", mFlags.getParseMessage());
    mFlags.setDescription("flunky test");
    mFlags.setName("dogbreath");
    mFlags.setRemainderHeader("%%");
    assertEquals("Usage: dogbreath [OPTION]... --zz HIX -j HIZ HI %%" + LS + LS + "Required flags: " + LS + "      --zz=HIX          therex" + LS + "  -j, --zzz=HIZ         therez" + LS + "      HI                there" + LS + LS + "Optional flags: " + LS + "      --aa              bb" + LS + "  -v, --cc              dd" + LS + "  -h, --help            Print help on command-line flag usage." + LS + "      --zzr=HIM         therem" + LS + "  -k, --zzx=HIH HIH HIH thereh thereh thereh thereh thereh thereh thereh thereh" + LS + "                        thereh thereh thereh thereh" + LS + "  -l, --zzy=HIO         thereo" + LS + LS + "flunky test", mFlags.getUsageString());
    assertEquals("[OPTION]... --zz HIX -j HIZ HI", mFlags.getCompactFlagUsage());
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "--help", "-j", "pox2=r", "--zz", "dog", "cat"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "-h", "-j", "pox2=r", "--zz", "dog", "cat"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2=r", "--zz", "dog", "cat", "-h"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    assertFalse(mFlags.setFlags(new String[] {"-l", "pox", "-j", "pox2=r", "--zz", "dog", "cat", "--help"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
  }

  private static class FalseValidator implements Validator {
    @Override
    public boolean isValid(final CliFlags f) {
      return false;
    }
  }

  public void testInvalid() {
    mFlags.setValidator(new FalseValidator());
    assertFalse(mFlags.setFlags(new String[0]));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new Properties()));
    mFlags.registerRequired("zz", Integer.class, "hix", "therex");
    assertFalse(mFlags.setFlags(new Properties()));
    assertEquals("you must provide a value for --zz HIX", mFlags.getParseMessage());
    final Properties p = new Properties();
    p.setProperty("zz", "x");
    assertFalse(mFlags.setFlags(p));
    assertEquals("", mFlags.getParseMessage());
    p.setProperty("zz", "5");
    assertTrue(mFlags.setFlags(p));
  }

  public void testMultiValue() {
    final Flag<Integer> f = new Flag<>('x', "xx", "mv", 3, 4, Integer.class, "kk", 42);
    mFlags.register(f);
    assertFalse(mFlags.isSet("xx"));
    assertFalse(mFlags.setFlags(new String[] {"-x", "7"}));
    assertEquals("you must provide a value for -x KK (2 more times)", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"--xx", "7"}));
    assertEquals("you must provide a value for -x KK (2 more times)", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"-x", "7", "-x", "8"}));
    assertEquals("you must provide a value for -x KK (1 more time)", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "-x", "9"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "-x", "9", "-x", "10"}));
    assertEquals("", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "-x", "9", "-x", "10", "-x", "11"}));
    assertEquals("Attempt to set flag -x too many times.", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "--xx", "9", "-x", "10"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "--xx=9", "-x", "10"}));
    assertEquals("", mFlags.getParseMessage());
    assertNotNull(mFlags.getValues("xx"));
    assertNotNull(mFlags.getReceivedValues());
    assertTrue(mFlags.isSet("xx"));
    assertFalse(mFlags.isSet("yy"));
    assertFalse(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "--xx", "9", "-x", "10", "-x", "11"}));
    assertEquals("Attempt to set flag -x too many times.", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "--xx", "9", "-x", "10", "-x", "11", "-h", "--helx"}));
    assertEquals("Attempt to set flag -x too many times.", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    assertFalse(mFlags.setFlags(new String[] {"-x", "7", "-x", "8", "--xx", "9", "-x", "10", "-x", "11", "-o", "--help"}));
    assertEquals("Attempt to set flag -x too many times.", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
  }

  private static class MyFlagHandler implements InvalidFlagHandler {
    @Override
    public void handleInvalidFlags(final CliFlags f) {
      throw new ArithmeticException();
    }

    @Override
    public void setExitOk(final boolean exitOk) {
    }
  }

  public void testMultiValueAnon() {
    final Flag<Integer> f = new AnonymousFlag<>("mv", Integer.class, "kk");
    f.setMaxCount(Integer.MAX_VALUE);
    try {
      f.setMinCount(Integer.MAX_VALUE);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("You're crazy man -- MinCount cannot be Integer.MAX_VALUE", e.getMessage());
    }
    f.setMaxCount(4);
    try {
      f.setMinCount(Integer.MAX_VALUE);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("MinCount (2147483647) must not be greater than MaxCount (4)", e.getMessage());
    }
    f.setMinCount(3);
    mFlags.register(f);
    assertFalse(mFlags.setFlags(new String[] {"7"}));
    assertEquals("you must provide a value for KK+ (2 more times)", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"7", "8"}));
    assertEquals("you must provide a value for KK+ (1 more time)", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"7", "8", "9"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"7", "8", "9", "10"}));
    assertEquals("", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"7", "8", "9", "10", "11"}));
    assertEquals("unexpected argument 11", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"7", "8", "9", "10", "-h"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    assertFalse(mFlags.setFlags(new String[] {"7", "8", "9", "10", "--help"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    assertFalse(mFlags.setFlags(new String[] {"7", "8", "9", "10", "11", "--help"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.isSet(CliFlags.HELP_FLAG));
    mFlags.setInvalidFlagHandler(new MyFlagHandler());
    try {
      mFlags.setFlags(new String[] {"7", "8", "9", "10", "11"});
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertTrue(mFlags.setFlags(new String[] {"7", "8", "9", "10"}));
    assertNotNull(mFlags.getAnonymousFlags());
  }

  public void testRequired2() {
    Flag<File> f = mFlags.registerRequired("zz", File.class, "hix", "therex");
    assertNotNull(f);
    f = mFlags.registerRequired('j', "zzz", File.class, "hiz", "therez");
    assertNotNull(f);
    assertFalse(mFlags.setFlags(new String[0]));
    assertEquals("you must provide values for --zz HIX -j HIZ", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"--zz", "h"}));
    assertEquals("you must provide a value for -j HIZ", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"--zz", "h", "t"}));
    assertEquals("unexpected argument t", mFlags.getParseMessage());
    assertFalse(mFlags.setFlags(new String[] {"--zz", "h", "t", "k"}));
    assertEquals("unexpected arguments t k", mFlags.getParseMessage());
    Properties p = new Properties();
    p.setProperty("uu", "h");
    assertFalse(mFlags.setFlags(p));
    assertEquals("", mFlags.getParseMessage());
    p = new Properties();
    p.setProperty("zz", "h");
    assertFalse(mFlags.setFlags(p));
    assertEquals("you must provide a value for -j HIZ", mFlags.getParseMessage());
    p.setProperty("zzz", "p");
    assertTrue(mFlags.setFlags(p));
    assertEquals("", mFlags.getParseMessage());
    p.setProperty("zzq", "p");
    assertFalse(mFlags.setFlags(p));
    assertEquals("", mFlags.getParseMessage());
    try {
      mFlags.setFlags(new String[] {"--zz", null});
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testRange() {
    Flag<String> f = new Flag<>('x', "xx", "mv", 1, 1, String.class, "kk", null);
    final HashSet<String> m = new HashSet<>();
    m.add("value");
    try {
      f.setParameterRange(m);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Must specify at least two values in parameter range.", e.getMessage());
    }
    m.add("pox");
    f.setParameterRange(m);
    mFlags.register(f);
    assertFalse(mFlags.setFlags(new String[] {"--xx", "v"}));
    assertEquals("Invalid value v for --xx. Value supplied is not in the set of allowed values.", mFlags.getParseMessage());
    final String oo = mFlags.getUsageString(1000).trim();
    if (!("Error: Invalid value v for --xx. Value supplied is not in the set of allowed values." + LS + LS + "Required flags: " + LS + "  -x, --xx=KK mv Must be one of [value, pox]." + LS + LS + "Optional flags: " + LS + "  -h, --help  Print help on command-line flag usage.").equals(oo)) {
      assertEquals("Error: Invalid value v for --xx. Value supplied is not in the set of allowed values." + LS + LS + "Required flags: " + LS + "  -x, --xx=KK mv Must be one of [pox, value]." + LS + LS + "Optional flags: " + LS + "  -h, --help  Print help on command-line flag usage.", oo);
    }
    assertTrue(mFlags.setFlags(new String[] {"--xx", "value"}));
    assertEquals("", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"-x", "pox"}));
    assertEquals("", mFlags.getParseMessage());
    f = new Flag<>('x', "xx", "mv", 0, 0, null, "kk", null);
    try {
      f.setParameterRange(m);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Cannot set parameter range for no-arg flags.", e.getMessage());
    }
  }

  public void testDefaultInvalidFlagHandler() throws InterruptedException, IOException {
    try {
      CliFlags.DEFAULT_INVALID_FLAG_HANDLER.handleInvalidFlags(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final PrintStream oldErr = System.err;
    final PrintStream oldOut = System.out;
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setErr(new PrintStream(output));
    PrintStream p = new PrintStream(output);
    System.setOut(p);
    try {
      final CliFlags f = new CliFlags();
      f.setName("Freddy");
      f.setFlags(new String[] {"--help"});
      CliFlags.DEFAULT_INVALID_FLAG_HANDLER.handleInvalidFlags(f);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Exit with: 0", e.getMessage());
    }
    p.close();
    assertEquals("Usage: Freddy [OPTION]..." + LS + LS + "Optional flags: " + LS + "  -h, --help Print help on command-line flag usage.", output.toString().trim());
    output = new ByteArrayOutputStream();
    System.setErr(new PrintStream(output));
    p = new PrintStream(output);
    System.setOut(p);
    try {
      final CliFlags f = new CliFlags();
      f.registerRequired("boolean", Boolean.class, "", "");
      f.setName("Freddy");
      f.setFlags(new String[] {"--boolean=true"});
      CliFlags.DEFAULT_INVALID_FLAG_HANDLER.handleInvalidFlags(f);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Exit with: 1", e.getMessage());
    }
    p.close();
    assertEquals("Usage: Freddy [OPTION]... --boolean BOOLEAN" + LS + LS + "Try '--help' for more information", output.toString().trim());
    System.setOut(oldOut);
    System.setErr(oldErr);
  }

  public void testSpecialAnonProps() {
    final AnonymousFlag<Integer> f1 = new AnonymousFlag<>("mv", Integer.class, "kk");
    final AnonymousFlag<Integer> f2 = new AnonymousFlag<>("mx", Integer.class, "zz");
    assertEquals(1, f2.compareTo(f1));
    assertEquals(-1, f1.compareTo(f2));
    assertEquals(0, f1.compareTo(f1));
  }

  public void testFlagInnerClass() {
    Flag<Integer> f = new Flag<>('x', "xx", "mv", 0, 1, Integer.class, "kk", 42);
    try {
      f.setMaxCount(0);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("MaxCount (0) must not be 0 or less than MinCount (0)", e.getMessage());
    }
    f.setMaxCount(2);
    f.setMinCount(2);
    try {
      f.setMaxCount(1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("MaxCount (1) must not be 0 or less than MinCount (2)", e.getMessage());
    }
    final CliFlags cli = new CliFlags("hi");
    cli.register(f);
    assertEquals("Usage: hi [OPTION]... -x KK" + LS + LS + "Required flags: " + LS + "  -x, --xx=KK mv Must be specified at least 2 times. May be specified up to 2" + LS + "              times. (Default is 42)" + LS + LS + "Optional flags: " + LS + "  -h, --help  Print help on command-line flag usage." + LS, cli.getUsageString());
    final Collection<?> c = f.getValues();
    assertTrue(c.contains(42));
    final Flag<Integer> f1 = new Flag<>('x', "xx", "mv", 3, 4, Integer.class, "kk", 42);
    final Flag<Integer> f2 = new Flag<>('y', "xy", "my", 3, 4, Integer.class, "ky", 42);
    assertEquals(1, f2.compareTo(f1));
    assertEquals(-1, f1.compareTo(f2));
    assertEquals(0, f1.compareTo(f1));
    f = new Flag<>('x', "xx", "mv", 0, Integer.MAX_VALUE, Integer.class, "kk", 42);
    mFlags.register(f);
    assertEquals(LS + "Optional flags: " + LS + "  -h, --help  Print help on command-line flag usage." + LS + "  -x, --xx=KK mv May be specified multiple times. (Default is 42)" + LS, mFlags.getUsageString());
    mFlags.setFlags(new String[] {"-x", "22"});
    final Iterator<FlagValue<?>> i = mFlags.getReceivedValues();
    assertTrue(i.hasNext());
    final FlagValue<?> fv = i.next();
    assertNotNull(fv);
    assertEquals(f, fv.getFlag());
    assertEquals(22, fv.getValue());
    assertEquals("xx=22", fv.toString());
    assertFalse(i.hasNext());
  }

  public void testBooleanVarious() {
    mFlags.registerRequired("boolean", Boolean.class, "", "");
    mFlags.setFlags(new String[] {"--boolean", "true"});
    assertEquals(Boolean.TRUE, mFlags.getValue("boolean"));
    mFlags.setFlags(new String[] {"--boolean", "false"});
    assertEquals(Boolean.FALSE, mFlags.getValue("boolean"));
    mFlags.setFlags(new String[] {"--boolean", "t"});
    assertEquals(Boolean.TRUE, mFlags.getValue("boolean"));
    mFlags.setFlags(new String[] {"--boolean", "1"});
    assertEquals(Boolean.TRUE, mFlags.getValue("boolean"));
    mFlags.setFlags(new String[] {"--boolean", "yes"});
    assertEquals(Boolean.TRUE, mFlags.getValue("boolean"));
    mFlags.setFlags(new String[] {"--boolean", "y"});
    assertEquals(Boolean.TRUE, mFlags.getValue("boolean"));
    mFlags.setFlags(new String[] {"--boolean", "on"});
    assertEquals(Boolean.TRUE, mFlags.getValue("boolean"));
  }

  public void testRange2() {
    final Flag<URL> f = new Flag<>('x', "xx", "mv", 1, 1, URL.class, "kk", null);
    final HashSet<String> m = new HashSet<>();
    m.add("value");
    try {
      f.setParameterRange(m);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Must specify at least two values in parameter range.", e.getMessage());
    }
    m.add("pox");
    try {
      f.setParameterRange(m);
      fail();
    } catch (final IllegalArgumentException e) {
      if (!"Range value value could not be parsed.".equals(e.getMessage())) {
        assertEquals("Range value pox could not be parsed.", e.getMessage());
      }
    }
    mFlags.register(f);
    assertFalse(mFlags.setFlags(new String[] {"--xx", "v"}));
    assertEquals("Invalid value v for --xx. Badly formatted URL: v", mFlags.getParseMessage());
    assertTrue(mFlags.setFlags(new String[] {"--xx", "file:hi"}));
    assertEquals("file:hi", f.getValue().toString());
    final Flag<BigInteger> ff = new Flag<>('z', "zz", "mv", 1, 1, BigInteger.class, "kk", null);
    mFlags.register(ff);
    assertFalse(mFlags.setFlags(new String[] {"--zz", "v"}));
    assertEquals("Invalid value v for --zz. Unknown parameter type: class java.math.BigInteger", mFlags.getParseMessage());
  }

  public void testStringFlagType() {
    final Flag<String> f = new Flag<>('q', "qqq", "mv", 1, 1, String.class, "kk", null);
    mFlags.register(f);
    assertTrue(mFlags.setFlags(new String[] {"--qqq", "hi"}));
    assertEquals("hi", f.getValue());
  }

  public void testMultiSetOfSingleFlag() {
    final Flag<Integer> f = mFlags.registerRequired("int", Integer.class, "", "");
    f.setMaxCount(1);
    assertFalse(mFlags.setFlags(new String[] {"--int", "5", "--int", "6"}));
    assertEquals("Attempt to set flag --int too many times.", mFlags.getParseMessage());
    f.setMaxCount(Integer.MAX_VALUE);
    assertTrue(mFlags.getUsageString(1000).contains("--int=INTEGER  May be specified multiple times."));
  }

}
