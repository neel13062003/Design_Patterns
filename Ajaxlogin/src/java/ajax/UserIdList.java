
package ajax;

import java.util.ArrayList;

public class UserIdList {

    private ArrayList<String> userIdList = new ArrayList<>();

    public ArrayList<String> getList() {
        return userIdList;
    }

    public UserIdList() {
        userIdList.add("a@xyz.com");
        userIdList.add("b@xyz.com");
        userIdList.add("c@xyz.com");
        userIdList.add("abc@xyz.com");
        userIdList.add("xyz@xyz.com");
        userIdList.add("def@xyz.com");

    }

    public void addld(String userld) {
        userIdList.add(userld);
    }

    public boolean isPresent(String userld) {
        boolean status = false;
        for (String id : userIdList) {
            if (id.compareTo(userld) == 0) {
                status = true;
                break;

            }
        }
        return status;
    }
}
