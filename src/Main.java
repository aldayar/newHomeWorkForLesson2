public class Main {
    public static void main(String[] args) {


            System.out.println(canGoForAWalk(generateRandomAge(), generateRandomAge()));
            System.out.println(canGoForAWalk(generateRandomAge(), generateRandomAge()));
            System.out.println(canGoForAWalk(generateRandomAge(), -generateRandomAge()));
            System.out.println(canGoForAWalk(generateRandomAge(), generateRandomAge()));
            System.out.println(canGoForAWalk(generateRandomAge(), generateRandomAge()));


        }
        public static String canGoForAWalk(int age, int temperature) {
            if (age <= 20 && age <= 45 && temperature <= -20 && temperature <= 30) {
                return "Можно итди гулять! ";
            }
            if (age <= 20 && temperature == 0 && temperature <= 28) {
                return "Можно итди гулять! ";
            }
            if (age >45 && temperature<=-10 && temperature<=25){
                return "Можно итди гулять! ";
            }else{
                return "оставайтесь дома! ";
            }



        }
        public static int generateRandomAge(){
            return (int) (Math.random()*40)+1;
    }
}