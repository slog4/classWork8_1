package classWork8Task4;

public class User implements IPerson,IUser{

    protected String name;
    protected String email;
    protected String namberPhone;
    protected String ipAdress;
    protected String login;
    protected String password;
    protected String accessRights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamberPhone() {
        return namberPhone;
    }

    public void setNamberPhone(String namberPhone) {
        this.namberPhone = namberPhone;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(String accessRights) {
        this.accessRights = accessRights;
    }

    public User(String name, String email, String namberPhone, String ipAdress, String login, String password, String accessRights) {
        setName(name);
        setEmail(email);
        setNamberPhone(namberPhone);
        setIpAdress(ipAdress);
        setLogin(login);
        setPassword(password);
        setAccessRights(accessRights);
    }

    @Override
    public void contactDetails() {
        System.out.println("\n name "+ name +"\n email "+ email +"\n Namber phone "+ namberPhone);
    }
    @Override
    public void authenticationParameters(){
        System.out.println("\t IP adress: "+ getIpAdress()+"\t login: "+getLogin()+"\t Password: "+ getPassword()+"\t Access: "+getAccessRights() );
    }
}
