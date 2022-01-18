package Settings;

import java.util.ArrayList;

public class UserNameAndPassword {

    private String Username;
    private String Password;

    static ArrayList<String> UserNameList = new ArrayList<>();

    /*################################################################
        DO NOT CHANGE THE addUserToList METHOD
        addUserToList is adding default email address to the UserNameLists

        ----------------------------------------
        addUserToList METHODUNU değiştirmeyin
        addUserToList UserNameLists a   default email address ekliyor

     */
    //----------------------------------------------------------------------
    public void addUserToList() {

    }


    /*################################################################
        Parametresi String Username ve String Password olan bu constructor olusturun
        SetUsername ve setPassword methodlarını çağıran bu constructordır.
        SetUsername ve setPassword methodlarini cagirin

    */
    //----------------------------------------------------------------------
    public UserNameAndPassword(String username, String password) {
        setUsername(username);
        setPassword(password);
    }


    /*
        Given default constructor.  Boş constructor verilmiştir
     */
    //----------------------------------------------------------------------
    public UserNameAndPassword() {

    }

    /*################################################################
        private String userName and password oluştur
        Adı UserNameLists , türü Strıng ve static olan bir  Arraylist oluşturun.
    */

    //----------------------------------------------------------------------




    /*################################################################
        türü String ve parametresi String(myUsername) olan
        setUsername adında bir method oluşturun

        Eğer myUsername length 6 dan küçük ise
        Username length should be more then 6 return et.

        Eğer myUsername boşluk(" ") içeriyorsa
        Username should not contain space return et

        Eğer myUsername  @ sembolü içermiyorsa
        Username should contain @ symbol return et

        Eğer UserNameLists de  myusername varsa
        Username should be unique return et

        Eğer bunların hepsi false ise
        private userName = myUsername

        ve userName return et
   */
    //----------------------------------------------------------------------

    public String setUsername(String myUsername) {
        if (myUsername.length() < 6) {
            return "Username length should be more then 6";
        } else if (myUsername.contains(" ")) {
            return "Username should not contain space";
        } else if (!myUsername.contains("@")) {
            return "Username should contain @";
        } else if (UserNameList.contains(myUsername)) {
            return "Username should be unique";
        } else {
            return this.Username = myUsername;
        }
    }


    /*################################################################
        Return türü String ve parametresi String(myPassword) olan setPassword methodunu oluşturun

        Eğer myPassword length  5 ten küçük veya eşit ise
        Password length more then 5 character  return edin

        Eğer ilk condition false ise
        private password variable  myPassword a eşittir

        ve   myPassword return et
    */
    //----------------------------------------------------------------------

    public String setPassword(String myPassword) {
        if (myPassword.length() <= 5) {
            return "Password length more then 5 character";
        } else {
            this.Password = myPassword;
            return myPassword;
        }
    }

}
