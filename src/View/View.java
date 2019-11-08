package View;

import java.util.ArrayList;

import Controller.IOManager;

public abstract class View{
	
	private String viewContent = " ";
	private String title = " ";
	private ArrayList<String> options = new ArrayList<String>();
	
	public void setViewContent(String content) {
		this.viewContent = content;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setOptions(ArrayList<String> options) {
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
    	if (options.size() != 0) {
    		IOManager.printMenuOptions(options);
    	}
    }
    
    public void printViewContent() {
//		System.out.println(viewContent);
    	IOManager.printMenuContent(viewContent);
    }

}

