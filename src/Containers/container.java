package Containers;
import Item.item;

public class container extends item{
	
//declaring variables for products 
	private double small_height, small_wide, small_lenght ;
	private double big_height, big_wide, big_lenght;{
	
//small settings		
		this.small_height = 2.59 ;
		this.small_lenght = 6.06 ;
		this.small_wide = 2.43 ;
		
//big settings
		this.big_height = 2.59 ;
		this.big_lenght = 12.01 ;
		this.big_wide = 2.43 ; 
	}
	
public void VolumeCalculationSmall() {
	double TotalVolumeSmall;
	TotalVolumeSmall = this.small_height * this.small_lenght * this.small_wide ;
}	

}
