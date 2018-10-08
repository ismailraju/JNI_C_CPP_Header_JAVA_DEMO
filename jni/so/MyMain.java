class MyMain{

	public native void printmsg();

	static{
		System.loadLibrary("prtmsg");
	}


	public static void main(String[] args){

		MyMain hello=new MyMain();
		hello.printmsg();
	}


}
