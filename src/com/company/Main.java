package com.company;

import com.company.pojo.User;
import java.util.*;

public class Main {

    public static void socialOperation() {
        Scanner scanner = new Scanner(System.in);
        Map<String, User> userMap = new HashMap();
        Map<User, List<User>> friendMap = new HashMap<>();
        List<User> list = new ArrayList<>();

        while (true) {

            System.out.println("Welcome to Social Connection App, Please input your choice (any one) ->");
            System.out.println("CREATE (Create User)\n" +
                    "EDIT (Edit User)\n" +
                    "DELETE (Delete User)\n" +
                    "CONNECT (Connect two users)\n" +
                    "FRIEND (Connected friend each other)\n" +
                    "SHOW (List all connections of given user)\n" +
                    "EXIT (Close the application)\n");
            System.out.println("Please Enter your choice: _ ");

            String choice = scanner.next();
            User user = new User();

            switch (choice) {

                case "CREATE":
                    System.out.print("Name of User : ");
                    user.setName(scanner.next());
                    System.out.print("Email of User : ");
                    user.setEmail(scanner.next());
                    System.out.print("Age : ");
                    user.setAge(scanner.nextInt());
                    System.out.print("User has been created and generated ID is : ");
                    String id = scanner.next();
                    user.setId(id);
                    userMap.put(id, user);
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case "EDIT":
                    System.out.print("Please Enter User ID : ");
                    String userId1 = scanner.next();
                    User user1 = userMap.get(userId1);
                    System.out.println(user1.getId());
                    System.out.print("Name of User : ");
                    user1.setName(scanner.next());
                    System.out.print("Email of User : ");
                    user1.setEmail(scanner.next());
                    System.out.print("Age : ");
                    user1.setAge(scanner.nextInt());
                    System.out.println("User has been updated");
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case "DELETE":
                    System.out.print("GENERATED ID : ");
                    userMap.remove(scanner.next());
                    System.out.println("User has been deleted");
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case "CONNECT":

                    System.out.print("GENERATED ID of First User : ");
                    String userId = scanner.next();
                    User user4 = userMap.get(userId);

                    System.out.print("GENERATED ID of Second User:");
                    String userId2 = scanner.next();
                    User user2 = userMap.get(userId2);

                    if (friendMap.get(userId) != null) {

                        list.add(user2);

                    } else {

                        list.add(user2);
                    }

                    friendMap.put(user4,list);

                    System.out.println("Users are now connected");
                    System.out.println("--------------------------------------------------------------------");
                    break;
                case "FRIEND":
                    for (Map.Entry<User, List<User>> entry : friendMap.entrySet()) {
                        System.out.println("Friend Id : " + entry.getKey() + " \nConnected Friends : " + entry.getValue());
                    }
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case "SHOW":
                    System.out.println("List all connections of given user");
                    List<User> list1 = new ArrayList<>(userMap.values());
                    for (User user3 : list1) {
                        System.out.println(user3);
                        System.out.println("--------------------------------------------------------------------");
                    }
                    break;
                case "EXIT":
                    System.out.println("Close the application");
                    System.out.println("----------------------------THE END---------------------------------");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main.socialOperation();

    }
}
