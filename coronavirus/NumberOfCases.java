package coronavirus;

public class NumberOfCases {
    public static final int[] US_CASES = new int[]{
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
            2882126,
            2928675,
            2959188,
            3003464,
            3061925,
            3098959,
            3184938,
            3240268,
            3324356,
            3408445,
            3430726,
            3483362,
            3549519,
            3639653,
            3699618,
            3795471,
            3859517,
            3925863,
            3973801,
            4040721,
            4113939,
            4196748,
            4308427,
            4371839,
            4384069,
            4452864,
            4515586,
            4600388,
            4653065,
            4736014,
            4783070,
            4822793,
            4877530,
            4948156,
            4991802,
            5050976,
            5131802,
            5166319,
            5212499,
            5264915,
            5318530,
            5368675,
            5431091,
            5514382,
            5539841,
            5583874,
            5621396,
            5662885,
            5710773,
            5760769,
            5812607,
            5856346,
            5886759,
            5924778,
            5967798,
            6015317,
            6086099,
            6129714,
            6173328,
            6211036,
            6248744,
            6286452,
            6324160,
            6361868,
            6399576,
            6437284,
            6474992,
            6512700,
            6550408,
            6588124,
            6594419,
            6651730,
            6692091,
            6718969,
            6758987,
            6803754,
            6844149,
            6897689,
            6951229,
            7004768,
            7014816,
            7056392,
            7109750,
            7148986,
            7199425,
            7242015,
            7284605,
            7327197,
            7371240,
            7420300,
            7469087,
            7507524,
            7600846,
            7611484,
            7649024,
            7686565,
            7756318,
            7793305,
            7852328,
            7945505,
            7964873,
            8002023,
            8052784,
            8100553,
            8165007,
            8235136,
            8313754,
            8387798,
            8394633,
            8468223,
            8524139,
            8617314,
            8675170,
            8820168,
            8839609,
            8897789,
            8969980,
            9053778,
            9142798,
            9227860,
            9386409,
            9409776,
            9525519,
            9578835,
            9709864,
            9811113,
            9944900,
            10165626,
            10212412,
            10302758,
            10455013,
            10615210,
            10772286,
            10918789,
            11198629,
            11301572,
            11404516,
            11561422,
            11709384,
            11896039,
            12137507,
            12346783,
            12541141,
            12598974,
            12811433,
            12979910,
            13218845,
            13295263,
            13501954,
            13641996,
            13760186,
            14035468,
            14072037,
            14108606,
            14342948,
            14577291,
            14809927,
            14983425,
            15159529,
            15521091,
            15594534,
            15822734,
            16039393,
            16544789,
            16551634,
            16777408,
            16943897,
            17147390,
            17401787,
            17627070,
            17889578,
            18078925,
            18286330,
            18684628,
            18917218,
            19001136,
            19210166,
            19430000,
            19436907,
            19573847,
            19793361,
            20000000,
            20216991,
            20617346,
            20653265,
            20906094,
            21115036,
            21355530,
            21636315,
            21859409,
            22141943,
            22469545,
            22702350,
            22917334,
            23152069,
            23374560,
            23631450,
            23857343,
            24104425,
            24308366,
            24626376,
            24628198,
            24810979,
            25001446,
            25198489,
            25392966,
            25579523,
            25702125,
            25870814,
            26012818,
            26170089,
            26343099,
            26500000,
            26700000,
            26850000,
            26975000,
            27041249,
            27162000,
            27283993,
            27412193,
            27567204,
            27612687,
            27709917,
            27805113,
            27922062
    };

    public static final int[] US_DEATHS = new int[]{
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
            132002,
            132236,
            132418,
            132678,
            133445,
            134030,
            135281,
            136022,
            136879,
            137736,
            137839,
            138331,
            139314,
            140442,
            141168,
            142445,
            143036,
            143504,
            144050,
            145125,
            146378,
            147667,
            149314,
            149849,
            149945,
            151495,
            152726,
            154541,
            155721,
            157278,
            158081,
            158463,
            159410,
            161095,
            161936,
            163149,
            164722,
            165269,
            165766,
            166726,
            168012,
            169276,
            170775,
            172318,
            172762,
            173339,
            174076,
            175408,
            176628,
            177669,
            179541,
            180386,
            180724,
            181486,
            182832,
            183959,
            185692,
			186458,
            187225,
            188052,
            188879,
            189706,
            190553,
            191360,
            192187,
            193014,
            193841,
            194668,
            195495,
            196328,
            196412,
            197675,
            198239,
            198643,
            199418,
            200852,
            201699,
            202505,
            203311,
            204118,
            204208,
            204828,
            205914,
            206895,
            207812,
            208381,
            208950,
            209521,
            210058,
            211188,
            212151,
            212912,
            214277,
            214361,
            214787,
            215213,
            216411,
            217163,
            218031,
            219282,
            219378,
            219800,
            220308,
            221038,
            222092,
            223045,
            223951,
            224730,
            224844,
            225451,
            226273,
            227773,
            228577,
            230011,
            230126,
            230550,
            231213,
            232305,
            233405,
            234425,
            235908,
            236127,
            236786,
            237166,
            238907,
            239943,
            241190,
            243186,
            243419,
            243820,
            244849,
            246380,
            247859,
            248835,
            251132,
            251579,
            252026,
            252934,
            254463,
            256609,
            259053,
            261101,
            262390,
            262757,
            264217,
            266289,
            269302,
            269908,
            271456,
            272519,
            273160,
            275895,
            276437,
            276979,
            280189,
            283399,
            286024,
            287825,
            288906,
            292603,
            293496,
            296745,
            299692,
            305058,
            305088,
            306706,
            308091,
            311111,
            314694,
            317929,
            320845,
            323404,
            324916,
            330824,
            334218,
            335651,
            338263,
            339000,
            339938,
            341138,
            343270,
            347000,
            350778,
            356445,
            356743,
            358704,
            360088,
            362139,
            366662,
            370009,
            374242,
            378297,
            381497,
            383275,
            385464,
            389790,
            394296,
            398155,
            401868,
            405266,
            408620,
            408623,
            411534,
            415926,
            420318,
            424191,
            427713,
            429490,
            431818,
            435475,
            439561,
            443837,
            447000,
            450000,
            453000,
            455750,
            458691,
            462236,
            467518,
            470824,
            474290,
            474939,
            476658,
            479839,
            483892
    };

    public static final int[] CALIFORNIA_CASES = new int[]{
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
            247766,
            251720,
            253283,
            264832,
            273912,
            284138,
            292914,
            302603,
            311482,
            320362,
            325915,
            334920,
            346445,
            355045,
            364834,
            374522,
            381164,
            387322,
            398751,
            409370,
            421462,
            431290,
            443946,
            451865,
            452753,
            463635,
            473500,
            486364,
            493396,
            501373,
            508313,
            512606,
            520841,
            527088,
            530606,
            541695,
            549941,
            555778,
            561379,
            574240,
            586430,
            594506,
            602721,
            613532,
            620271,
            625307,
            634388,
            640290,
            647224,
            653469,
            660007,
            664988,
            668324,
            676525,
            682365,
            687394,
            692952,
            698800,
            704649,
            708791,
            712933,
            717075,
            721217,
            725359,
            729501,
            733644,
            737787,
            741930,
            746073,
            750220,
            751376,
            755705,
            758781,
            761140,
            765647,
            768589,
            771961,
            776351,
            780741,
            785130,
            786130,
            790729,
            793472,
            796817,
            800213,
            803330,
            806447,
            809566,
            813055,
            816377,
            819571,
            822689,
            829563,
            829563,
            832770,
            835977,
            838671,
            842113,
            845816,
            852230,
            852443,
            854799,
            857689,
            861953,
            865394,
            868532,
            871630,
            874450,
            875409,
            880064,
            884519,
            887614,
            893856,
            900889,
            903820,
            906106,
            911009,
            915673,
            920025,
            924129,
            930048,
            932162,
            935534,
            941119,
            946546,
            951649,
            958214,
            965941,
            969724,
            974950,
            982842,
            991225,
            995676,
            1006160,
            1017222,
            1024001,
            1030780,
            1044001,
            1054635,
            1066251,
            1080107,
            1095908,
            1105022,
            1110745,
            1131851,
            1148080,
            1162096,
            1167863,
            1181586,
            1197876,
            1208304,
            1230425,
            1238671,
            1246917,
            1266872,
            1286827,
            1309196,
            1330724,
            1351199,
            1386107,
            1421089,
            1452878,
            1486873,
            1546963,
            1548845,
            1576445,
            1615692,
            1647554,
            1699276,
            1751091,
            1804417,
            1839294,
            1866392,
            1940781,
            2008717,
            2009562,
            2046931,
            2080000,
            2100672,
            2129149,
            2195960,
            2200000,
            2261989,
            2325331,
            2326775,
            2356724,
            2378980,
            2453115,
            2496990,
            2534673,
            2574314,
            2621708,
            2663060,
            2692542,
            2745931,
            2799189,
            2839166,
            2880031,
            2919876,
            2951599,
            2994748,
            2995906,
            3053479,
            3073591,
            3098963,
            3122741,
            3144592,
            3162518,
            3193136,
            3214777,
            3233942,
            3254366,
            3270000,
            3290000,
            3305000,
            3315000,
            3336176,
            3348543,
            3362768,
            3379596,
            3387516,
            3395017,
            3411649,
            3422171,
            3430962
    };

    public static final int[] CALIFORNIA_DEATHS = new int[]{
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
            6277,
            6321,
            6335,
            6373,
            6464,
            6575,
            6723,
            6860,
            6946,
            7032,
            7053,
            7099,
            7243,
            7374,
            7490,
            7613,
            7702,
            7716,
            7773,
            7891,
            8050,
            8208,
            8391,
            8451,
            8455,
            8550,
            8716,
            8913,
            9018,
            9233,
            9365,
            9400,
            9508,
            9709,
            9808,
            10029,
            10222,
            10313,
            10379,
            10476,
            10656,
            10813,
            10999,
            11149,
            11231,
            11246,
            11343,
            11527,
            11692,
            11834,
            11990,
            12142,
            12152,
            12263,
            12419,
            12551,
            12697,
            12817,
            12938,
            13040,
            13142,
            13244,
            13346,
            13448,
            13550,
            13652,
            13754,
            13856,
            13958,
            14062,
            14096,
            14270,
            14333,
            14384,
            14467,
            14614,
            14728,
            14823,
            14918,
            15014,
            15016,
            15071,
            15208,
            15314,
            15409,
            15474,
            15539,
            15606,
            15638,
            15795,
            15902,
            15993,
            16121,
            16121,
            16152,
            16184,
            16269,
            16364,
            16435,
            16570,
            16570,
            16575,
            16588,
            16657,
            16758,
            16835,
            16908,
            16957,
            16968,
            16990,
            17066,
            17192,
            17264,
            17323,
            17343,
            17357,
            17398,
            17476,
            17542,
            17569,
            17638,
            17665,
            17670,
            17696,
            17752,
            17815,
            17871,
            17945,
            17965,
            17975,
            18007,
            18076,
            18108,
            18140,
            18221,
            18242,
            18263,
            18304,
            18359,
            18467,
            18560,
            18652,
            18708,
            18725,
            18779,
            18881,
            18980,
            19024,
            19090,
            19132,
            19151,
            19214,
            19272,
            19330,
            19462,
            19594,
            19798,
            19882,
            19938,
            20058,
            20273,
            20468,
            20639,
            20971,
            20976,
            21049,
            21200,
            21495,
            21887,
            22176,
            22441,
            22598,
            22676,
            22979,
            23651,
            23660,
            23990,
            24000,
            24224,
            24288,
            24545,
            24999,
            25411,
            26358,
            26371,
            26550,
            26637,
            27016,
            27519,
            28079,
            28565,
            29241,
            29706,
            30003,
            30479,
            31156,
            31676,
            32302,
            32989,
            33406,
            33735,
            33745,
            34441,
            35060,
            35796,
            36360,
            36844,
            37119,
            37542,
            38250,
            38991,
            39567,
            39800,
            40500,
            40950,
            41500,
            41902,
            42483,
            43118,
            43683,
            43990,
            44153,
            44516,
            45007,
            45506
    };

    public static final int[] LA_CASES = new int[]{
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
            107792,
            107806,
            107826,
            115024,
            116670,
            120764,
            123256,
            125006,
            127700,
            130394,
            133596,
            136384,
            140576,
            143207,
            147713,
            150424,
            153179,
            155917,
            159045,
            162025,
            165134,
            167030,
            172325,
            174017,
            174017,
            176136,
            178663,
            183456,
            186036,
            188541,
            190857,
            192177,
            193877,
            195805,
            198165,
            201200,
            204258,
            206778,
            208563,
            210543,
            212145,
            214283,
            216313,
            218831,
            220867,
            221971,
            223233,
            224105,
            225916,
            227404,
            229148,
            230772,
            231703,
            232937,
            233882,
            235430,
            237080,
            238917,
            240755,
            241693,
            242631,
            243569,
            244507,
            245445,
            246383,
            247321,
            248259,
            249197,
            250135,
            251075,
            251075,
            252125,
            253220,
            253985,
            254685,
            255124,
            256194,
            257732,
            259270,
            260808,
            260808,
            261501,
            262204,
            263408,
            264465,
            265579,
            266693,
            267807,
            268501,
            269344,
            270361,
            271443,
            273699,
            273699,
            274358,
            275018,
            275920,
            277487,
            278733,
            281206,
            281206,
            282135,
            283023,
            283793,
            285016,
            286217,
            287258,
            288451,
            288452,
            289421,
            290107,
            290558,
            294138,
            296989,
            299007,
            299760,
            300662,
            302102,
            303520,
            305125,
            306470,
            307700,
            309197,
            310606,
            311844,
            313606,
            315615,
            317763,
            320068,
            322219,
            323765,
            326034,
            328058,
            330514,
            332977,
            336273,
            339570,
            342489,
            344741,
            348536,
            353479,
            357637,
            362024,
            364583,
            370769,
            374479,
            378361,
            383275,
            387793,
            391225,
            395879,
            401448,
            405231,
            409015,
            415638,
            422262,
            430824,
            440042,
            449971,
            458255,
            467189,
            475778,
            488519,
            513169,
            513283,
            525564,
            533123,
            544780,
            567249,
            581519,
            597386,
            610907,
            623792,
            636190,
            665036,
            665036,
            678040,
            700000,
            707463,
            719960,
            734860,
            750000,
            756840,
            790582,
            790582,
            807185,
            818698,
            829549,
            841392,
            853440,
            872204,
            890031,
            907077,
            920324,
            932901,
            947035,
            959156,
            976075,
            990632,
            1004693,
            1024297,
            1024297,
            1032806,
            1038738,
            1046591,
            1054802,
            1065505,
            1073156,
            1079672,
            1085488,
            1092128,
            1098411,
            1102999,
            1111111,
            1115111,
            1119111,
            1124975,
            1129730,
            1134595,
            1138970,
            1143591,
            1146483,
            1149346,
            1152430,
            1155491
    };

    public static final int[] LA_DEATHS = new int[]{
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
            3457,
            3457,
            3457,
            3487,
            3537,
            3582,
            3643,
            3691,
            3643,
            3795,
            3809,
            3824,
            3897,
            3941,
            3989,
            4048,
            4084,
            4096,
            4104,
            4155,
            4215,
            4263,
            4351,
            4360,
            4360,
            4375,
            4427,
            4518,
            4559,
            4624,
            4669,
            4693,
            4702,
            4760,
            4827,
            4869,
            4919,
            4967,
            4977,
            4998,
            5058,
            5112,
            5172,
            5215,
            5246,
            5254,
            5273,
            5340,
            5396,
            5447,
            5492,
            5537,
            5545,
            5560,
            5610,
            5664,
            5701,
            5735,
            5769,
            5802,
            5835,
            5868,
            5901,
            5934,
            5967,
            6000,
            6033,
            6066,
            6099,
            6131,
            6131,
            6177,
            6198,
            6208,
            6232,
            6274,
            6305,
            6321,
            6337,
            6353,
            6353,
            6367,
            6401,
            6425,
            6458,
            6476,
            6494,
            6514,
            6515,
            6553,
            6577,
            6613,
            6642,
            6642,
            6648,
            6655,
            6684,
            6709,
            6727,
            6769,
            6769,
            6771,
            6773,
            6793,
            6812,
            6834,
            6856,
            6876,
            6876,
            6877,
            6912,
            6944,
            6956,
            6974,
            6989,
            6993,
            7000,
            7027,
            7043,
            7044,
            7057,
            7071,
            7074,
            7076,
            7097,
            7118,
            7140,
            7158,
            7170,
            7172,
            7177,
            7202,
            7218,
            7221,
            7246,
            7257,
            7269,
            7275,
            7300,
            7337,
            7365,
            7397,
            7429,
            7438,
            7456,
            7501,
            7543,
            7580,
            7604,
            7623,
            7639,
            7656,
            7679,
            7702,
            7744,
            7787,
            7843,
            7886,
            7909,
            7936,
            8006,
            8077,
            8151,
            8273,
            8273,
            8298,
            8345,
            8438,
            8572,
            8671,
            8758,
            8822,
            8875,
            8935,
            9165,
            9165,
            9305,
            9400,
            9441,
            9485,
            9564,
            9800,
            10068,
            10552,
            10552,
            10688,
            10773,
            10852,
            11089,
            11349,
            11554,
            11872,
            12090,
            12252,
            12388,
            12706,
            12972,
            13244,
            13504,
            13757,
            13937,
            13937,
            14122,
            14416,
            14662,
            14894,
            15184,
            15262,
            15314,
            15614,
            15915,
            16127,
            16300,
            16500,
            16700,
            16900,
            17077,
            17324,
            17555,
            17772,
            17959,
            18047,
            18146,
            18367,
            18519
    };
}
