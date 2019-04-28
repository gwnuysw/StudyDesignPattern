package visitor;

import java.util.Iterator;
import java.util.ArrayList;

public class FileNameFindVisitor extends Visitor {
    private String name;
    private ArrayList found = new ArrayList();
    public FileNameFindVisitor(String name) {
        this.name = name;
    }
    public Iterator getFoundFiles() {
        return found.iterator();
    }
    public void visit(File file) {
        if (file.getName().contains(name)) {
            found.add(file);
        }
    }
    public void visit(Directory directory) {            
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
