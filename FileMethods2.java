import java.io.*;
class FileMethods2{
	public static void main(String args[]){
		for(int i=0;i<args.length;i++){
			File f=new File(args[i]);
			File f1=new File("renfile");
			if(f.exists()){
				System.out.println(f+" does exists");
				System.out.println("Its size is "+f.length()+" bytes");
				f.renameTo(f1);
				System.out.println("Rename file name:"+f1);
				System.out.println("Deleting the renamed File:"+f1);
				System.out.println("============================================");
				f1.delete();
			}else{
				System.out.println(f+" does not exists");
			}
		}
	}
} 