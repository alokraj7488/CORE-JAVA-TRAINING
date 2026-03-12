class JavaApplication {
	public static void execution() {
		Oracle oracle = new Oracle();
		oracle.url = "WWW.oracle.com";
		oracle.username = "raja";
		oracle.password = "raja@143";
		oracle.displayOracleDBInfo();
		oracle.connection();
		oracle.crudOperation();
		oracle.disconnection();

		MySQL mySQL = new MySQL();
		mySQL.url = "WWW.mySQL.com";
		mySQL.username = "rani";
		mySQL.password = "rani@143";
		mySQL.displayMySQLDBInfo();
		mySQL.connection();
		mySQL.crudOperation();
		mySQL.disconnection();

	}

}