class InnerBubbleSort {
    int[] a = {10,56,9,496,6,3543};
    void BubbleSort(){
        int l = a.length;
        for(int i = 0; i<l; i++){
            for(int j = 0; j<l-i-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
    void display(){
        int l = a.length;
        for(int i = 0;i<l; i++){
            System.out.print(a[i] + " ");
        }System.out.println("");
    }    
}



public class BubbleSort {
    public static void main(String[] args) {
        InnerBubbleSort a = new InnerBubbleSort();
        a.display();
        a.BubbleSort();
        a.display();
        System.out.println("hi");
    }
}

