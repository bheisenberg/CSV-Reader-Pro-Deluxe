    import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
    import org.antlr.v4.runtime.tree.*;
    
    
    //Created by Brian Eisenberg, Diego Holguin and Nick Rizzo
    
    public class LogGrammarRunner 
    {
    	private ArrayList<String[]> CSV;
    	
    	/*public class GrammarData {
    		String input;
    		int line;
    		
    		public GrammarData (String input, int line) {
    			this.input = input;
    			this.line = line;
    		}
    		
    		public void printGrammar () {
    			System.out.println("["+ this.line+ "] \"" +this.input+ "\" = ");
    		}
    		
    		public void addGrammar () {
    		}
    	}*/
    	
    	public void LoadText () {
    		ArrayList<String> passed = new ArrayList<String>();
            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            JScrollPane scrollFrame = new JScrollPane(panel);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(320,960);
            frame.add(scrollFrame);
            
    	    try (BufferedReader in = new BufferedReader(new FileReader("Strings.txt"))) {
    	    	String line;
    	    	int lineNo = 0;
    	    	while ((line = in.readLine()) != null) {
    	    		lineNo++;
    	    		//CSV.add(ParsedCSVLine(line));    	}
    	    		ParsedCSVLine(line);
    	    	}
    	    } catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	    /*File f = new File("passed.txt");
    	    if(!f.exists()) {
    	    	File.cre
    	    }*/
    	    
        	try(PrintWriter out = new PrintWriter("passed.txt")) {
        	    for (String passedString: passed) {
        	        out.println(passedString);
        	    }
        	} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    	
    	//String[] ParsedCSVLine (String inputString) {
    	void ParsedCSVLine (String inputString) {
    		System.out.println("Parsing line: "+inputString);
    		
            ANTLRInputStream input = new ANTLRInputStream(inputString);

            CSVLexer lexer = new CSVLexer(input);

            BufferedTokenStream tokens = new BufferedTokenStream(lexer);

            CSVParser parser = new CSVParser(tokens);
            
            TokenSource tokenSource = tokens.getTokenSource();
            
            Token currentToken = tokenSource.nextToken();
            

            
            /*for(String token: parser.getTokenNames()) {
            	System.out.println(token);
            }*/
            
            while(currentToken.getType() != Recognizer.EOF) {
            	System.out.println(currentToken.getText());
            	currentToken = tokenSource.nextToken();
            }
            
            
            String text = "";
            
            ParseTree tree = parser.r(); // begin parsing at rule 'r'
            //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
            //System.out.println(input+ " : " +parser.getNumberOfSyntaxErrors());
            
            /*boolean success = (parser.getNumberOfSyntaxErrors() > 0) ? false : true;
            
            TreeViewer viewr = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),tree);
            viewr.setScale(1.5);//scale a little
            viewr.setAlignmentX(JComponent.CENTER_ALIGNMENT);
            panel.add(viewr);
            frame.add(panel);
            frame.setVisible(true);*/
            //show AST in GUI
            //System.out.println(tokens);

            //return new String[] {};
    	}
    	
        
    }