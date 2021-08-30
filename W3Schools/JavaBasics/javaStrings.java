public class javaStrings {
    public static void main(String[] args) {
        
        String txt = "Please locate where 'locate' occurs!";
        String txt2 = "!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        System.out.println(txt.length()); // 36

        System.out.println(txt + txt2);
        System.out.println(txt.concat(txt2));

    }
}
