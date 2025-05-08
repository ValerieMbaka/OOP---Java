/* Create a class called MemberList that has an array of string to hold the names of 10 members as its instance variable.
Use a default constructor to allow a user to populate the names of members using console input/output. Make use of another method
called searchMember in which a user keys in a name and the method checks out if the name is among the members in the list or not.
Make use of yet another method called viewMembers that uses foreach loop to output all members in the list.
Instantiate the class and invoke the search and output method. */

import java.util.Scanner;
public class MemberList {
        private String[] members = new String[10];
        private static Scanner input = new Scanner(System.in);
        
        public MemberList() {
                for (int i = 0; i < members.length; i++) {
                        System.out.println("Enter the name of the member " + (i + 1) + ": ");
                        members[i] = input.nextLine();
                }
        }
        
        public void searchMember() {
                String name;
                System.out.println("Enter the name of the member to search: ");
                name = input.nextLine();
                for (String member: members) {
                        if (member.equalsIgnoreCase(name)) {
                                System.out.println("Member " + name + " is in the list.");
                                return;
                        }
                }
                
                System.out.println("Member " + name + " is not in the list.");
        }
        
        public void viewMembers() {
                System.out.println("Members in the list are: ");
                for (String member: members) {
                        System.out.println(member);
                }
        }
        
        public static void main(String[] args) {
                MemberList list1 = new MemberList();
                list1.searchMember();
                list1.viewMembers();
        }
        
}
