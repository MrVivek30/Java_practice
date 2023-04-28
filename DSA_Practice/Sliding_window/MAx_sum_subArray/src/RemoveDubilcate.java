import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDubilcate {

    public static void main(String[] args) {
        String s="abchsjjwwjwdikd";
        Set<Character>list=new HashSet<>();

        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        System.out.println(list);
    }
}
