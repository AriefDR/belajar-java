package programmer.zaman.now.data;

public class SocialMedia {
    String name;
}

class Facebook extends  SocialMedia {
    final void login(String username, String password) {
        // PASS
    }
}

// ERROR
//class FakeFacebook extends Facebook {
//    void login(String username, String password) {
//        // PASS
//    }
//}
