/**
 * This class is generated by jOOQ
 */
package info.gngr.db;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.5.0"
    },
    comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

  private static final long serialVersionUID = -1797739777;

  /**
   * The reference instance of <code>PUBLIC</code>
   */
  public static final Public PUBLIC = new Public();

  /**
   * No further instances allowed
   */
  private Public() {
    super("PUBLIC");
  }

  @Override
  public final java.util.List<org.jooq.Table<?>> getTables() {
    final java.util.List result = new java.util.ArrayList();
    result.addAll(getTables0());
    return result;
  }

  private final java.util.List<org.jooq.Table<?>> getTables0() {
    return java.util.Arrays.<org.jooq.Table<?>> asList(
        info.gngr.db.tables.Permissions.PERMISSIONS,
        info.gngr.db.tables.Cookies.COOKIES,
        info.gngr.db.tables.Globals.GLOBALS);
  }
}