/**
 * Simulates an item in the grocery store
 * @author Brandon Ong
 * period 3
 *
 */
public class Item {
	private String name;//item name
	private double price;//item unit price in dollars
	private double discount;//item discount in dollars
	
	/**
	 * Initializes the item name, price and discount
	 * @param name - item name
	 * @param price - item price in dollars
	 * @param discount - discount in dollars
	 */
	public Item(String name, double price, double discount) {
		//Your code goes here
		this.name=name;
		this.price = price;
		this.discount = discount;
	}
	/**
	 * Returns the item name
	 * @return item name
	 */
	public String getName() {
		//Your code goes here
		return name;
	}
	/**
	 * Returns the item price in dollars
	 * @return item price
	 */
	public double getPrice() {
		//Your code goes here
		return price;
	}
	/**
	 * Returns the item discount in dollars
	 * @return item discount 
	 */
	public double getDiscount() {
		//Your code goes here
		return discount;
	}
	/**
	 * Returns the value passed as a string in the dollar and cents format ####.##
	 * @param value - value to be converted to dollar and cents format
	 * @return String in dollar and cents format
	 */
	public String valueToString(double value) {
		//Your code goes here
		String n=""+Math.round(value*100.00)/100.0;
		if (n.substring(n.indexOf(".")).length()<3)
		n=n+"0";
		return n;
	}
	/**
	 * Returns a string with item name, price and discount in the format
	 * name item price (-discount). One item will get Print per line.
	 * For example: Spinach $3.98 (-$1.05)
	 * @return - item name, price, and discount
	 */
	public String toString() {
		//Your code goes here
		return getName()+" $"+valueToString(getPrice())+" (-$"+valueToString(getDiscount())+")\n";	

	}
}
