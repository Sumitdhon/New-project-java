package Chapter9;

public class arraysofstrings {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Orange"};
String key = "Banana";
boolean found = false;
for (int i = 0; i < arr.length; i++) {
    if (arr[i].equals(key)) {
        System.out.println("Found at index " + i);
        found = true;
    }
}
if (!found) {
    System.out.println("Not found");
}
    System.out.println();
}
}