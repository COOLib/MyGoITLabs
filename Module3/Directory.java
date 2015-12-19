public class Directory {

private String name;
private Date date;
private ArrayList<File> files = new ArrayList<File>;

files.add(new File("AudioFile", 20000, new Date));
files.add(new File("TextFile", 5000, new Date));
files.add(new File("Picture", 150000, new Date));

public Directory(String name, Date date) {
this.name = name;
this.date = date;
}

public boolean isEmpty(){return false;}

public String namesOfContainedFiles(){
for (File file : files)
return file.getName;
}
}