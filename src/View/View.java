package View;

import Controller.IOManager;

public abstract class View{
	
	private String viewContent = " ";
	private String title = " ";
	private String[] options = new String[] {};
	
	public void setViewContent(String content) {
		this.viewContent = content;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setOptions(String[] options) {
		this.options = options;
	}
	
	

    public void activate() {
    	printViewTitle();
    	printViewContent();
    	printOptions();
    }
    
    protected abstract void processUserInput(int input);
    
    
    public void printViewTitle() {
    	IOManager.printMenuTitle(title);
    }
    
    public void printOptions() {
    	IOManager.printMenuOptions(options);
    }
    
    public void printViewContent() {
		System.out.println(viewContent);
    }

}

