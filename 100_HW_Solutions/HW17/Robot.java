import pkg.*;

class Robot {
	public int direction = 1; 
	public int c = 0; 
	private boolean fowardMoveBlocked(){
		if (pos == hall.length() - 1){
			return true;  
		}
		else
			return false;
	}
	
	private void move(){
		if (hall[pos] != 0){
			hall[pos] = hall[pos] - 1; 
		}
		else if (!fowardMoveBlocked())
			pos = pos + 1*direction; 
		else if(fowardMoveBlocked()){
			direction = direction * -1; 
		}
	}
	
	public int clearHall(){
		if (pos == 0){
			while (pos < hall.length()){
				move(); 
				c++
			}
		} else 
			while (pos != 0){
				move(); 
				c++
			}
		return c;  
	}
}
