package chap03;
class OperatorEx15 { 
      public static void main(String[] args) { 
            char lowerCase = 'a'; 
            char upperCase = (char)(lowerCase - 32); // a:97, A:65 => 97 - 32 = 65

            System.out.println(upperCase); 
      } 
} 
