Object ob = "GeeksforGeeks";

if(ob instanceof String) {
    String str = (String) ob;  // Explicit cast required
    System.out.println("Length: " + str.length());
}