public void getRecords() {
		String sqlStr = "Select * from mtb";
		List<Map<String,Object>> movlst = jdbcTemplate.queryForList(sqlStr);
		List<Movies> mov = new ArrayList<Movies>();
		movlst.forEach((movElt)->{
			int mid = (int)movElt.get("mid");
			String title = (String)movElt.get("title");
			String actor = (String)movElt.get("actor");
			Movies movie = new Movies(mid,title,actor); 
			System.out.println(movie);
		});
	}
