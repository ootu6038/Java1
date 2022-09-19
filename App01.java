public class App01 {
    public static void main(String[] args) {
        int cnt = 10;
        callByValue(cnt);
        System.out.println(cnt); //②値渡しのため、cntは10のまま
    }

    public static void callByValue(int cnt){
        cnt += 5;
        System.out.println(cnt); //①10+5=15 が表示される
    }
}