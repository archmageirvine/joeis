package irvine.util.io;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.HashMap;

/**
 * A custom URLStreamHandlerFactory that knows about some of our own
 * protocols -- this class uses the singleton pattern.
 *
 * @author Len Trigg
 */
public class CustomURLStreamHandlerFactory implements URLStreamHandlerFactory {

  /** The CustomURLStreamHandlerFactory singleton. */
  private static CustomURLStreamHandlerFactory sInstance = null;


  /**
   * Get the CustomURLStreamHandlerFactory singleton.
   *
   * @return The instance value.
   */
  public static synchronized CustomURLStreamHandlerFactory getInstance() {
    if (sInstance == null) {
      sInstance = new CustomURLStreamHandlerFactory();
    }
    return sInstance;
  }


  /** Store a mapping from protocol names to handler classes. */
  private final HashMap<String, Class<? extends URLStreamHandler>> mHandlerMap = new HashMap<>();


  /**
   * Non-public constructor since we're using the singleton pattern.
   * It is not private to allow unit testing without mucking up the
   * singleton itself.
   */
  CustomURLStreamHandlerFactory() { }

  @Override
  public URLStreamHandler createURLStreamHandler(final String protocol) {
    final Class<? extends URLStreamHandler> c = mHandlerMap.get(protocol);
    if (c != null) {
      try {
        return c.newInstance();
      } catch (final InstantiationException | IllegalAccessException e) {
        System.err.println("Couldn't create URLStreamHandler " + c.getName());
      }
    }
    return null;
  }


  /**
   * Register a URLStreamHandler for a given protocol.
   *
   * @param protocol the protocol name
   * @param handlerClass a Class whos instances are assignable to
   * URLStreamHandler
   */
  public synchronized void registerHandler(final String protocol, final Class<? extends URLStreamHandler> handlerClass) {
    if (protocol == null) {
      throw new NullPointerException("Null protocol");
    }
    if (handlerClass == null) {
      throw new NullPointerException("Null handlerClass");
    }
    mHandlerMap.put(protocol, handlerClass);
  }


}
