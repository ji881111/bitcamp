package bitcamp.java100;

public class Test18_6 {
    
    public static void main(String[] args) throws Exception{
        
        String email = "hong@test.com";
        
        System.out.println(email.matches("1hong@test.com"));
        
        System.out.println(email.matches(".+@.+\\..+"));
        
        System.out.println(email.matches("^\\D.+@.+\\..+"));
        
        String str = "홍길동(hong@text.com),임꺽정(leem@text.com),"
                + "유관순(yoo@text.com),안중근(ahn@text.com),윤봉길(yoon@text.com)";
        
        java.util.regex.Pattern pattern = 
                java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        
        java.util.regex.Matcher matcher = pattern.matcher(str);
        
        int startIndex = 0;
        while(matcher.find(startIndex)) {
            System.out.println(startIndex);
            String matchString = matcher.group();
            startIndex = matcher.end();
            
            System.out.println(matchString);
            
            //정규표현식
            
            
        }
    }
}
