public class StringUtilsBase {

  
  // Empty checks
  //-----------------------------------------------------------------------
  /**
  * <p>Checks if a String is empty ("") or null.</p>
  *
  * <pre>
  * StringUtils.isEmpty(null)      = true
  * StringUtils.isEmpty("")        = true
  * StringUtils.isEmpty(" ")       = false
  * StringUtils.isEmpty("bob")     = false
  * StringUtils.isEmpty("  bob  ") = false
  * </pre>
  *
  * @param str  the String to check, may be null
  * @return <code>true</code> if the String is empty or null
  */
  public static boolean isEmpty(String str) {
     return str == null || str.length() == 0;
  }
  
  
  /**
  * <p>Checks if a String is whitespace, empty ("") or null.</p>
  *
  * <pre>
  * StringUtils.isBlank(null)      = true
  * StringUtils.isBlank("")        = true
  * StringUtils.isBlank(" ")       = true
  * StringUtils.isBlank("bob")     = false
  * StringUtils.isBlank("  bob  ") = false
  * </pre>
  *
  * @param str  the String to check, may be null
  * @return <code>true</code> if the String is null, empty or whitespace
  */
  public static boolean isBlank(String str) {
     int strLen;
     if (str == null || (strLen = str.length()) == 0) {
         return true;
     }
     for (int i = 0; i < strLen; i++) {
         if ((Character.isWhitespace(str.charAt(i)) == false)) {
             return false;
         }
     }
     return true;
  }
  
  /**
  * <p>Checks if a String is not empty ("") and not null.</p>
  *
  * <pre>
  * StringUtils.isNotEmpty(null)      = false
  * StringUtils.isNotEmpty("")        = false
  * StringUtils.isNotEmpty(" ")       = true
  * StringUtils.isNotEmpty("bob")     = true
  * StringUtils.isNotEmpty("  bob  ") = true
  * </pre>
  *
  * @param str  the String to check, may be null
  * @return <code>true</code> if the String is not empty and not null
  */
 public static boolean isNotEmpty(String str) {
     return !StringUtils.isEmpty(str);
 }
 
  /**
  * <p>Checks if a String is not empty (""), not null and not whitespace only.</p>
  *
  * <pre>
  * StringUtils.isNotBlank(null)      = false
  * StringUtils.isNotBlank("")        = false
  * StringUtils.isNotBlank(" ")       = false
  * StringUtils.isNotBlank("bob")     = true
  * StringUtils.isNotBlank("  bob  ") = true
  * </pre>
  *
  * @param str  the String to check, may be null
  * @return <code>true</code> if the String is
  *  not empty and not null and not whitespace
  */
  public static boolean isNotBlank(String str) {
     return !StringUtils.isBlank(str);
  }


  /**
   * For more visit http://www.docjar.org/html/api/org/apache/commons/lang/StringUtils.java.html
   * /
}
  
  
