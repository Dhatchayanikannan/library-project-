import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class UserLibraryPortal {
static List<String> li=new ArrayList<String>();
static Map<String, List<String>> mp=new HashMap<>();
static String userName;
static String lang;


public static void getUserName(){
System.out.println("Enter the username");
Scanner sc=new Scanner(System.in);
userName = sc.nextLine();
li.add(userName);
System.out.println("Welcome! "+userName);

}
public static void authorNames() {
List<String> javaauth=new ArrayList<String>();
javaauth.add("Joshua bloch");
javaauth.add("Horst mann");
mp.put("java",javaauth);
List<String> cauth=new ArrayList<String>();
cauth.add("Brain W.");
cauth.add("Kernighan");
mp.put("c",cauth);

}

public static void getBooks() {
System.out.println("Mention the languge to search the books ");
Scanner s=new Scanner(System.in);
lang = s.nextLine();
System.out.println("Here the books avaliable for you according to the author");
System.out.println("-----------");
Set<Entry<String, List<String>>> entrySet = mp.entrySet();
for (Entry<String, List<String>> entry : entrySet) {
String langkey = entry.getKey();
if (langkey.equalsIgnoreCase(lang)) {
List<String> books = entry.getValue();
for (int i = 0; i < books.size(); i++) {
int j=i+1;
System.out.println("   "+j+"."+books.get(i));
}
}
}
}

public static void returndate() {
int date=24+5;
System.out.println("If you are lending any book today then the returning day is");
System.out.println(date+" november");
System.out.println("----------");
}
public static void main(String[] args) {
System.out.println("Welcome to the User Library Portal");
System.out.println("------------------------------------");
System.out.println();
System.out.println();
getUserName();
authorNames();
getBooks();
returndate();

}
}

