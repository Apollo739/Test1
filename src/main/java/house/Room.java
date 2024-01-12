package house;

public abstract class  Room {
    String name;
int windowCount;
int doorCount = 1;
String furniture;
@Override
public String toString (){
 return name + windowCount + doorCount + furniture;
}
public Room (int doorCount){
  this.doorCount  = doorCount;
}
    }

