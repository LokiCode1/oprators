class  PopulationProjection
{
	public static void main(String[] args) 
	{
		System.out.println("Current Population is 312032486");
		long currpop = 312032486;
		long sec = (365*24*60*60)*5;
		long birth = sec/7;
		long death = sec/13;
		long imm = sec/45;
		long newpop = currpop + birth - death + imm ;
		System.out.println("Population After 5 Years:"+ newpop );
		
	}
}
