package patika;

public class Arrays_Topla {
    public static void main(String[] args) {

        int[] arr={1,3,5,7,9,11,13,15,17};
        int sum=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            sum+=arr[i];

        }
        System.out.println("Toplam:"+sum/arr.length);
    }
}
