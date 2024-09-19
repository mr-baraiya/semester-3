// 84. Write a program to implement phone book dictionary using Binary Search Tree
// which provides following operations:
//  Add new entry in phone book,
//  Remove entry from phone book,
//  Search phone number
//  List all entries in ascending order of name and
//  List all entries in descending order of name

public class DS_LAB_84 {
    public static void main(String[] args) {
        PhoneBookBST phoneBook = new PhoneBookBST();

        // Add entries
        phoneBook.add("Alice", "1234567890");
        phoneBook.add("Bob", "0987654321");
        phoneBook.add("Charlie", "5555555555");

        // Search for a phone number
        System.out.println("Search for Alice: " + phoneBook.search("Alice"));

        // List all entries in ascending order
        System.out.println("\nPhone book entries in ascending order:");
        phoneBook.listAscending();

        // List all entries in descending order
        System.out.println("\nPhone book entries in descending order:");
        phoneBook.listDescending();

        // Remove an entry
        phoneBook.remove("Bob");

        // List all entries after removal in ascending order
        System.out.println("\nPhone book entries in ascending order after removal:");
        phoneBook.listAscending();
    }
}
class PhoneBookEntry {
    String name;
    String phoneNumber;
    PhoneBookEntry left, right;

    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.left = this.right = null;
    }
}

class PhoneBookBST {
    PhoneBookEntry root;

    public PhoneBookBST() {
        root = null;
    }

    // Add a new entry
    public void add(String name, String phoneNumber) {
        root = addRecursive(root, name, phoneNumber);
    }

    public PhoneBookEntry addRecursive(PhoneBookEntry root, String name, String phoneNumber) {
        if (root == null) {
            root = new PhoneBookEntry(name, phoneNumber);
            return root;
        }

        if (name.compareTo(root.name) < 0)
            root.left = addRecursive(root.left, name, phoneNumber);
        else if (name.compareTo(root.name) > 0)
            root.right = addRecursive(root.right, name, phoneNumber);

        return root;
    }

    // Remove an entry
    public void remove(String name) {
        root = removeRecursive(root, name);
    }

    public PhoneBookEntry removeRecursive(PhoneBookEntry root, String name) {
        if (root == null)
            return null;

        if (name.compareTo(root.name) < 0)
            root.left = removeRecursive(root.left, name);
        else if (name.compareTo(root.name) > 0)
            root.right = removeRecursive(root.right, name);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.name = findMinValue(root.right);
            root.right = removeRecursive(root.right, root.name);
        }

        return root;
    }

    public String findMinValue(PhoneBookEntry root) {
        String minValue = root.name;
        while (root.left != null) {
            minValue = root.left.name;
            root = root.left;
        }
        return minValue;
    }

    // Search for a phone number by name
    public String search(String name) {
        PhoneBookEntry result = searchRecursive(root, name);
        if (result != null) {
            return result.phoneNumber;
        } else {
            return "Entry not found";
        }
    }

    public PhoneBookEntry searchRecursive(PhoneBookEntry root, String name) {
        if (root == null || root.name.equals(name))
            return root;

        if (name.compareTo(root.name) < 0)
            return searchRecursive(root.left, name);

        return searchRecursive(root.right, name);
    }

    // List all entries in ascending order of name
    public void listAscending() {
        listAscendingRecursive(root);
    }

    public void listAscendingRecursive(PhoneBookEntry root) {
        if (root != null) {
            listAscendingRecursive(root.left);
            System.out.println(root.name + ": " + root.phoneNumber);
            listAscendingRecursive(root.right);
        }
    }

    // List all entries in descending order of name
    public void listDescending() {
        listDescendingRecursive(root);
    }

    public void listDescendingRecursive(PhoneBookEntry root) {
        if (root != null) {
            listDescendingRecursive(root.right);
            System.out.println(root.name + ": " + root.phoneNumber);
            listDescendingRecursive(root.left);
        }
    }
}