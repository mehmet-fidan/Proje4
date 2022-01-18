package Settings;

public class UserSettings {

    /*################################################################
       Bütün variables lar  public
       Stringler   username
                     password
                     Address1
                     City
                     ZipCode
                     ItemName
                     customText
                     color

       boolean       wanaCustomText
       double        myPrice

    */

    public String username, password, Address1, City, ZipCode, ItemName, customText, color;
    public boolean wanaCustomText;
    public double myPrice;

    //----------------------------------------------------------------------




    /*################################################################
         toString methodunu oluşturun
         Bütün variables ları aşağıdaki gibi return et

                "\nusername : " + username +
                "\npassword :" + password +
                "\nAddress1 " + Address1+
                 ........
     */

    @Override
    public String toString() {
        return "User Settings " +
                "\nUsername =" + username +
                "\nPassword =" + password +
                "\nAddress1 =" + Address1 +
                "\nCity =" + City +
                "\nZip Code =" + ZipCode +
                "\nItem Name =" + ItemName +
                "\nCustom Text =" + customText +
                "\nColor =" + color +
                "\nWana Custom Text =" + wanaCustomText +
                "\nMy Price =" + myPrice;
    }
    //----------------------------------------------------------------------




}
