package week3;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    int dem=-1;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void qtyOrdered(){
        dem++;
        if(dem<8) System.out.println("Đã được thêm vào Order");
        if(dem==8) System.out.println("Đã được thêm vào Order,Order sắp đầy"); 
        if(dem==9) System.out.println("Đã được thêm vào Order,Order đã đầy"); 
        if(dem>9) System.out.println("Đã đầy, không thể thêm");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        qtyOrdered();
        if(dem<=9) {
            itemsOrdered[dem]=disc;
        }else dem--;   
    }

    public float totalCost(){
        float tong=0;
        for(int i=0;i<=dem;i++){
            tong +=itemsOrdered[i].getCost();
        }
        return tong;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=0;i<=dem;i++){
            if(itemsOrdered[i]==disc){
                itemsOrdered[i]=itemsOrdered[i+1];
            }        
        } 
        dem--;
    }

}
