package com.class27;

public abstract class File {
	public static void main(String[] args) {
		File obj;
		obj=new JavaFile();
		obj.open();
		obj.close();
		obj.edit();
		
		obj=new WordFile();
		obj.open();
		obj.close();
		obj.edit();
		
		obj=new PDFFile();
		obj.open();
		obj.close();
		obj.edit();
		
		
		
	}
public void close() {
	System.out.println("close");
}

public void edit() {
	System.out.println("edit");
}
public abstract void open();
}
class JavaFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("we need notepad");
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open.doc file");
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("need microsoft word be installed");
	}
	
}
