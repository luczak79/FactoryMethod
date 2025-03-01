import java.awt.*;
import java.awt.event.*;
import java.util.*;
//swing classes
import javax.swing.*;
import javax.swing.event.*;

//this is a simple adapter class to
//convert List awt methods to Swing methods

public class JawtList extends JScrollPane 
   implements ListSelectionListener, awtList
{
   private JList listWindow;
   private JListData listContents;
   private ListSelectionListener listener;
//-----------------------------------------
   public JawtList(int rows)
   {
      listContents = new JListData();
      listWindow = new JList(listContents);
      listWindow.setPrototypeCellValue("Abcdefg Hijkmnop");
      getViewport().add(listWindow);
      
   }
//-----------------------------------------
   public int getSelectedIndex() {
       return listWindow.getSelectedIndex();
   }
//-----------------------------------------
   public void add(String s)
   {
      listContents.addElement(s);
   }
//-----------------------------------------
   public void remove(String s)
   {
      listContents.removeElement(s);
   }
//-----------------------------------------
   public String[] getSelectedItems()
   {
      Object[] obj = listWindow.getSelectedValues();
      String[] s = new String[obj.length];
      for (int i =0; i<obj.length; i++) 
            s[i] = obj[i].toString();
      return s;
   }
//-----------------------------------------
   public void addListSelectionListener(ListSelectionListener lsl)
   {
    listener = lsl;
    listWindow.addListSelectionListener(this);
   }
//-----------------------------------------
   public void valueChanged(ListSelectionEvent e)
   {
      listener.valueChanged(e);
   }
   public void clear() {
      listContents.clear();
   }
   
}
//  =========================================
class JListData extends AbstractListModel
{
   private Vector data;
//-----------------------------------------
   public JListData()
   {
      data = new Vector();
   }
   public void clear() {
      data = new Vector();
   }
//-----------------------------------------
   public int getSize()
   {
      return data.size();
   }
//-----------------------------------------
   public Object getElementAt(int index)
   {
      return data.elementAt(index);
   }
//-----------------------------------------
   public void addElement(String s)
   {
      data.addElement(s);
      fireIntervalAdded(this, data.size()-1, data.size());
   }
//-----------------------------------------
   public void removeElement(String s)
   {
      data.removeElement(s);
      fireIntervalRemoved(this, 0, data.size());
   }
}

