import java.util.*;
class cpu
	{
	int price=10;
	class processor
		{
		int core=2;
		String manufacturer="Intel";
		}
	static class RAM
		{
		int mem=4;
		String manufacturer="Corsair";
		}
	public static void main(String args[])
		{
		cpu c=new cpu();
		cpu.processor p=c.new processor();
		cpu.RAM r=new cpu.RAM();
		System.out.println(c.price+" "+p.core+p.manufacturer+" "+r.mem+r.manufacturer);
		}
	}

