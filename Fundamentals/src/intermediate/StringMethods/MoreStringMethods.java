public class MoreStringMethods {
    public static void main(String args[]) {

        String s = "dockerkubernetesdockerkubernetes";
        System.out.println(s.indexOf("docker", 5)); 


        String a = "Bacon";
        String b = "Docker";
        String c = "    Kubernetes     ";

        System.out.println(a.concat(b));
        System.out.println(b.replace('D', 'd'));
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(c.trim());

    }
}
