package coronavirus;

public class NumberOfCases {
	public static final int[] US_CASES = new int[] {
			654343,
			685541,
			716432,
			755162,
			771214,
			804406,
			829013,
			866148,
			903298,
			946921,
			975798,
			995288,
			1019823,
			1049431,
			1085171,
			1112259,
			1143651,
			1175044,
			1200794,
			1228735,
			1245857,
			1277606,
			1309660,
			1333145,
			1356629,
			1373706,
			1392976,
			1423641,
			1438426,
			1469385,
			1493694,
			1515311,
			1534453,
			1558175,
			1576950,
			1602193,
			1631457,
			1654906,
			1673806,
			1700877,
			1713245,
			1734279,
			1757161,
			1776077,
			1811101,
			1824910,
			1842883,
			1873701,
			1890365,
			1910392,
			1933527,
			1982210,
			2002358,
			2013887,
			2033865,
			2053304,
			2077142,
			2099376,
			2138427,
			2154711,
			2172175,
			2194476,
			2221298,
			2246676,
			2277847,
			2313796,
			2343403,
			2360593,
			2399963,
			2432978,
			2480014,
			2511784,
			2559399,
			2617847,
			2651497,
			2697634,
			2737609,
			2804731,
			2882126
	};
	
	public static final int[] US_DEATHS = new int[] {
		33490,
		35500,
		37969,
		40109,
		41356,
		43711,
		46147,
		48868,
		50954,
		53461,
		54941,
		56139,
		57601,
		60640,
		63277,
		64914,
		66511,
		68109,
		69116,
		71548,
		73145,
		76011,
		77964,
		79193,
		80422,
		81009,
		82276,
		84747,
		85699,
		87662,
		88930,
		90332,
		91268,
		92478,
		93858,
		95428,
		96989,
		98093,
		98831,
		99685,
		100030,
		101214,
		102795,
		103674,
		105329,
		105771,
		106323,
		107843,
		108567,
		109448,
		110520,
		111961,
		112368,
		112645,
		113470,
		114408,
		115572,
		116269,
		117420,
		117697,
		118064,
		118702,
		119481,
		120230,
		120971,
		121652,
		122079,
		122281,
		122846,
		123589,
		124552,
		126911,
		127747,
		128243,
		128557,
		129046,
		130284,
		131118,
		132002
	};
	
	public static final int[] CALIFORNIA_CASES = new int[] {
		27108,
		28156,
		29545,
		30831,
		31675,
		33897,
		35881,
		37787,
		39684,
		41382,
		42688,
		43784,
		45218,
		46506,
		48883,
		50463,
		52097,
		53732,
		54993,
		56306,
		58790,
		60635,
		62546,
		64686,
		66825,
		67986,
		69416,
		71081,
		73143,
		75040,
		77005,
		78859,
		80265,
		81903,
		83864,
		86227,
		88664,
		90777,
		92672,
		94444,
		96678,
		99873,
		101945,
		104108,
		107059,
		110038,
		113114,
		115908,
		117559,
		119842,
		123065,
		127133,
		129077,
		131029,
		134097,
		137144,
		139863,
		143533,
		147938,
		150099,
		152466,
		155809,
		159231,
		163541,
		167348,
		170923,
		174829,
		178223,
		184715,
		191416,
		196153,
		201113,
		206811,
		210672,
		215580,
		223981,
		232273,
		239159,
		247766
	};
	
	public static final int[] CALIFORNIA_DEATHS = new int[] {
		889,
		973,
		1057,
		1148,
		1178,
		1227,
		1332,
		1438,
		1534,
		1618,
		1695,
		1721,
		1793,
		1873,
		1956,
		2050,
		2121,
		2192,
		2215,
		2294,
		2379,
		2462,
		2546,
		2621,
		2695,
		2719,
		2789,
		2882,
		2974,
		3054,
		3154,
		3208,
		3240,
		3296,
		3420,
		3512,
		3609,
		3669,
		3737,
		3755,
		3773,
		3825,
		3918,
		3996,
		4088,
		4146,
		4242,
		4235,
		4320,
		4385,
		4458,
		4551,
		4610,
		4633,
		4664,
		4749,
		4854,
		4939,
		4994,
		5061,
		5083,
		5116,
		5203,
		5282,
		5355,
		5425,
		5496,
		5511,
		5564,
		5627,
		5726,
		5805,
		5867,
		5898,
		5934,
		5987,
		6088,
		6168,
		6277
	};
	
	public static final int[] LA_CASES = new int[] {
		10517,
		10895,
		11421,
		12051,
		12349,
		13823,
		15165,
		16449,
		17567,
		18545,
		19159,
		19567,
		20460,
		21017,
		22522,
		23233,
		24084,
		24936,
		25699,
		26238,
		27866,
		28665,
		29526,
		30384,
		31241,
		31703,
		32269,
		33247,
		34552,
		35447,
		36324,
		37374,
		38011,
		38466,
		39632,
		40975,
		42138,
		43085,
		44121,
		45034,
		46023,
		47875,
		48778,
		49860,
		51685,
		53746,
		54996,
		56118,
		57222,
		58267,
		59717,
		61118,
		62389,
		63850,
		64699,
		65957,
		67111,
		68959,
		70534,
		72066,
		73023,
		73832,
		75172,
		77285,
		78348,
		79676,
		81709,
		83414,
		86017,
		88512,
		89633,
		91577,
		93391,
		95385,
		97918,
		100958,
		103872,
		105665,
		107792
	};
	
	public static final int[] LA_DEATHS = new int[] {
		405,
		457,
		501,
		577,
		601,
		619,
		666,
		732,
		798,
		850,
		896,
		916,
		948,
		1004,
		1065,
		1119,
		1165,
		1212,
		1231,
		1260,
		1315,
		1369,
		1420,
		1468,
		1515,
		1531,
		1570,
		1617,
		1663,
		1711,
		1752,
		1793,
		1821,
		1842,
		1926,
		1976,
		2021,
		2051,
		2092,
		2108,
		2116,
		2145,
		2201,
		2241,
		2294,
		2339,
		2362,
		2391,
		2448,
		2489,
		2532,
		2571,
		2624,
		2646,
		2656,
		2710,
		2768,
		2818,
		2834,
		2894,
		2907,
		2926,
		2961,
		2993,
		3027,
		3066,
		3112,
		3121,
		3137,
		3172,
		3207,
		3247,
		3269,
		3285,
		3305,
		3331,
		3373,
		3405,
		3457
	};
}
