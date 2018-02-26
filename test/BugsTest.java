

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.Assert;
import org.junit.Test;
import testex3.MyArrayListWithBugs;

/**
 *
 * @author Whalecum
 */
public class BugsTest {
    
    @Test
    public void addTest(){
        MyArrayListWithBugs bugs = new MyArrayListWithBugs();
        Assert.assertEquals(0, bugs.size());
        bugs.add("addTest");
        Assert.assertEquals(1, bugs.size());
        
    }
    
    @Test
    public void getTest(){
        MyArrayListWithBugs bugs = new MyArrayListWithBugs();
        bugs.add("getTest");
        Assert.assertEquals(1, bugs.get(1));
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void getFailTest(){
        MyArrayListWithBugs bugs = new MyArrayListWithBugs();
        bugs.get(1);
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void addFailTest(){
        MyArrayListWithBugs bugs = new MyArrayListWithBugs();
        bugs.add(3, "Fail");
      
    }
    
    @Test
    public void removeTest(){
        MyArrayListWithBugs bugs = new MyArrayListWithBugs();
        bugs.add("removeTest");
        Assert.assertEquals("removeTest", bugs.remove(0));
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void removeFailTest(){
        MyArrayListWithBugs bugs = new MyArrayListWithBugs();
        bugs.remove(3);
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
