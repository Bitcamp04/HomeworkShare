package homework._2024_05_01;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Advanced {
    public static void main(String[] args) {
        UserBook userBook = new UserBook();
        userBook.saveUserInfo("a","a1");
        userBook.saveUserInfo("b","b1");
        userBook.saveUserInfo("c","c1");
        userBook.saveUserInfo("d","d1");
        userBook.saveUserInfo("e","e1");
        userBook.saveUserInfo("f","f1");
        userBook.saveUserInfo("g","g1");
        userBook.saveUserInfo("h","h1");
        userBook.saveUserInfo("i","i1");
        for(User user:userBook.getUsers()){
            try{
                System.out.println("id  "+user.getId()+"username  "+user.getUsername()
                        +"password  "+user.getPassword());
            }catch(NullPointerException e){
                break;
            }
        }
    }
}

@Getter
class UserBook{
    User[] users=new User[100];
    int index=0;

    public void saveUserInfo(String username,String password){
        users[index++]=new User(index+1,username,password);
    }
}

@AllArgsConstructor
class User {
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}