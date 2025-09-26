public class Counter {
	private int limit;
	private int count;
	
	public Counter(int limit){
		this.limit = limit;
		count = 0;
	}
	
	public Counter(int limit, int count){
		this.limit = limit;
		this.count = count;
	}
	// * Modify the code below so that
    // *
    // * 1. So that numbers less than 10 are padded when printed
    // * i.e. 01 : 59 : 59 rather than 1 : 59 : 59
	public int getCount(){
    //        if (count < 10 && limit <= 60) return "0" + count;
    //        else if (count < 10 && limit > 60) return "00" + count;
    //        else if (100 > count && count >= 10 && limit > 60) return "0" + count;
    //        else return "" + count;
        return count;
	}
	
	public void tick(){
		if(count == (limit-1)){
			count = 0;
		}
		else{
			count ++;
		}
	}
	
}