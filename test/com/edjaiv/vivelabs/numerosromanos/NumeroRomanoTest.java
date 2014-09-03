/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edjaiv.vivelabs.numerosromanos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edwin
 */
public class NumeroRomanoTest {

    public NumeroRomanoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of agregar method, of class NumeroRomano.
     */
    @Test(expected = NumeroRomanoNoValidoException.class)
    public void testAgregar_String() throws Exception {
        System.out.println("agregar");
        NumeroRomano instance = new NumeroRomano();
        instance.agregar("I");
    }

    /**
     * Test of agregar method, of class NumeroRomano.
     */
    @Test
    public void testAgregar_NumeroRomano() throws Exception {
        System.out.println("agregar");
        NumeroRomano n1 = new NumeroRomano("MCMXLV");
        assertEquals("MCML", n1.agregar(new NumeroRomano("V")));
        assertEquals("MCMLI", n1.agregar(new NumeroRomano("VI")));
        assertEquals("MCMLII", n1.agregar(new NumeroRomano("VII")));
        assertEquals("MCMLIII", n1.agregar(new NumeroRomano("VIII")));
        assertEquals("MCMLIV", n1.agregar(new NumeroRomano("IX")));
        assertEquals("MCMLV", n1.agregar(new NumeroRomano("X")));
    }

    /**
     * Test of toRomano method, of class NumeroRomano.
     */
    @Test
    public void testToRomano() {
        System.out.println("toRomano");
        NumeroRomano instance = new NumeroRomano();
        assertEquals("I", instance.toRomano(1));
        assertEquals("II", instance.toRomano(2));
        assertEquals("III", instance.toRomano(3));
        assertEquals("IV", instance.toRomano(4));
        assertEquals("V", instance.toRomano(5));
        assertEquals("VI", instance.toRomano(6));
        assertEquals("VII", instance.toRomano(7));
        assertEquals("VIII", instance.toRomano(8));
        assertEquals("IX", instance.toRomano(9));
        assertEquals("X", instance.toRomano(10));
        assertEquals("XI", instance.toRomano(11));
        assertEquals("XII", instance.toRomano(12));
        assertEquals("XIII", instance.toRomano(13));
        assertEquals("XIV", instance.toRomano(14));
        assertEquals("XV", instance.toRomano(15));
        assertEquals("XVI", instance.toRomano(16));
        assertEquals("XVII", instance.toRomano(17));
        assertEquals("XVIII", instance.toRomano(18));
        assertEquals("XIX", instance.toRomano(19));
        assertEquals("XX", instance.toRomano(20));

        assertEquals("XXI", instance.toRomano(21));
        assertEquals("XXII", instance.toRomano(22));
        assertEquals("XXIII", instance.toRomano(23));
        assertEquals("XXIV", instance.toRomano(24));
        assertEquals("XXV", instance.toRomano(25));
        assertEquals("XXVI", instance.toRomano(26));
        assertEquals("XXVII", instance.toRomano(27));
        assertEquals("XXVIII", instance.toRomano(28));
        assertEquals("XXIX", instance.toRomano(29));
        assertEquals("XXX", instance.toRomano(30));

        assertEquals("XXXI", instance.toRomano(31));
        assertEquals("XXXII", instance.toRomano(32));
        assertEquals("XXXIII", instance.toRomano(33));
        assertEquals("XXXIV", instance.toRomano(34));
        assertEquals("XXXV", instance.toRomano(35));
        assertEquals("XXXVI", instance.toRomano(36));
        assertEquals("XXXVII", instance.toRomano(37));
        assertEquals("XXXVIII", instance.toRomano(38));
        assertEquals("XXXIX", instance.toRomano(39));
        assertEquals("XL", instance.toRomano(40));

        assertEquals("XLI", instance.toRomano(41));
        assertEquals("XLII", instance.toRomano(42));
        assertEquals("XLIII", instance.toRomano(43));
        assertEquals("XLIV", instance.toRomano(44));
        assertEquals("XLV", instance.toRomano(45));
        assertEquals("XLVI", instance.toRomano(46));
        assertEquals("XLVII", instance.toRomano(47));
        assertEquals("XLVIII", instance.toRomano(48));
        assertEquals("XLIX", instance.toRomano(49));
        assertEquals("L", instance.toRomano(50));

        assertEquals("LI", instance.toRomano(51));
        assertEquals("LII", instance.toRomano(52));
        assertEquals("LIII", instance.toRomano(53));
        assertEquals("LIV", instance.toRomano(54));
        assertEquals("LV", instance.toRomano(55));
        assertEquals("LVI", instance.toRomano(56));
        assertEquals("LVII", instance.toRomano(57));
        assertEquals("LVIII", instance.toRomano(58));
        assertEquals("LIX", instance.toRomano(59));
        assertEquals("LX", instance.toRomano(60));

        assertEquals("LXI", instance.toRomano(61));
        assertEquals("LXII", instance.toRomano(62));
        assertEquals("LXIII", instance.toRomano(63));
        assertEquals("LXIV", instance.toRomano(64));
        assertEquals("LXV", instance.toRomano(65));
        assertEquals("LXVI", instance.toRomano(66));
        assertEquals("LXVII", instance.toRomano(67));
        assertEquals("LXVIII", instance.toRomano(68));
        assertEquals("LXIX", instance.toRomano(69));
        assertEquals("LXX", instance.toRomano(70));

        assertEquals("LXXI", instance.toRomano(71));
        assertEquals("LXXII", instance.toRomano(72));
        assertEquals("LXXIII", instance.toRomano(73));
        assertEquals("LXXIV", instance.toRomano(74));
        assertEquals("LXXV", instance.toRomano(75));
        assertEquals("LXXVI", instance.toRomano(76));
        assertEquals("LXXVII", instance.toRomano(77));
        assertEquals("LXXVIII", instance.toRomano(78));
        assertEquals("LXXIX", instance.toRomano(79));
        assertEquals("LXXX", instance.toRomano(80));

        assertEquals("LXXXI", instance.toRomano(81));
        assertEquals("LXXXII", instance.toRomano(82));
        assertEquals("LXXXIII", instance.toRomano(83));
        assertEquals("LXXXIV", instance.toRomano(84));
        assertEquals("LXXXV", instance.toRomano(85));
        assertEquals("LXXXVI", instance.toRomano(86));
        assertEquals("LXXXVII", instance.toRomano(87));
        assertEquals("LXXXVIII", instance.toRomano(88));
        assertEquals("LXXXIX", instance.toRomano(89));
        assertEquals("XC", instance.toRomano(90));

        assertEquals("XCI", instance.toRomano(91));
        assertEquals("XCII", instance.toRomano(92));
        assertEquals("XCIII", instance.toRomano(93));
        assertEquals("XCIV", instance.toRomano(94));
        assertEquals("XCV", instance.toRomano(95));
        assertEquals("XCVI", instance.toRomano(96));
        assertEquals("XCVII", instance.toRomano(97));
        assertEquals("XCVIII", instance.toRomano(98));
        assertEquals("XCIX", instance.toRomano(99));
        assertEquals("C", instance.toRomano(100));

        assertEquals("CI", instance.toRomano(101));
        assertEquals("CII", instance.toRomano(102));
        assertEquals("CIII", instance.toRomano(103));
        assertEquals("CIV", instance.toRomano(104));
        assertEquals("CV", instance.toRomano(105));
        assertEquals("CVI", instance.toRomano(106));
        assertEquals("CVII", instance.toRomano(107));
        assertEquals("CVIII", instance.toRomano(108));
        assertEquals("CIX", instance.toRomano(109));
        assertEquals("CX", instance.toRomano(110));

        assertEquals("CXI", instance.toRomano(111));
        assertEquals("CXII", instance.toRomano(112));
        assertEquals("CXIII", instance.toRomano(113));
        assertEquals("CXIV", instance.toRomano(114));
        assertEquals("CXV", instance.toRomano(115));
        assertEquals("CXVI", instance.toRomano(116));
        assertEquals("CXVII", instance.toRomano(117));
        assertEquals("CXVIII", instance.toRomano(118));
        assertEquals("CXIX", instance.toRomano(119));
        assertEquals("CXX", instance.toRomano(120));

        assertEquals("CXXI", instance.toRomano(121));
        assertEquals("CXXII", instance.toRomano(122));
        assertEquals("CXXIII", instance.toRomano(123));
        assertEquals("CXXIV", instance.toRomano(124));
        assertEquals("CXXV", instance.toRomano(125));
        assertEquals("CXXVI", instance.toRomano(126));
        assertEquals("CXXVII", instance.toRomano(127));
        assertEquals("CXXVIII", instance.toRomano(128));
        assertEquals("CXXIX", instance.toRomano(129));
        assertEquals("CXXX", instance.toRomano(130));

        assertEquals("CXXXI", instance.toRomano(131));
        assertEquals("CXXXII", instance.toRomano(132));
        assertEquals("CXXXIII", instance.toRomano(133));
        assertEquals("CXXXIV", instance.toRomano(134));
        assertEquals("CXXXV", instance.toRomano(135));
        assertEquals("CXXXVI", instance.toRomano(136));
        assertEquals("CXXXVII", instance.toRomano(137));
        assertEquals("CXXXVIII", instance.toRomano(138));
        assertEquals("CXXXIX", instance.toRomano(139));
        assertEquals("CXL", instance.toRomano(140));

        assertEquals("CXLI", instance.toRomano(141));
        assertEquals("CXLII", instance.toRomano(142));
        assertEquals("CXLIII", instance.toRomano(143));
        assertEquals("CXLIV", instance.toRomano(144));
        assertEquals("CXLV", instance.toRomano(145));
        assertEquals("CXLVI", instance.toRomano(146));
        assertEquals("CXLVII", instance.toRomano(147));
        assertEquals("CXLVIII", instance.toRomano(148));
        assertEquals("CXLIX", instance.toRomano(149));
        assertEquals("CL", instance.toRomano(150));

        assertEquals("CLI", instance.toRomano(151));
        assertEquals("CLII", instance.toRomano(152));
        assertEquals("CLIII", instance.toRomano(153));
        assertEquals("CLIV", instance.toRomano(154));
        assertEquals("CLV", instance.toRomano(155));
        assertEquals("CLVI", instance.toRomano(156));
        assertEquals("CLVII", instance.toRomano(157));
        assertEquals("CLVIII", instance.toRomano(158));
        assertEquals("CLIX", instance.toRomano(159));
        assertEquals("CLX", instance.toRomano(160));

        assertEquals("CLXI", instance.toRomano(161));
        assertEquals("CLXII", instance.toRomano(162));
        assertEquals("CLXIII", instance.toRomano(163));
        assertEquals("CLXIV", instance.toRomano(164));
        assertEquals("CLXV", instance.toRomano(165));
        assertEquals("CLXVI", instance.toRomano(166));
        assertEquals("CLXVII", instance.toRomano(167));
        assertEquals("CLXVIII", instance.toRomano(168));
        assertEquals("CLXIX", instance.toRomano(169));
        assertEquals("CLXX", instance.toRomano(170));

        assertEquals("CLXXI", instance.toRomano(171));
        assertEquals("CLXXII", instance.toRomano(172));
        assertEquals("CLXXIII", instance.toRomano(173));
        assertEquals("CLXXIV", instance.toRomano(174));
        assertEquals("CLXXV", instance.toRomano(175));
        assertEquals("CLXXVI", instance.toRomano(176));
        assertEquals("CLXXVII", instance.toRomano(177));
        assertEquals("CLXXVIII", instance.toRomano(178));
        assertEquals("CLXXIX", instance.toRomano(179));
        assertEquals("CLXXX", instance.toRomano(180));

        assertEquals("CLXXXI", instance.toRomano(181));
        assertEquals("CLXXXII", instance.toRomano(182));
        assertEquals("CLXXXIII", instance.toRomano(183));
        assertEquals("CLXXXIV", instance.toRomano(184));
        assertEquals("CLXXXV", instance.toRomano(185));
        assertEquals("CLXXXVI", instance.toRomano(186));
        assertEquals("CLXXXVII", instance.toRomano(187));
        assertEquals("CLXXXVIII", instance.toRomano(188));
        assertEquals("CLXXXIX", instance.toRomano(189));
        assertEquals("CXC", instance.toRomano(190));

        assertEquals("CXCI", instance.toRomano(191));
        assertEquals("CXCII", instance.toRomano(192));
        assertEquals("CXCIII", instance.toRomano(193));
        assertEquals("CXCIV", instance.toRomano(194));
        assertEquals("CXCV", instance.toRomano(195));
        assertEquals("CXCVI", instance.toRomano(196));
        assertEquals("CXCVII", instance.toRomano(197));
        assertEquals("CXCVIII", instance.toRomano(198));
        assertEquals("CXCIX", instance.toRomano(199));
        assertEquals("CC", instance.toRomano(200));

        assertEquals("CCI", instance.toRomano(201));
        assertEquals("CCII", instance.toRomano(202));
        assertEquals("CCIII", instance.toRomano(203));
        assertEquals("CCIV", instance.toRomano(204));
        assertEquals("CCV", instance.toRomano(205));
        assertEquals("CCVI", instance.toRomano(206));
        assertEquals("CCVII", instance.toRomano(207));
        assertEquals("CCVIII", instance.toRomano(208));
        assertEquals("CCIX", instance.toRomano(209));
        assertEquals("CCX", instance.toRomano(210));

        assertEquals("CCXI", instance.toRomano(211));
        assertEquals("CCXII", instance.toRomano(212));
        assertEquals("CCXIII", instance.toRomano(213));
        assertEquals("CCXIV", instance.toRomano(214));
        assertEquals("CCXV", instance.toRomano(215));
        assertEquals("CCXVI", instance.toRomano(216));
        assertEquals("CCXVII", instance.toRomano(217));
        assertEquals("CCXVIII", instance.toRomano(218));
        assertEquals("CCXIX", instance.toRomano(219));
        assertEquals("CCXX", instance.toRomano(220));

        assertEquals("CCXXI", instance.toRomano(221));
        assertEquals("CCXXII", instance.toRomano(222));
        assertEquals("CCXXIII", instance.toRomano(223));
        assertEquals("CCXXIV", instance.toRomano(224));
        assertEquals("CCXXV", instance.toRomano(225));
        assertEquals("CCXXVI", instance.toRomano(226));
        assertEquals("CCXXVII", instance.toRomano(227));
        assertEquals("CCXXVIII", instance.toRomano(228));
        assertEquals("CCXXIX", instance.toRomano(229));
        assertEquals("CCXXX", instance.toRomano(230));

        assertEquals("CCXXXI", instance.toRomano(231));
        assertEquals("CCXXXII", instance.toRomano(232));
        assertEquals("CCXXXIII", instance.toRomano(233));
        assertEquals("CCXXXIV", instance.toRomano(234));
        assertEquals("CCXXXV", instance.toRomano(235));
        assertEquals("CCXXXVI", instance.toRomano(236));
        assertEquals("CCXXXVII", instance.toRomano(237));
        assertEquals("CCXXXVIII", instance.toRomano(238));
        assertEquals("CCXXXIX", instance.toRomano(239));
        assertEquals("CCXL", instance.toRomano(240));

        assertEquals("CCXLI", instance.toRomano(241));
        assertEquals("CCXLII", instance.toRomano(242));
        assertEquals("CCXLIII", instance.toRomano(243));
        assertEquals("CCXLIV", instance.toRomano(244));
        assertEquals("CCXLV", instance.toRomano(245));
        assertEquals("CCXLVI", instance.toRomano(246));
        assertEquals("CCXLVII", instance.toRomano(247));
        assertEquals("CCXLVIII", instance.toRomano(248));
        assertEquals("CCXLIX", instance.toRomano(249));
        assertEquals("CCL", instance.toRomano(250));

        assertEquals("CCLI", instance.toRomano(251));
        assertEquals("CCLII", instance.toRomano(252));
        assertEquals("CCLIII", instance.toRomano(253));
        assertEquals("CCLIV", instance.toRomano(254));
        assertEquals("CCLV", instance.toRomano(255));
        assertEquals("CCLVI", instance.toRomano(256));
        assertEquals("CCLVII", instance.toRomano(257));
        assertEquals("CCLVIII", instance.toRomano(258));
        assertEquals("CCLIX", instance.toRomano(259));
        assertEquals("CCLX", instance.toRomano(260));

        assertEquals("CCLXI", instance.toRomano(261));
        assertEquals("CCLXII", instance.toRomano(262));
        assertEquals("CCLXIII", instance.toRomano(263));
        assertEquals("CCLXIV", instance.toRomano(264));
        assertEquals("CCLXV", instance.toRomano(265));
        assertEquals("CCLXVI", instance.toRomano(266));
        assertEquals("CCLXVII", instance.toRomano(267));
        assertEquals("CCLXVIII", instance.toRomano(268));
        assertEquals("CCLXIX", instance.toRomano(269));
        assertEquals("CCLXX", instance.toRomano(270));

        assertEquals("CCLXXI", instance.toRomano(271));
        assertEquals("CCLXXII", instance.toRomano(272));
        assertEquals("CCLXXIII", instance.toRomano(273));
        assertEquals("CCLXXIV", instance.toRomano(274));
        assertEquals("CCLXXV", instance.toRomano(275));
        assertEquals("CCLXXVI", instance.toRomano(276));
        assertEquals("CCLXXVII", instance.toRomano(277));
        assertEquals("CCLXXVIII", instance.toRomano(278));
        assertEquals("CCLXXIX", instance.toRomano(279));
        assertEquals("CCLXXX", instance.toRomano(280));

        assertEquals("CCLXXXI", instance.toRomano(281));
        assertEquals("CCLXXXII", instance.toRomano(282));
        assertEquals("CCLXXXIII", instance.toRomano(283));
        assertEquals("CCLXXXIV", instance.toRomano(284));
        assertEquals("CCLXXXV", instance.toRomano(285));
        assertEquals("CCLXXXVI", instance.toRomano(286));
        assertEquals("CCLXXXVII", instance.toRomano(287));
        assertEquals("CCLXXXVIII", instance.toRomano(288));
        assertEquals("CCLXXXIX", instance.toRomano(289));
        assertEquals("CCXC", instance.toRomano(290));

        assertEquals("CCXCI", instance.toRomano(291));
        assertEquals("CCXCII", instance.toRomano(292));
        assertEquals("CCXCIII", instance.toRomano(293));
        assertEquals("CCXCIV", instance.toRomano(294));
        assertEquals("CCXCV", instance.toRomano(295));
        assertEquals("CCXCVI", instance.toRomano(296));
        assertEquals("CCXCVII", instance.toRomano(297));
        assertEquals("CCXCVIII", instance.toRomano(298));
        assertEquals("CCXCIX", instance.toRomano(299));
        assertEquals("CCC", instance.toRomano(300));

        assertEquals("CCCI", instance.toRomano(301));
        assertEquals("CCCII", instance.toRomano(302));
        assertEquals("CCCIII", instance.toRomano(303));
        assertEquals("CCCIV", instance.toRomano(304));
        assertEquals("CCCV", instance.toRomano(305));
        assertEquals("CCCVI", instance.toRomano(306));
        assertEquals("CCCVII", instance.toRomano(307));
        assertEquals("CCCVIII", instance.toRomano(308));
        assertEquals("CCCIX", instance.toRomano(309));
        assertEquals("CCCX", instance.toRomano(310));

        assertEquals("CCCXI", instance.toRomano(311));
        assertEquals("CCCXII", instance.toRomano(312));
        assertEquals("CCCXIII", instance.toRomano(313));
        assertEquals("CCCXIV", instance.toRomano(314));
        assertEquals("CCCXV", instance.toRomano(315));
        assertEquals("CCCXVI", instance.toRomano(316));
        assertEquals("CCCXVII", instance.toRomano(317));
        assertEquals("CCCXVIII", instance.toRomano(318));
        assertEquals("CCCXIX", instance.toRomano(319));
        assertEquals("CCCXX", instance.toRomano(320));

        assertEquals("CCCXXI", instance.toRomano(321));
        assertEquals("CCCXXII", instance.toRomano(322));
        assertEquals("CCCXXIII", instance.toRomano(323));
        assertEquals("CCCXXIV", instance.toRomano(324));
        assertEquals("CCCXXV", instance.toRomano(325));
        assertEquals("CCCXXVI", instance.toRomano(326));
        assertEquals("CCCXXVII", instance.toRomano(327));
        assertEquals("CCCXXVIII", instance.toRomano(328));
        assertEquals("CCCXXIX", instance.toRomano(329));
        assertEquals("CCCXXX", instance.toRomano(330));

        assertEquals("CCCXXXI", instance.toRomano(331));
        assertEquals("CCCXXXII", instance.toRomano(332));
        assertEquals("CCCXXXIII", instance.toRomano(333));
        assertEquals("CCCXXXIV", instance.toRomano(334));
        assertEquals("CCCXXXV", instance.toRomano(335));
        assertEquals("CCCXXXVI", instance.toRomano(336));
        assertEquals("CCCXXXVII", instance.toRomano(337));
        assertEquals("CCCXXXVIII", instance.toRomano(338));
        assertEquals("CCCXXXIX", instance.toRomano(339));
        assertEquals("CCCXL", instance.toRomano(340));

        assertEquals("CCCXLI", instance.toRomano(341));
        assertEquals("CCCXLII", instance.toRomano(342));
        assertEquals("CCCXLIII", instance.toRomano(343));
        assertEquals("CCCXLIV", instance.toRomano(344));
        assertEquals("CCCXLV", instance.toRomano(345));
        assertEquals("CCCXLVI", instance.toRomano(346));
        assertEquals("CCCXLVII", instance.toRomano(347));
        assertEquals("CCCXLVIII", instance.toRomano(348));
        assertEquals("CCCXLIX", instance.toRomano(349));
        assertEquals("CCCL", instance.toRomano(350));

        assertEquals("CCCLI", instance.toRomano(351));
        assertEquals("CCCLII", instance.toRomano(352));
        assertEquals("CCCLIII", instance.toRomano(353));
        assertEquals("CCCLIV", instance.toRomano(354));
        assertEquals("CCCLV", instance.toRomano(355));
        assertEquals("CCCLVI", instance.toRomano(356));
        assertEquals("CCCLVII", instance.toRomano(357));
        assertEquals("CCCLVIII", instance.toRomano(358));
        assertEquals("CCCLIX", instance.toRomano(359));
        assertEquals("CCCLX", instance.toRomano(360));

        assertEquals("CCCLXI", instance.toRomano(361));
        assertEquals("CCCLXII", instance.toRomano(362));
        assertEquals("CCCLXIII", instance.toRomano(363));
        assertEquals("CCCLXIV", instance.toRomano(364));
        assertEquals("CCCLXV", instance.toRomano(365));
        assertEquals("CCCLXVI", instance.toRomano(366));
        assertEquals("CCCLXVII", instance.toRomano(367));
        assertEquals("CCCLXVIII", instance.toRomano(368));
        assertEquals("CCCLXIX", instance.toRomano(369));
        assertEquals("CCCLXX", instance.toRomano(370));

        assertEquals("CCCLXXI", instance.toRomano(371));
        assertEquals("CCCLXXII", instance.toRomano(372));
        assertEquals("CCCLXXIII", instance.toRomano(373));
        assertEquals("CCCLXXIV", instance.toRomano(374));
        assertEquals("CCCLXXV", instance.toRomano(375));
        assertEquals("CCCLXXVI", instance.toRomano(376));
        assertEquals("CCCLXXVII", instance.toRomano(377));
        assertEquals("CCCLXXVIII", instance.toRomano(378));
        assertEquals("CCCLXXIX", instance.toRomano(379));
        assertEquals("CCCLXXX", instance.toRomano(380));

        assertEquals("CCCLXXXI", instance.toRomano(381));
        assertEquals("CCCLXXXII", instance.toRomano(382));
        assertEquals("CCCLXXXIII", instance.toRomano(383));
        assertEquals("CCCLXXXIV", instance.toRomano(384));
        assertEquals("CCCLXXXV", instance.toRomano(385));
        assertEquals("CCCLXXXVI", instance.toRomano(386));
        assertEquals("CCCLXXXVII", instance.toRomano(387));
        assertEquals("CCCLXXXVIII", instance.toRomano(388));
        assertEquals("CCCLXXXIX", instance.toRomano(389));
        assertEquals("CCCXC", instance.toRomano(390));

        assertEquals("CCCXCI", instance.toRomano(391));
        assertEquals("CCCXCII", instance.toRomano(392));
        assertEquals("CCCXCIII", instance.toRomano(393));
        assertEquals("CCCXCIV", instance.toRomano(394));
        assertEquals("CCCXCV", instance.toRomano(395));
        assertEquals("CCCXCVI", instance.toRomano(396));
        assertEquals("CCCXCVII", instance.toRomano(397));
        assertEquals("CCCXCVIII", instance.toRomano(398));
        assertEquals("CCCXCIX", instance.toRomano(399));
        assertEquals("CD", instance.toRomano(400));

        assertEquals("CDI", instance.toRomano(401));
        assertEquals("CDII", instance.toRomano(402));
        assertEquals("CDIII", instance.toRomano(403));
        assertEquals("CDIV", instance.toRomano(404));
        assertEquals("CDV", instance.toRomano(405));
        assertEquals("CDVI", instance.toRomano(406));
        assertEquals("CDVII", instance.toRomano(407));
        assertEquals("CDVIII", instance.toRomano(408));
        assertEquals("CDIX", instance.toRomano(409));
        assertEquals("CDX", instance.toRomano(410));

        assertEquals("CDXI", instance.toRomano(411));
        assertEquals("CDXII", instance.toRomano(412));
        assertEquals("CDXIII", instance.toRomano(413));
        assertEquals("CDXIV", instance.toRomano(414));
        assertEquals("CDXV", instance.toRomano(415));
        assertEquals("CDXVI", instance.toRomano(416));
        assertEquals("CDXVII", instance.toRomano(417));
        assertEquals("CDXVIII", instance.toRomano(418));
        assertEquals("CDXIX", instance.toRomano(419));
        assertEquals("CDXX", instance.toRomano(420));

        assertEquals("CDXXI", instance.toRomano(421));
        assertEquals("CDXXII", instance.toRomano(422));
        assertEquals("CDXXIII", instance.toRomano(423));
        assertEquals("CDXXIV", instance.toRomano(424));
        assertEquals("CDXXV", instance.toRomano(425));
        assertEquals("CDXXVI", instance.toRomano(426));
        assertEquals("CDXXVII", instance.toRomano(427));
        assertEquals("CDXXVIII", instance.toRomano(428));
        assertEquals("CDXXIX", instance.toRomano(429));
        assertEquals("CDXXX", instance.toRomano(430));

        assertEquals("CDXXXI", instance.toRomano(431));
        assertEquals("CDXXXII", instance.toRomano(432));
        assertEquals("CDXXXIII", instance.toRomano(433));
        assertEquals("CDXXXIV", instance.toRomano(434));
        assertEquals("CDXXXV", instance.toRomano(435));
        assertEquals("CDXXXVI", instance.toRomano(436));
        assertEquals("CDXXXVII", instance.toRomano(437));
        assertEquals("CDXXXVIII", instance.toRomano(438));
        assertEquals("CDXXXIX", instance.toRomano(439));
        assertEquals("CDXL", instance.toRomano(440));

        assertEquals("CDXLI", instance.toRomano(441));
        assertEquals("CDXLII", instance.toRomano(442));
        assertEquals("CDXLIII", instance.toRomano(443));
        assertEquals("CDXLIV", instance.toRomano(444));
        assertEquals("CDXLV", instance.toRomano(445));
        assertEquals("CDXLVI", instance.toRomano(446));
        assertEquals("CDXLVII", instance.toRomano(447));
        assertEquals("CDXLVIII", instance.toRomano(448));
        assertEquals("CDXLIX", instance.toRomano(449));
        assertEquals("CDL", instance.toRomano(450));

        assertEquals("CDLI", instance.toRomano(451));
        assertEquals("CDLII", instance.toRomano(452));
        assertEquals("CDLIII", instance.toRomano(453));
        assertEquals("CDLIV", instance.toRomano(454));
        assertEquals("CDLV", instance.toRomano(455));
        assertEquals("CDLVI", instance.toRomano(456));
        assertEquals("CDLVII", instance.toRomano(457));
        assertEquals("CDLVIII", instance.toRomano(458));
        assertEquals("CDLIX", instance.toRomano(459));
        assertEquals("CDLX", instance.toRomano(460));

        assertEquals("CDLXI", instance.toRomano(461));
        assertEquals("CDLXII", instance.toRomano(462));
        assertEquals("CDLXIII", instance.toRomano(463));
        assertEquals("CDLXIV", instance.toRomano(464));
        assertEquals("CDLXV", instance.toRomano(465));
        assertEquals("CDLXVI", instance.toRomano(466));
        assertEquals("CDLXVII", instance.toRomano(467));
        assertEquals("CDLXVIII", instance.toRomano(468));
        assertEquals("CDLXIX", instance.toRomano(469));
        assertEquals("CDLXX", instance.toRomano(470));

        assertEquals("CDLXXI", instance.toRomano(471));
        assertEquals("CDLXXII", instance.toRomano(472));
        assertEquals("CDLXXIII", instance.toRomano(473));
        assertEquals("CDLXXIV", instance.toRomano(474));
        assertEquals("CDLXXV", instance.toRomano(475));
        assertEquals("CDLXXVI", instance.toRomano(476));
        assertEquals("CDLXXVII", instance.toRomano(477));
        assertEquals("CDLXXVIII", instance.toRomano(478));
        assertEquals("CDLXXIX", instance.toRomano(479));
        assertEquals("CDLXXX", instance.toRomano(480));

        assertEquals("CDLXXXI", instance.toRomano(481));
        assertEquals("CDLXXXII", instance.toRomano(482));
        assertEquals("CDLXXXIII", instance.toRomano(483));
        assertEquals("CDLXXXIV", instance.toRomano(484));
        assertEquals("CDLXXXV", instance.toRomano(485));
        assertEquals("CDLXXXVI", instance.toRomano(486));
        assertEquals("CDLXXXVII", instance.toRomano(487));
        assertEquals("CDLXXXVIII", instance.toRomano(488));
        assertEquals("CDLXXXIX", instance.toRomano(489));
        assertEquals("CDXC", instance.toRomano(490));

        assertEquals("CDXCI", instance.toRomano(491));
        assertEquals("CDXCII", instance.toRomano(492));
        assertEquals("CDXCIII", instance.toRomano(493));
        assertEquals("CDXCIV", instance.toRomano(494));
        assertEquals("CDXCV", instance.toRomano(495));
        assertEquals("CDXCVI", instance.toRomano(496));
        assertEquals("CDXCVII", instance.toRomano(497));
        assertEquals("CDXCVIII", instance.toRomano(498));
        assertEquals("CDXCIX", instance.toRomano(499));
        assertEquals("D", instance.toRomano(500));

        assertEquals("DI", instance.toRomano(501));
        assertEquals("DII", instance.toRomano(502));
        assertEquals("DIII", instance.toRomano(503));
        assertEquals("DIV", instance.toRomano(504));
        assertEquals("DV", instance.toRomano(505));
        assertEquals("DVI", instance.toRomano(506));
        assertEquals("DVII", instance.toRomano(507));
        assertEquals("DVIII", instance.toRomano(508));
        assertEquals("DIX", instance.toRomano(509));
        assertEquals("DX", instance.toRomano(510));

        assertEquals("DXI", instance.toRomano(511));
        assertEquals("DXII", instance.toRomano(512));
        assertEquals("DXIII", instance.toRomano(513));
        assertEquals("DXIV", instance.toRomano(514));
        assertEquals("DXV", instance.toRomano(515));
        assertEquals("DXVI", instance.toRomano(516));
        assertEquals("DXVII", instance.toRomano(517));
        assertEquals("DXVIII", instance.toRomano(518));
        assertEquals("DXIX", instance.toRomano(519));
        assertEquals("DXX", instance.toRomano(520));

        assertEquals("DXXI", instance.toRomano(521));
        assertEquals("DXXII", instance.toRomano(522));
        assertEquals("DXXIII", instance.toRomano(523));
        assertEquals("DXXIV", instance.toRomano(524));
        assertEquals("DXXV", instance.toRomano(525));
        assertEquals("DXXVI", instance.toRomano(526));
        assertEquals("DXXVII", instance.toRomano(527));
        assertEquals("DXXVIII", instance.toRomano(528));
        assertEquals("DXXIX", instance.toRomano(529));
        assertEquals("DXXX", instance.toRomano(530));

        assertEquals("DXXXI", instance.toRomano(531));
        assertEquals("DXXXII", instance.toRomano(532));
        assertEquals("DXXXIII", instance.toRomano(533));
        assertEquals("DXXXIV", instance.toRomano(534));
        assertEquals("DXXXV", instance.toRomano(535));
        assertEquals("DXXXVI", instance.toRomano(536));
        assertEquals("DXXXVII", instance.toRomano(537));
        assertEquals("DXXXVIII", instance.toRomano(538));
        assertEquals("DXXXIX", instance.toRomano(539));
        assertEquals("DXL", instance.toRomano(540));

        assertEquals("DXLI", instance.toRomano(541));
        assertEquals("DXLII", instance.toRomano(542));
        assertEquals("DXLIII", instance.toRomano(543));
        assertEquals("DXLIV", instance.toRomano(544));
        assertEquals("DXLV", instance.toRomano(545));
        assertEquals("DXLVI", instance.toRomano(546));
        assertEquals("DXLVII", instance.toRomano(547));
        assertEquals("DXLVIII", instance.toRomano(548));
        assertEquals("DXLIX", instance.toRomano(549));
        assertEquals("DL", instance.toRomano(550));

        assertEquals("DLI", instance.toRomano(551));
        assertEquals("DLII", instance.toRomano(552));
        assertEquals("DLIII", instance.toRomano(553));
        assertEquals("DLIV", instance.toRomano(554));
        assertEquals("DLV", instance.toRomano(555));
        assertEquals("DLVI", instance.toRomano(556));
        assertEquals("DLVII", instance.toRomano(557));
        assertEquals("DLVIII", instance.toRomano(558));
        assertEquals("DLIX", instance.toRomano(559));
        assertEquals("DLX", instance.toRomano(560));

        assertEquals("DLXI", instance.toRomano(561));
        assertEquals("DLXII", instance.toRomano(562));
        assertEquals("DLXIII", instance.toRomano(563));
        assertEquals("DLXIV", instance.toRomano(564));
        assertEquals("DLXV", instance.toRomano(565));
        assertEquals("DLXVI", instance.toRomano(566));
        assertEquals("DLXVII", instance.toRomano(567));
        assertEquals("DLXVIII", instance.toRomano(568));
        assertEquals("DLXIX", instance.toRomano(569));
        assertEquals("DLXX", instance.toRomano(570));

        assertEquals("DLXXI", instance.toRomano(571));
        assertEquals("DLXXII", instance.toRomano(572));
        assertEquals("DLXXIII", instance.toRomano(573));
        assertEquals("DLXXIV", instance.toRomano(574));
        assertEquals("DLXXV", instance.toRomano(575));
        assertEquals("DLXXVI", instance.toRomano(576));
        assertEquals("DLXXVII", instance.toRomano(577));
        assertEquals("DLXXVIII", instance.toRomano(578));
        assertEquals("DLXXIX", instance.toRomano(579));
        assertEquals("DLXXX", instance.toRomano(580));

        assertEquals("DLXXXI", instance.toRomano(581));
        assertEquals("DLXXXII", instance.toRomano(582));
        assertEquals("DLXXXIII", instance.toRomano(583));
        assertEquals("DLXXXIV", instance.toRomano(584));
        assertEquals("DLXXXV", instance.toRomano(585));
        assertEquals("DLXXXVI", instance.toRomano(586));
        assertEquals("DLXXXVII", instance.toRomano(587));
        assertEquals("DLXXXVIII", instance.toRomano(588));
        assertEquals("DLXXXIX", instance.toRomano(589));
        assertEquals("DXC", instance.toRomano(590));

        assertEquals("DXCI", instance.toRomano(591));
        assertEquals("DXCII", instance.toRomano(592));
        assertEquals("DXCIII", instance.toRomano(593));
        assertEquals("DXCIV", instance.toRomano(594));
        assertEquals("DXCV", instance.toRomano(595));
        assertEquals("DXCVI", instance.toRomano(596));
        assertEquals("DXCVII", instance.toRomano(597));
        assertEquals("DXCVIII", instance.toRomano(598));
        assertEquals("DXCIX", instance.toRomano(599));
        assertEquals("DC", instance.toRomano(600));

        assertEquals("DCI", instance.toRomano(601));
        assertEquals("DCII", instance.toRomano(602));
        assertEquals("DCIII", instance.toRomano(603));
        assertEquals("DCIV", instance.toRomano(604));
        assertEquals("DCV", instance.toRomano(605));
        assertEquals("DCVI", instance.toRomano(606));
        assertEquals("DCVII", instance.toRomano(607));
        assertEquals("DCVIII", instance.toRomano(608));
        assertEquals("DCIX", instance.toRomano(609));
        assertEquals("DCX", instance.toRomano(610));

        assertEquals("DCXI", instance.toRomano(611));
        assertEquals("DCXII", instance.toRomano(612));
        assertEquals("DCXIII", instance.toRomano(613));
        assertEquals("DCXIV", instance.toRomano(614));
        assertEquals("DCXV", instance.toRomano(615));
        assertEquals("DCXVI", instance.toRomano(616));
        assertEquals("DCXVII", instance.toRomano(617));
        assertEquals("DCXVIII", instance.toRomano(618));
        assertEquals("DCXIX", instance.toRomano(619));
        assertEquals("DCXX", instance.toRomano(620));

        assertEquals("DCXXI", instance.toRomano(621));
        assertEquals("DCXXII", instance.toRomano(622));
        assertEquals("DCXXIII", instance.toRomano(623));
        assertEquals("DCXXIV", instance.toRomano(624));
        assertEquals("DCXXV", instance.toRomano(625));
        assertEquals("DCXXVI", instance.toRomano(626));
        assertEquals("DCXXVII", instance.toRomano(627));
        assertEquals("DCXXVIII", instance.toRomano(628));
        assertEquals("DCXXIX", instance.toRomano(629));
        assertEquals("DCXXX", instance.toRomano(630));

        assertEquals("DCXXXI", instance.toRomano(631));
        assertEquals("DCXXXII", instance.toRomano(632));
        assertEquals("DCXXXIII", instance.toRomano(633));
        assertEquals("DCXXXIV", instance.toRomano(634));
        assertEquals("DCXXXV", instance.toRomano(635));
        assertEquals("DCXXXVI", instance.toRomano(636));
        assertEquals("DCXXXVII", instance.toRomano(637));
        assertEquals("DCXXXVIII", instance.toRomano(638));
        assertEquals("DCXXXIX", instance.toRomano(639));
        assertEquals("DCXL", instance.toRomano(640));

        assertEquals("DCXLI", instance.toRomano(641));
        assertEquals("DCXLII", instance.toRomano(642));
        assertEquals("DCXLIII", instance.toRomano(643));
        assertEquals("DCXLIV", instance.toRomano(644));
        assertEquals("DCXLV", instance.toRomano(645));
        assertEquals("DCXLVI", instance.toRomano(646));
        assertEquals("DCXLVII", instance.toRomano(647));
        assertEquals("DCXLVIII", instance.toRomano(648));
        assertEquals("DCXLIX", instance.toRomano(649));
        assertEquals("DCL", instance.toRomano(650));

        assertEquals("DCLI", instance.toRomano(651));
        assertEquals("DCLII", instance.toRomano(652));
        assertEquals("DCLIII", instance.toRomano(653));
        assertEquals("DCLIV", instance.toRomano(654));
        assertEquals("DCLV", instance.toRomano(655));
        assertEquals("DCLVI", instance.toRomano(656));
        assertEquals("DCLVII", instance.toRomano(657));
        assertEquals("DCLVIII", instance.toRomano(658));
        assertEquals("DCLIX", instance.toRomano(659));
        assertEquals("DCLX", instance.toRomano(660));

        assertEquals("DCLXI", instance.toRomano(661));
        assertEquals("DCLXII", instance.toRomano(662));
        assertEquals("DCLXIII", instance.toRomano(663));
        assertEquals("DCLXIV", instance.toRomano(664));
        assertEquals("DCLXV", instance.toRomano(665));
        assertEquals("DCLXVI", instance.toRomano(666));
        assertEquals("DCLXVII", instance.toRomano(667));
        assertEquals("DCLXVIII", instance.toRomano(668));
        assertEquals("DCLXIX", instance.toRomano(669));
        assertEquals("DCLXX", instance.toRomano(670));

        assertEquals("DCLXXI", instance.toRomano(671));
        assertEquals("DCLXXII", instance.toRomano(672));
        assertEquals("DCLXXIII", instance.toRomano(673));
        assertEquals("DCLXXIV", instance.toRomano(674));
        assertEquals("DCLXXV", instance.toRomano(675));
        assertEquals("DCLXXVI", instance.toRomano(676));
        assertEquals("DCLXXVII", instance.toRomano(677));
        assertEquals("DCLXXVIII", instance.toRomano(678));
        assertEquals("DCLXXIX", instance.toRomano(679));
        assertEquals("DCLXXX", instance.toRomano(680));

        assertEquals("DCLXXXI", instance.toRomano(681));
        assertEquals("DCLXXXII", instance.toRomano(682));
        assertEquals("DCLXXXIII", instance.toRomano(683));
        assertEquals("DCLXXXIV", instance.toRomano(684));
        assertEquals("DCLXXXV", instance.toRomano(685));
        assertEquals("DCLXXXVI", instance.toRomano(686));
        assertEquals("DCLXXXVII", instance.toRomano(687));
        assertEquals("DCLXXXVIII", instance.toRomano(688));
        assertEquals("DCLXXXIX", instance.toRomano(689));
        assertEquals("DCXC", instance.toRomano(690));

        assertEquals("DCXCI", instance.toRomano(691));
        assertEquals("DCXCII", instance.toRomano(692));
        assertEquals("DCXCIII", instance.toRomano(693));
        assertEquals("DCXCIV", instance.toRomano(694));
        assertEquals("DCXCV", instance.toRomano(695));
        assertEquals("DCXCVI", instance.toRomano(696));
        assertEquals("DCXCVII", instance.toRomano(697));
        assertEquals("DCXCVIII", instance.toRomano(698));
        assertEquals("DCXCIX", instance.toRomano(699));
        assertEquals("DCC", instance.toRomano(700));

        assertEquals("DCCI", instance.toRomano(701));
        assertEquals("DCCII", instance.toRomano(702));
        assertEquals("DCCIII", instance.toRomano(703));
        assertEquals("DCCIV", instance.toRomano(704));
        assertEquals("DCCV", instance.toRomano(705));
        assertEquals("DCCVI", instance.toRomano(706));
        assertEquals("DCCVII", instance.toRomano(707));
        assertEquals("DCCVIII", instance.toRomano(708));
        assertEquals("DCCIX", instance.toRomano(709));
        assertEquals("DCCX", instance.toRomano(710));

        assertEquals("DCCXI", instance.toRomano(711));
        assertEquals("DCCXII", instance.toRomano(712));
        assertEquals("DCCXIII", instance.toRomano(713));
        assertEquals("DCCXIV", instance.toRomano(714));
        assertEquals("DCCXV", instance.toRomano(715));
        assertEquals("DCCXVI", instance.toRomano(716));
        assertEquals("DCCXVII", instance.toRomano(717));
        assertEquals("DCCXVIII", instance.toRomano(718));
        assertEquals("DCCXIX", instance.toRomano(719));
        assertEquals("DCCXX", instance.toRomano(720));

        assertEquals("DCCXXI", instance.toRomano(721));
        assertEquals("DCCXXII", instance.toRomano(722));
        assertEquals("DCCXXIII", instance.toRomano(723));
        assertEquals("DCCXXIV", instance.toRomano(724));
        assertEquals("DCCXXV", instance.toRomano(725));
        assertEquals("DCCXXVI", instance.toRomano(726));
        assertEquals("DCCXXVII", instance.toRomano(727));
        assertEquals("DCCXXVIII", instance.toRomano(728));
        assertEquals("DCCXXIX", instance.toRomano(729));
        assertEquals("DCCXXX", instance.toRomano(730));

        assertEquals("DCCXXXI", instance.toRomano(731));
        assertEquals("DCCXXXII", instance.toRomano(732));
        assertEquals("DCCXXXIII", instance.toRomano(733));
        assertEquals("DCCXXXIV", instance.toRomano(734));
        assertEquals("DCCXXXV", instance.toRomano(735));
        assertEquals("DCCXXXVI", instance.toRomano(736));
        assertEquals("DCCXXXVII", instance.toRomano(737));
        assertEquals("DCCXXXVIII", instance.toRomano(738));
        assertEquals("DCCXXXIX", instance.toRomano(739));
        assertEquals("DCCXL", instance.toRomano(740));

        assertEquals("DCCXLI", instance.toRomano(741));
        assertEquals("DCCXLII", instance.toRomano(742));
        assertEquals("DCCXLIII", instance.toRomano(743));
        assertEquals("DCCXLIV", instance.toRomano(744));
        assertEquals("DCCXLV", instance.toRomano(745));
        assertEquals("DCCXLVI", instance.toRomano(746));
        assertEquals("DCCXLVII", instance.toRomano(747));
        assertEquals("DCCXLVIII", instance.toRomano(748));
        assertEquals("DCCXLIX", instance.toRomano(749));
        assertEquals("DCCL", instance.toRomano(750));

        assertEquals("DCCLI", instance.toRomano(751));
        assertEquals("DCCLII", instance.toRomano(752));
        assertEquals("DCCLIII", instance.toRomano(753));
        assertEquals("DCCLIV", instance.toRomano(754));
        assertEquals("DCCLV", instance.toRomano(755));
        assertEquals("DCCLVI", instance.toRomano(756));
        assertEquals("DCCLVII", instance.toRomano(757));
        assertEquals("DCCLVIII", instance.toRomano(758));
        assertEquals("DCCLIX", instance.toRomano(759));
        assertEquals("DCCLX", instance.toRomano(760));

        assertEquals("DCCLXI", instance.toRomano(761));
        assertEquals("DCCLXII", instance.toRomano(762));
        assertEquals("DCCLXIII", instance.toRomano(763));
        assertEquals("DCCLXIV", instance.toRomano(764));
        assertEquals("DCCLXV", instance.toRomano(765));
        assertEquals("DCCLXVI", instance.toRomano(766));
        assertEquals("DCCLXVII", instance.toRomano(767));
        assertEquals("DCCLXVIII", instance.toRomano(768));
        assertEquals("DCCLXIX", instance.toRomano(769));
        assertEquals("DCCLXX", instance.toRomano(770));

        assertEquals("DCCLXXI", instance.toRomano(771));
        assertEquals("DCCLXXII", instance.toRomano(772));
        assertEquals("DCCLXXIII", instance.toRomano(773));
        assertEquals("DCCLXXIV", instance.toRomano(774));
        assertEquals("DCCLXXV", instance.toRomano(775));
        assertEquals("DCCLXXVI", instance.toRomano(776));
        assertEquals("DCCLXXVII", instance.toRomano(777));
        assertEquals("DCCLXXVIII", instance.toRomano(778));
        assertEquals("DCCLXXIX", instance.toRomano(779));
        assertEquals("DCCLXXX", instance.toRomano(780));

        assertEquals("DCCLXXXI", instance.toRomano(781));
        assertEquals("DCCLXXXII", instance.toRomano(782));
        assertEquals("DCCLXXXIII", instance.toRomano(783));
        assertEquals("DCCLXXXIV", instance.toRomano(784));
        assertEquals("DCCLXXXV", instance.toRomano(785));
        assertEquals("DCCLXXXVI", instance.toRomano(786));
        assertEquals("DCCLXXXVII", instance.toRomano(787));
        assertEquals("DCCLXXXVIII", instance.toRomano(788));
        assertEquals("DCCLXXXIX", instance.toRomano(789));
        assertEquals("DCCXC", instance.toRomano(790));

        assertEquals("DCCXCI", instance.toRomano(791));
        assertEquals("DCCXCII", instance.toRomano(792));
        assertEquals("DCCXCIII", instance.toRomano(793));
        assertEquals("DCCXCIV", instance.toRomano(794));
        assertEquals("DCCXCV", instance.toRomano(795));
        assertEquals("DCCXCVI", instance.toRomano(796));
        assertEquals("DCCXCVII", instance.toRomano(797));
        assertEquals("DCCXCVIII", instance.toRomano(798));
        assertEquals("DCCXCIX", instance.toRomano(799));
        assertEquals("DCCC", instance.toRomano(800));

        assertEquals("DCCCI", instance.toRomano(801));
        assertEquals("DCCCII", instance.toRomano(802));
        assertEquals("DCCCIII", instance.toRomano(803));
        assertEquals("DCCCIV", instance.toRomano(804));
        assertEquals("DCCCV", instance.toRomano(805));
        assertEquals("DCCCVI", instance.toRomano(806));
        assertEquals("DCCCVII", instance.toRomano(807));
        assertEquals("DCCCVIII", instance.toRomano(808));
        assertEquals("DCCCIX", instance.toRomano(809));
        assertEquals("DCCCX", instance.toRomano(810));

        assertEquals("DCCCXI", instance.toRomano(811));
        assertEquals("DCCCXII", instance.toRomano(812));
        assertEquals("DCCCXIII", instance.toRomano(813));
        assertEquals("DCCCXIV", instance.toRomano(814));
        assertEquals("DCCCXV", instance.toRomano(815));
        assertEquals("DCCCXVI", instance.toRomano(816));
        assertEquals("DCCCXVII", instance.toRomano(817));
        assertEquals("DCCCXVIII", instance.toRomano(818));
        assertEquals("DCCCXIX", instance.toRomano(819));
        assertEquals("DCCCXX", instance.toRomano(820));

        assertEquals("DCCCXXI", instance.toRomano(821));
        assertEquals("DCCCXXII", instance.toRomano(822));
        assertEquals("DCCCXXIII", instance.toRomano(823));
        assertEquals("DCCCXXIV", instance.toRomano(824));
        assertEquals("DCCCXXV", instance.toRomano(825));
        assertEquals("DCCCXXVI", instance.toRomano(826));
        assertEquals("DCCCXXVII", instance.toRomano(827));
        assertEquals("DCCCXXVIII", instance.toRomano(828));
        assertEquals("DCCCXXIX", instance.toRomano(829));
        assertEquals("DCCCXXX", instance.toRomano(830));

        assertEquals("DCCCXXXI", instance.toRomano(831));
        assertEquals("DCCCXXXII", instance.toRomano(832));
        assertEquals("DCCCXXXIII", instance.toRomano(833));
        assertEquals("DCCCXXXIV", instance.toRomano(834));
        assertEquals("DCCCXXXV", instance.toRomano(835));
        assertEquals("DCCCXXXVI", instance.toRomano(836));
        assertEquals("DCCCXXXVII", instance.toRomano(837));
        assertEquals("DCCCXXXVIII", instance.toRomano(838));
        assertEquals("DCCCXXXIX", instance.toRomano(839));
        assertEquals("DCCCXL", instance.toRomano(840));

        assertEquals("DCCCXLI", instance.toRomano(841));
        assertEquals("DCCCXLII", instance.toRomano(842));
        assertEquals("DCCCXLIII", instance.toRomano(843));
        assertEquals("DCCCXLIV", instance.toRomano(844));
        assertEquals("DCCCXLV", instance.toRomano(845));
        assertEquals("DCCCXLVI", instance.toRomano(846));
        assertEquals("DCCCXLVII", instance.toRomano(847));
        assertEquals("DCCCXLVIII", instance.toRomano(848));
        assertEquals("DCCCXLIX", instance.toRomano(849));
        assertEquals("DCCCL", instance.toRomano(850));

        assertEquals("DCCCLI", instance.toRomano(851));
        assertEquals("DCCCLII", instance.toRomano(852));
        assertEquals("DCCCLIII", instance.toRomano(853));
        assertEquals("DCCCLIV", instance.toRomano(854));
        assertEquals("DCCCLV", instance.toRomano(855));
        assertEquals("DCCCLVI", instance.toRomano(856));
        assertEquals("DCCCLVII", instance.toRomano(857));
        assertEquals("DCCCLVIII", instance.toRomano(858));
        assertEquals("DCCCLIX", instance.toRomano(859));
        assertEquals("DCCCLX", instance.toRomano(860));

        assertEquals("DCCCLXI", instance.toRomano(861));
        assertEquals("DCCCLXII", instance.toRomano(862));
        assertEquals("DCCCLXIII", instance.toRomano(863));
        assertEquals("DCCCLXIV", instance.toRomano(864));
        assertEquals("DCCCLXV", instance.toRomano(865));
        assertEquals("DCCCLXVI", instance.toRomano(866));
        assertEquals("DCCCLXVII", instance.toRomano(867));
        assertEquals("DCCCLXVIII", instance.toRomano(868));
        assertEquals("DCCCLXIX", instance.toRomano(869));
        assertEquals("DCCCLXX", instance.toRomano(870));

        assertEquals("DCCCLXXI", instance.toRomano(871));
        assertEquals("DCCCLXXII", instance.toRomano(872));
        assertEquals("DCCCLXXIII", instance.toRomano(873));
        assertEquals("DCCCLXXIV", instance.toRomano(874));
        assertEquals("DCCCLXXV", instance.toRomano(875));
        assertEquals("DCCCLXXVI", instance.toRomano(876));
        assertEquals("DCCCLXXVII", instance.toRomano(877));
        assertEquals("DCCCLXXVIII", instance.toRomano(878));
        assertEquals("DCCCLXXIX", instance.toRomano(879));
        assertEquals("DCCCLXXX", instance.toRomano(880));

        assertEquals("DCCCLXXXI", instance.toRomano(881));
        assertEquals("DCCCLXXXII", instance.toRomano(882));
        assertEquals("DCCCLXXXIII", instance.toRomano(883));
        assertEquals("DCCCLXXXIV", instance.toRomano(884));
        assertEquals("DCCCLXXXV", instance.toRomano(885));
        assertEquals("DCCCLXXXVI", instance.toRomano(886));
        assertEquals("DCCCLXXXVII", instance.toRomano(887));
        assertEquals("DCCCLXXXVIII", instance.toRomano(888));
        assertEquals("DCCCLXXXIX", instance.toRomano(889));
        assertEquals("DCCCXC", instance.toRomano(890));

        assertEquals("DCCCXCI", instance.toRomano(891));
        assertEquals("DCCCXCII", instance.toRomano(892));
        assertEquals("DCCCXCIII", instance.toRomano(893));
        assertEquals("DCCCXCIV", instance.toRomano(894));
        assertEquals("DCCCXCV", instance.toRomano(895));
        assertEquals("DCCCXCVI", instance.toRomano(896));
        assertEquals("DCCCXCVII", instance.toRomano(897));
        assertEquals("DCCCXCVIII", instance.toRomano(898));
        assertEquals("DCCCXCIX", instance.toRomano(899));
        assertEquals("CM", instance.toRomano(900));

        assertEquals("CMI", instance.toRomano(901));
        assertEquals("CMII", instance.toRomano(902));
        assertEquals("CMIII", instance.toRomano(903));
        assertEquals("CMIV", instance.toRomano(904));
        assertEquals("CMV", instance.toRomano(905));
        assertEquals("CMVI", instance.toRomano(906));
        assertEquals("CMVII", instance.toRomano(907));
        assertEquals("CMVIII", instance.toRomano(908));
        assertEquals("CMIX", instance.toRomano(909));
        assertEquals("CMX", instance.toRomano(910));

        assertEquals("CMXI", instance.toRomano(911));
        assertEquals("CMXII", instance.toRomano(912));
        assertEquals("CMXIII", instance.toRomano(913));
        assertEquals("CMXIV", instance.toRomano(914));
        assertEquals("CMXV", instance.toRomano(915));
        assertEquals("CMXVI", instance.toRomano(916));
        assertEquals("CMXVII", instance.toRomano(917));
        assertEquals("CMXVIII", instance.toRomano(918));
        assertEquals("CMXIX", instance.toRomano(919));
        assertEquals("CMXX", instance.toRomano(920));

        assertEquals("CMXXI", instance.toRomano(921));
        assertEquals("CMXXII", instance.toRomano(922));
        assertEquals("CMXXIII", instance.toRomano(923));
        assertEquals("CMXXIV", instance.toRomano(924));
        assertEquals("CMXXV", instance.toRomano(925));
        assertEquals("CMXXVI", instance.toRomano(926));
        assertEquals("CMXXVII", instance.toRomano(927));
        assertEquals("CMXXVIII", instance.toRomano(928));
        assertEquals("CMXXIX", instance.toRomano(929));
        assertEquals("CMXXX", instance.toRomano(930));

        assertEquals("CMXXXI", instance.toRomano(931));
        assertEquals("CMXXXII", instance.toRomano(932));
        assertEquals("CMXXXIII", instance.toRomano(933));
        assertEquals("CMXXXIV", instance.toRomano(934));
        assertEquals("CMXXXV", instance.toRomano(935));
        assertEquals("CMXXXVI", instance.toRomano(936));
        assertEquals("CMXXXVII", instance.toRomano(937));
        assertEquals("CMXXXVIII", instance.toRomano(938));
        assertEquals("CMXXXIX", instance.toRomano(939));
        assertEquals("CMXL", instance.toRomano(940));

        assertEquals("CMXLI", instance.toRomano(941));
        assertEquals("CMXLII", instance.toRomano(942));
        assertEquals("CMXLIII", instance.toRomano(943));
        assertEquals("CMXLIV", instance.toRomano(944));
        assertEquals("CMXLV", instance.toRomano(945));
        assertEquals("CMXLVI", instance.toRomano(946));
        assertEquals("CMXLVII", instance.toRomano(947));
        assertEquals("CMXLVIII", instance.toRomano(948));
        assertEquals("CMXLIX", instance.toRomano(949));
        assertEquals("CML", instance.toRomano(950));

        assertEquals("CMLI", instance.toRomano(951));
        assertEquals("CMLII", instance.toRomano(952));
        assertEquals("CMLIII", instance.toRomano(953));
        assertEquals("CMLIV", instance.toRomano(954));
        assertEquals("CMLV", instance.toRomano(955));
        assertEquals("CMLVI", instance.toRomano(956));
        assertEquals("CMLVII", instance.toRomano(957));
        assertEquals("CMLVIII", instance.toRomano(958));
        assertEquals("CMLIX", instance.toRomano(959));
        assertEquals("CMLX", instance.toRomano(960));

        assertEquals("CMLXI", instance.toRomano(961));
        assertEquals("CMLXII", instance.toRomano(962));
        assertEquals("CMLXIII", instance.toRomano(963));
        assertEquals("CMLXIV", instance.toRomano(964));
        assertEquals("CMLXV", instance.toRomano(965));
        assertEquals("CMLXVI", instance.toRomano(966));
        assertEquals("CMLXVII", instance.toRomano(967));
        assertEquals("CMLXVIII", instance.toRomano(968));
        assertEquals("CMLXIX", instance.toRomano(969));
        assertEquals("CMLXX", instance.toRomano(970));

        assertEquals("CMLXXI", instance.toRomano(971));
        assertEquals("CMLXXII", instance.toRomano(972));
        assertEquals("CMLXXIII", instance.toRomano(973));
        assertEquals("CMLXXIV", instance.toRomano(974));
        assertEquals("CMLXXV", instance.toRomano(975));
        assertEquals("CMLXXVI", instance.toRomano(976));
        assertEquals("CMLXXVII", instance.toRomano(977));
        assertEquals("CMLXXVIII", instance.toRomano(978));
        assertEquals("CMLXXIX", instance.toRomano(979));
        assertEquals("CMLXXX", instance.toRomano(980));

        assertEquals("CMLXXXI", instance.toRomano(981));
        assertEquals("CMLXXXII", instance.toRomano(982));
        assertEquals("CMLXXXIII", instance.toRomano(983));
        assertEquals("CMLXXXIV", instance.toRomano(984));
        assertEquals("CMLXXXV", instance.toRomano(985));
        assertEquals("CMLXXXVI", instance.toRomano(986));
        assertEquals("CMLXXXVII", instance.toRomano(987));
        assertEquals("CMLXXXVIII", instance.toRomano(988));
        assertEquals("CMLXXXIX", instance.toRomano(989));
        assertEquals("CMXC", instance.toRomano(990));

        assertEquals("CMXCI", instance.toRomano(991));
        assertEquals("CMXCII", instance.toRomano(992));
        assertEquals("CMXCIII", instance.toRomano(993));
        assertEquals("CMXCIV", instance.toRomano(994));
        assertEquals("CMXCV", instance.toRomano(995));
        assertEquals("CMXCVI", instance.toRomano(996));
        assertEquals("CMXCVII", instance.toRomano(997));
        assertEquals("CMXCVIII", instance.toRomano(998));
        assertEquals("CMXCIX", instance.toRomano(999));
        assertEquals("M", instance.toRomano(1000));

        assertEquals("MI", instance.toRomano(1001));
        assertEquals("MII", instance.toRomano(1002));
        assertEquals("MIII", instance.toRomano(1003));
        assertEquals("MIV", instance.toRomano(1004));
        assertEquals("MV", instance.toRomano(1005));
        assertEquals("MVI", instance.toRomano(1006));
        assertEquals("MVII", instance.toRomano(1007));
        assertEquals("MVIII", instance.toRomano(1008));
        assertEquals("MIX", instance.toRomano(1009));
        assertEquals("MX", instance.toRomano(1010));

        assertEquals("MXI", instance.toRomano(1011));
        assertEquals("MXII", instance.toRomano(1012));
        assertEquals("MXIII", instance.toRomano(1013));
        assertEquals("MXIV", instance.toRomano(1014));
        assertEquals("MXV", instance.toRomano(1015));
        assertEquals("MXVI", instance.toRomano(1016));
        assertEquals("MXVII", instance.toRomano(1017));
        assertEquals("MXVIII", instance.toRomano(1018));
        assertEquals("MXIX", instance.toRomano(1019));
        assertEquals("MXX", instance.toRomano(1020));

        assertEquals("MXXI", instance.toRomano(1021));
        assertEquals("MXXII", instance.toRomano(1022));
        assertEquals("MXXIII", instance.toRomano(1023));
        assertEquals("MXXIV", instance.toRomano(1024));
        assertEquals("MXXV", instance.toRomano(1025));
        assertEquals("MXXVI", instance.toRomano(1026));
        assertEquals("MXXVII", instance.toRomano(1027));
        assertEquals("MXXVIII", instance.toRomano(1028));
        assertEquals("MXXIX", instance.toRomano(1029));
        assertEquals("MXXX", instance.toRomano(1030));

        assertEquals("MXXXI", instance.toRomano(1031));
        assertEquals("MXXXII", instance.toRomano(1032));
        assertEquals("MXXXIII", instance.toRomano(1033));
        assertEquals("MXXXIV", instance.toRomano(1034));
        assertEquals("MXXXV", instance.toRomano(1035));
        assertEquals("MXXXVI", instance.toRomano(1036));
        assertEquals("MXXXVII", instance.toRomano(1037));
        assertEquals("MXXXVIII", instance.toRomano(1038));
        assertEquals("MXXXIX", instance.toRomano(1039));
        assertEquals("MXL", instance.toRomano(1040));

        assertEquals("MXLI", instance.toRomano(1041));
        assertEquals("MXLII", instance.toRomano(1042));
        assertEquals("MXLIII", instance.toRomano(1043));
        assertEquals("MXLIV", instance.toRomano(1044));
        assertEquals("MXLV", instance.toRomano(1045));
        assertEquals("MXLVI", instance.toRomano(1046));
        assertEquals("MXLVII", instance.toRomano(1047));
        assertEquals("MXLVIII", instance.toRomano(1048));
        assertEquals("MXLIX", instance.toRomano(1049));
        assertEquals("ML", instance.toRomano(1050));

        assertEquals("MLI", instance.toRomano(1051));
        assertEquals("MLII", instance.toRomano(1052));
        assertEquals("MLIII", instance.toRomano(1053));
        assertEquals("MLIV", instance.toRomano(1054));
        assertEquals("MLV", instance.toRomano(1055));
        assertEquals("MLVI", instance.toRomano(1056));
        assertEquals("MLVII", instance.toRomano(1057));
        assertEquals("MLVIII", instance.toRomano(1058));
        assertEquals("MLIX", instance.toRomano(1059));
        assertEquals("MLX", instance.toRomano(1060));

        assertEquals("MLXI", instance.toRomano(1061));
        assertEquals("MLXII", instance.toRomano(1062));
        assertEquals("MLXIII", instance.toRomano(1063));
        assertEquals("MLXIV", instance.toRomano(1064));
        assertEquals("MLXV", instance.toRomano(1065));
        assertEquals("MLXVI", instance.toRomano(1066));
        assertEquals("MLXVII", instance.toRomano(1067));
        assertEquals("MLXVIII", instance.toRomano(1068));
        assertEquals("MLXIX", instance.toRomano(1069));
        assertEquals("MLXX", instance.toRomano(1070));

        assertEquals("MLXXI", instance.toRomano(1071));
        assertEquals("MLXXII", instance.toRomano(1072));
        assertEquals("MLXXIII", instance.toRomano(1073));
        assertEquals("MLXXIV", instance.toRomano(1074));
        assertEquals("MLXXV", instance.toRomano(1075));
        assertEquals("MLXXVI", instance.toRomano(1076));
        assertEquals("MLXXVII", instance.toRomano(1077));
        assertEquals("MLXXVIII", instance.toRomano(1078));
        assertEquals("MLXXIX", instance.toRomano(1079));
        assertEquals("MLXXX", instance.toRomano(1080));

        assertEquals("MLXXXI", instance.toRomano(1081));
        assertEquals("MLXXXII", instance.toRomano(1082));
        assertEquals("MLXXXIII", instance.toRomano(1083));
        assertEquals("MLXXXIV", instance.toRomano(1084));
        assertEquals("MLXXXV", instance.toRomano(1085));
        assertEquals("MLXXXVI", instance.toRomano(1086));
        assertEquals("MLXXXVII", instance.toRomano(1087));
        assertEquals("MLXXXVIII", instance.toRomano(1088));
        assertEquals("MLXXXIX", instance.toRomano(1089));
        assertEquals("MXC", instance.toRomano(1090));

        assertEquals("MXCI", instance.toRomano(1091));
        assertEquals("MXCII", instance.toRomano(1092));
        assertEquals("MXCIII", instance.toRomano(1093));
        assertEquals("MXCIV", instance.toRomano(1094));
        assertEquals("MXCV", instance.toRomano(1095));
        assertEquals("MXCVI", instance.toRomano(1096));
        assertEquals("MXCVII", instance.toRomano(1097));
        assertEquals("MXCVIII", instance.toRomano(1098));
        assertEquals("MXCIX", instance.toRomano(1099));
        assertEquals("MC", instance.toRomano(1100));

        assertEquals("MCI", instance.toRomano(1101));
        assertEquals("MCII", instance.toRomano(1102));
        assertEquals("MCIII", instance.toRomano(1103));
        assertEquals("MCIV", instance.toRomano(1104));
        assertEquals("MCV", instance.toRomano(1105));
        assertEquals("MCVI", instance.toRomano(1106));
        assertEquals("MCVII", instance.toRomano(1107));
        assertEquals("MCVIII", instance.toRomano(1108));
        assertEquals("MCIX", instance.toRomano(1109));
        assertEquals("MCX", instance.toRomano(1110));

        assertEquals("MCXI", instance.toRomano(1111));
        assertEquals("MCXII", instance.toRomano(1112));
        assertEquals("MCXIII", instance.toRomano(1113));
        assertEquals("MCXIV", instance.toRomano(1114));
        assertEquals("MCXV", instance.toRomano(1115));
        assertEquals("MCXVI", instance.toRomano(1116));
        assertEquals("MCXVII", instance.toRomano(1117));
        assertEquals("MCXVIII", instance.toRomano(1118));
        assertEquals("MCXIX", instance.toRomano(1119));
        assertEquals("MCXX", instance.toRomano(1120));

        assertEquals("MCXXI", instance.toRomano(1121));
        assertEquals("MCXXII", instance.toRomano(1122));
        assertEquals("MCXXIII", instance.toRomano(1123));
        assertEquals("MCXXIV", instance.toRomano(1124));
        assertEquals("MCXXV", instance.toRomano(1125));
        assertEquals("MCXXVI", instance.toRomano(1126));
        assertEquals("MCXXVII", instance.toRomano(1127));
        assertEquals("MCXXVIII", instance.toRomano(1128));
        assertEquals("MCXXIX", instance.toRomano(1129));
        assertEquals("MCXXX", instance.toRomano(1130));

        assertEquals("MCXXXI", instance.toRomano(1131));
        assertEquals("MCXXXII", instance.toRomano(1132));
        assertEquals("MCXXXIII", instance.toRomano(1133));
        assertEquals("MCXXXIV", instance.toRomano(1134));
        assertEquals("MCXXXV", instance.toRomano(1135));
        assertEquals("MCXXXVI", instance.toRomano(1136));
        assertEquals("MCXXXVII", instance.toRomano(1137));
        assertEquals("MCXXXVIII", instance.toRomano(1138));
        assertEquals("MCXXXIX", instance.toRomano(1139));
        assertEquals("MCXL", instance.toRomano(1140));

        assertEquals("MCXLI", instance.toRomano(1141));
        assertEquals("MCXLII", instance.toRomano(1142));
        assertEquals("MCXLIII", instance.toRomano(1143));
        assertEquals("MCXLIV", instance.toRomano(1144));
        assertEquals("MCXLV", instance.toRomano(1145));
        assertEquals("MCXLVI", instance.toRomano(1146));
        assertEquals("MCXLVII", instance.toRomano(1147));
        assertEquals("MCXLVIII", instance.toRomano(1148));
        assertEquals("MCXLIX", instance.toRomano(1149));
        assertEquals("MCL", instance.toRomano(1150));

        assertEquals("MCLI", instance.toRomano(1151));
        assertEquals("MCLII", instance.toRomano(1152));
        assertEquals("MCLIII", instance.toRomano(1153));
        assertEquals("MCLIV", instance.toRomano(1154));
        assertEquals("MCLV", instance.toRomano(1155));
        assertEquals("MCLVI", instance.toRomano(1156));
        assertEquals("MCLVII", instance.toRomano(1157));
        assertEquals("MCLVIII", instance.toRomano(1158));
        assertEquals("MCLIX", instance.toRomano(1159));
        assertEquals("MCLX", instance.toRomano(1160));

        assertEquals("MCLXI", instance.toRomano(1161));
        assertEquals("MCLXII", instance.toRomano(1162));
        assertEquals("MCLXIII", instance.toRomano(1163));
        assertEquals("MCLXIV", instance.toRomano(1164));
        assertEquals("MCLXV", instance.toRomano(1165));
        assertEquals("MCLXVI", instance.toRomano(1166));
        assertEquals("MCLXVII", instance.toRomano(1167));
        assertEquals("MCLXVIII", instance.toRomano(1168));
        assertEquals("MCLXIX", instance.toRomano(1169));
        assertEquals("MCLXX", instance.toRomano(1170));

        assertEquals("MCLXXI", instance.toRomano(1171));
        assertEquals("MCLXXII", instance.toRomano(1172));
        assertEquals("MCLXXIII", instance.toRomano(1173));
        assertEquals("MCLXXIV", instance.toRomano(1174));
        assertEquals("MCLXXV", instance.toRomano(1175));
        assertEquals("MCLXXVI", instance.toRomano(1176));
        assertEquals("MCLXXVII", instance.toRomano(1177));
        assertEquals("MCLXXVIII", instance.toRomano(1178));
        assertEquals("MCLXXIX", instance.toRomano(1179));
        assertEquals("MCLXXX", instance.toRomano(1180));

        assertEquals("MCLXXXI", instance.toRomano(1181));
        assertEquals("MCLXXXII", instance.toRomano(1182));
        assertEquals("MCLXXXIII", instance.toRomano(1183));
        assertEquals("MCLXXXIV", instance.toRomano(1184));
        assertEquals("MCLXXXV", instance.toRomano(1185));
        assertEquals("MCLXXXVI", instance.toRomano(1186));
        assertEquals("MCLXXXVII", instance.toRomano(1187));
        assertEquals("MCLXXXVIII", instance.toRomano(1188));
        assertEquals("MCLXXXIX", instance.toRomano(1189));
        assertEquals("MCXC", instance.toRomano(1190));

        assertEquals("MCXCI", instance.toRomano(1191));
        assertEquals("MCXCII", instance.toRomano(1192));
        assertEquals("MCXCIII", instance.toRomano(1193));
        assertEquals("MCXCIV", instance.toRomano(1194));
        assertEquals("MCXCV", instance.toRomano(1195));
        assertEquals("MCXCVI", instance.toRomano(1196));
        assertEquals("MCXCVII", instance.toRomano(1197));
        assertEquals("MCXCVIII", instance.toRomano(1198));
        assertEquals("MCXCIX", instance.toRomano(1199));
        assertEquals("MCC", instance.toRomano(1200));

        assertEquals("MCCI", instance.toRomano(1201));
        assertEquals("MCCII", instance.toRomano(1202));
        assertEquals("MCCIII", instance.toRomano(1203));
        assertEquals("MCCIV", instance.toRomano(1204));
        assertEquals("MCCV", instance.toRomano(1205));
        assertEquals("MCCVI", instance.toRomano(1206));
        assertEquals("MCCVII", instance.toRomano(1207));
        assertEquals("MCCVIII", instance.toRomano(1208));
        assertEquals("MCCIX", instance.toRomano(1209));
        assertEquals("MCCX", instance.toRomano(1210));

        assertEquals("MCCXI", instance.toRomano(1211));
        assertEquals("MCCXII", instance.toRomano(1212));
        assertEquals("MCCXIII", instance.toRomano(1213));
        assertEquals("MCCXIV", instance.toRomano(1214));
        assertEquals("MCCXV", instance.toRomano(1215));
        assertEquals("MCCXVI", instance.toRomano(1216));
        assertEquals("MCCXVII", instance.toRomano(1217));
        assertEquals("MCCXVIII", instance.toRomano(1218));
        assertEquals("MCCXIX", instance.toRomano(1219));
        assertEquals("MCCXX", instance.toRomano(1220));

        assertEquals("MCCXXI", instance.toRomano(1221));
        assertEquals("MCCXXII", instance.toRomano(1222));
        assertEquals("MCCXXIII", instance.toRomano(1223));
        assertEquals("MCCXXIV", instance.toRomano(1224));
        assertEquals("MCCXXV", instance.toRomano(1225));
        assertEquals("MCCXXVI", instance.toRomano(1226));
        assertEquals("MCCXXVII", instance.toRomano(1227));
        assertEquals("MCCXXVIII", instance.toRomano(1228));
        assertEquals("MCCXXIX", instance.toRomano(1229));
        assertEquals("MCCXXX", instance.toRomano(1230));

        assertEquals("MCCXXXI", instance.toRomano(1231));
        assertEquals("MCCXXXII", instance.toRomano(1232));
        assertEquals("MCCXXXIII", instance.toRomano(1233));
        assertEquals("MCCXXXIV", instance.toRomano(1234));
        assertEquals("MCCXXXV", instance.toRomano(1235));
        assertEquals("MCCXXXVI", instance.toRomano(1236));
        assertEquals("MCCXXXVII", instance.toRomano(1237));
        assertEquals("MCCXXXVIII", instance.toRomano(1238));
        assertEquals("MCCXXXIX", instance.toRomano(1239));
        assertEquals("MCCXL", instance.toRomano(1240));

        assertEquals("MCCXLI", instance.toRomano(1241));
        assertEquals("MCCXLII", instance.toRomano(1242));
        assertEquals("MCCXLIII", instance.toRomano(1243));
        assertEquals("MCCXLIV", instance.toRomano(1244));
        assertEquals("MCCXLV", instance.toRomano(1245));
        assertEquals("MCCXLVI", instance.toRomano(1246));
        assertEquals("MCCXLVII", instance.toRomano(1247));
        assertEquals("MCCXLVIII", instance.toRomano(1248));
        assertEquals("MCCXLIX", instance.toRomano(1249));
        assertEquals("MCCL", instance.toRomano(1250));

        assertEquals("MCCLI", instance.toRomano(1251));
        assertEquals("MCCLII", instance.toRomano(1252));
        assertEquals("MCCLIII", instance.toRomano(1253));
        assertEquals("MCCLIV", instance.toRomano(1254));
        assertEquals("MCCLV", instance.toRomano(1255));
        assertEquals("MCCLVI", instance.toRomano(1256));
        assertEquals("MCCLVII", instance.toRomano(1257));
        assertEquals("MCCLVIII", instance.toRomano(1258));
        assertEquals("MCCLIX", instance.toRomano(1259));
        assertEquals("MCCLX", instance.toRomano(1260));

        assertEquals("MCCLXI", instance.toRomano(1261));
        assertEquals("MCCLXII", instance.toRomano(1262));
        assertEquals("MCCLXIII", instance.toRomano(1263));
        assertEquals("MCCLXIV", instance.toRomano(1264));
        assertEquals("MCCLXV", instance.toRomano(1265));
        assertEquals("MCCLXVI", instance.toRomano(1266));
        assertEquals("MCCLXVII", instance.toRomano(1267));
        assertEquals("MCCLXVIII", instance.toRomano(1268));
        assertEquals("MCCLXIX", instance.toRomano(1269));
        assertEquals("MCCLXX", instance.toRomano(1270));

        assertEquals("MCCLXXI", instance.toRomano(1271));
        assertEquals("MCCLXXII", instance.toRomano(1272));
        assertEquals("MCCLXXIII", instance.toRomano(1273));
        assertEquals("MCCLXXIV", instance.toRomano(1274));
        assertEquals("MCCLXXV", instance.toRomano(1275));
        assertEquals("MCCLXXVI", instance.toRomano(1276));
        assertEquals("MCCLXXVII", instance.toRomano(1277));
        assertEquals("MCCLXXVIII", instance.toRomano(1278));
        assertEquals("MCCLXXIX", instance.toRomano(1279));
        assertEquals("MCCLXXX", instance.toRomano(1280));

        assertEquals("MCCLXXXI", instance.toRomano(1281));
        assertEquals("MCCLXXXII", instance.toRomano(1282));
        assertEquals("MCCLXXXIII", instance.toRomano(1283));
        assertEquals("MCCLXXXIV", instance.toRomano(1284));
        assertEquals("MCCLXXXV", instance.toRomano(1285));
        assertEquals("MCCLXXXVI", instance.toRomano(1286));
        assertEquals("MCCLXXXVII", instance.toRomano(1287));
        assertEquals("MCCLXXXVIII", instance.toRomano(1288));
        assertEquals("MCCLXXXIX", instance.toRomano(1289));
        assertEquals("MCCXC", instance.toRomano(1290));

        assertEquals("MCCXCI", instance.toRomano(1291));
        assertEquals("MCCXCII", instance.toRomano(1292));
        assertEquals("MCCXCIII", instance.toRomano(1293));
        assertEquals("MCCXCIV", instance.toRomano(1294));
        assertEquals("MCCXCV", instance.toRomano(1295));
        assertEquals("MCCXCVI", instance.toRomano(1296));
        assertEquals("MCCXCVII", instance.toRomano(1297));
        assertEquals("MCCXCVIII", instance.toRomano(1298));
        assertEquals("MCCXCIX", instance.toRomano(1299));
        assertEquals("MCCC", instance.toRomano(1300));

        assertEquals("MCCCI", instance.toRomano(1301));
        assertEquals("MCCCII", instance.toRomano(1302));
        assertEquals("MCCCIII", instance.toRomano(1303));
        assertEquals("MCCCIV", instance.toRomano(1304));
        assertEquals("MCCCV", instance.toRomano(1305));
        assertEquals("MCCCVI", instance.toRomano(1306));
        assertEquals("MCCCVII", instance.toRomano(1307));
        assertEquals("MCCCVIII", instance.toRomano(1308));
        assertEquals("MCCCIX", instance.toRomano(1309));
        assertEquals("MCCCX", instance.toRomano(1310));

        assertEquals("MCCCXI", instance.toRomano(1311));
        assertEquals("MCCCXII", instance.toRomano(1312));
        assertEquals("MCCCXIII", instance.toRomano(1313));
        assertEquals("MCCCXIV", instance.toRomano(1314));
        assertEquals("MCCCXV", instance.toRomano(1315));
        assertEquals("MCCCXVI", instance.toRomano(1316));
        assertEquals("MCCCXVII", instance.toRomano(1317));
        assertEquals("MCCCXVIII", instance.toRomano(1318));
        assertEquals("MCCCXIX", instance.toRomano(1319));
        assertEquals("MCCCXX", instance.toRomano(1320));

        assertEquals("MCCCXXI", instance.toRomano(1321));
        assertEquals("MCCCXXII", instance.toRomano(1322));
        assertEquals("MCCCXXIII", instance.toRomano(1323));
        assertEquals("MCCCXXIV", instance.toRomano(1324));
        assertEquals("MCCCXXV", instance.toRomano(1325));
        assertEquals("MCCCXXVI", instance.toRomano(1326));
        assertEquals("MCCCXXVII", instance.toRomano(1327));
        assertEquals("MCCCXXVIII", instance.toRomano(1328));
        assertEquals("MCCCXXIX", instance.toRomano(1329));
        assertEquals("MCCCXXX", instance.toRomano(1330));

        assertEquals("MCCCXXXI", instance.toRomano(1331));
        assertEquals("MCCCXXXII", instance.toRomano(1332));
        assertEquals("MCCCXXXIII", instance.toRomano(1333));
        assertEquals("MCCCXXXIV", instance.toRomano(1334));
        assertEquals("MCCCXXXV", instance.toRomano(1335));
        assertEquals("MCCCXXXVI", instance.toRomano(1336));
        assertEquals("MCCCXXXVII", instance.toRomano(1337));
        assertEquals("MCCCXXXVIII", instance.toRomano(1338));
        assertEquals("MCCCXXXIX", instance.toRomano(1339));
        assertEquals("MCCCXL", instance.toRomano(1340));

        assertEquals("MCCCXLI", instance.toRomano(1341));
        assertEquals("MCCCXLII", instance.toRomano(1342));
        assertEquals("MCCCXLIII", instance.toRomano(1343));
        assertEquals("MCCCXLIV", instance.toRomano(1344));
        assertEquals("MCCCXLV", instance.toRomano(1345));
        assertEquals("MCCCXLVI", instance.toRomano(1346));
        assertEquals("MCCCXLVII", instance.toRomano(1347));
        assertEquals("MCCCXLVIII", instance.toRomano(1348));
        assertEquals("MCCCXLIX", instance.toRomano(1349));
        assertEquals("MCCCL", instance.toRomano(1350));

        assertEquals("MCCCLI", instance.toRomano(1351));
        assertEquals("MCCCLII", instance.toRomano(1352));
        assertEquals("MCCCLIII", instance.toRomano(1353));
        assertEquals("MCCCLIV", instance.toRomano(1354));
        assertEquals("MCCCLV", instance.toRomano(1355));
        assertEquals("MCCCLVI", instance.toRomano(1356));
        assertEquals("MCCCLVII", instance.toRomano(1357));
        assertEquals("MCCCLVIII", instance.toRomano(1358));
        assertEquals("MCCCLIX", instance.toRomano(1359));
        assertEquals("MCCCLX", instance.toRomano(1360));

        assertEquals("MCCCLXI", instance.toRomano(1361));
        assertEquals("MCCCLXII", instance.toRomano(1362));
        assertEquals("MCCCLXIII", instance.toRomano(1363));
        assertEquals("MCCCLXIV", instance.toRomano(1364));
        assertEquals("MCCCLXV", instance.toRomano(1365));
        assertEquals("MCCCLXVI", instance.toRomano(1366));
        assertEquals("MCCCLXVII", instance.toRomano(1367));
        assertEquals("MCCCLXVIII", instance.toRomano(1368));
        assertEquals("MCCCLXIX", instance.toRomano(1369));
        assertEquals("MCCCLXX", instance.toRomano(1370));

        assertEquals("MCCCLXXI", instance.toRomano(1371));
        assertEquals("MCCCLXXII", instance.toRomano(1372));
        assertEquals("MCCCLXXIII", instance.toRomano(1373));
        assertEquals("MCCCLXXIV", instance.toRomano(1374));
        assertEquals("MCCCLXXV", instance.toRomano(1375));
        assertEquals("MCCCLXXVI", instance.toRomano(1376));
        assertEquals("MCCCLXXVII", instance.toRomano(1377));
        assertEquals("MCCCLXXVIII", instance.toRomano(1378));
        assertEquals("MCCCLXXIX", instance.toRomano(1379));
        assertEquals("MCCCLXXX", instance.toRomano(1380));

        assertEquals("MCCCLXXXI", instance.toRomano(1381));
        assertEquals("MCCCLXXXII", instance.toRomano(1382));
        assertEquals("MCCCLXXXIII", instance.toRomano(1383));
        assertEquals("MCCCLXXXIV", instance.toRomano(1384));
        assertEquals("MCCCLXXXV", instance.toRomano(1385));
        assertEquals("MCCCLXXXVI", instance.toRomano(1386));
        assertEquals("MCCCLXXXVII", instance.toRomano(1387));
        assertEquals("MCCCLXXXVIII", instance.toRomano(1388));
        assertEquals("MCCCLXXXIX", instance.toRomano(1389));
        assertEquals("MCCCXC", instance.toRomano(1390));

        assertEquals("MCCCXCI", instance.toRomano(1391));
        assertEquals("MCCCXCII", instance.toRomano(1392));
        assertEquals("MCCCXCIII", instance.toRomano(1393));
        assertEquals("MCCCXCIV", instance.toRomano(1394));
        assertEquals("MCCCXCV", instance.toRomano(1395));
        assertEquals("MCCCXCVI", instance.toRomano(1396));
        assertEquals("MCCCXCVII", instance.toRomano(1397));
        assertEquals("MCCCXCVIII", instance.toRomano(1398));
        assertEquals("MCCCXCIX", instance.toRomano(1399));
        assertEquals("MCD", instance.toRomano(1400));

        assertEquals("MCDI", instance.toRomano(1401));
        assertEquals("MCDII", instance.toRomano(1402));
        assertEquals("MCDIII", instance.toRomano(1403));
        assertEquals("MCDIV", instance.toRomano(1404));
        assertEquals("MCDV", instance.toRomano(1405));
        assertEquals("MCDVI", instance.toRomano(1406));
        assertEquals("MCDVII", instance.toRomano(1407));
        assertEquals("MCDVIII", instance.toRomano(1408));
        assertEquals("MCDIX", instance.toRomano(1409));
        assertEquals("MCDX", instance.toRomano(1410));

        assertEquals("MCDXI", instance.toRomano(1411));
        assertEquals("MCDXII", instance.toRomano(1412));
        assertEquals("MCDXIII", instance.toRomano(1413));
        assertEquals("MCDXIV", instance.toRomano(1414));
        assertEquals("MCDXV", instance.toRomano(1415));
        assertEquals("MCDXVI", instance.toRomano(1416));
        assertEquals("MCDXVII", instance.toRomano(1417));
        assertEquals("MCDXVIII", instance.toRomano(1418));
        assertEquals("MCDXIX", instance.toRomano(1419));
        assertEquals("MCDXX", instance.toRomano(1420));

        assertEquals("MCDXXI", instance.toRomano(1421));
        assertEquals("MCDXXII", instance.toRomano(1422));
        assertEquals("MCDXXIII", instance.toRomano(1423));
        assertEquals("MCDXXIV", instance.toRomano(1424));
        assertEquals("MCDXXV", instance.toRomano(1425));
        assertEquals("MCDXXVI", instance.toRomano(1426));
        assertEquals("MCDXXVII", instance.toRomano(1427));
        assertEquals("MCDXXVIII", instance.toRomano(1428));
        assertEquals("MCDXXIX", instance.toRomano(1429));
        assertEquals("MCDXXX", instance.toRomano(1430));

        assertEquals("MCDXXXI", instance.toRomano(1431));
        assertEquals("MCDXXXII", instance.toRomano(1432));
        assertEquals("MCDXXXIII", instance.toRomano(1433));
        assertEquals("MCDXXXIV", instance.toRomano(1434));
        assertEquals("MCDXXXV", instance.toRomano(1435));
        assertEquals("MCDXXXVI", instance.toRomano(1436));
        assertEquals("MCDXXXVII", instance.toRomano(1437));
        assertEquals("MCDXXXVIII", instance.toRomano(1438));
        assertEquals("MCDXXXIX", instance.toRomano(1439));
        assertEquals("MCDXL", instance.toRomano(1440));

        assertEquals("MCDXLI", instance.toRomano(1441));
        assertEquals("MCDXLII", instance.toRomano(1442));
        assertEquals("MCDXLIII", instance.toRomano(1443));
        assertEquals("MCDXLIV", instance.toRomano(1444));
        assertEquals("MCDXLV", instance.toRomano(1445));
        assertEquals("MCDXLVI", instance.toRomano(1446));
        assertEquals("MCDXLVII", instance.toRomano(1447));
        assertEquals("MCDXLVIII", instance.toRomano(1448));
        assertEquals("MCDXLIX", instance.toRomano(1449));
        assertEquals("MCDL", instance.toRomano(1450));

        assertEquals("MCDLI", instance.toRomano(1451));
        assertEquals("MCDLII", instance.toRomano(1452));
        assertEquals("MCDLIII", instance.toRomano(1453));
        assertEquals("MCDLIV", instance.toRomano(1454));
        assertEquals("MCDLV", instance.toRomano(1455));
        assertEquals("MCDLVI", instance.toRomano(1456));
        assertEquals("MCDLVII", instance.toRomano(1457));
        assertEquals("MCDLVIII", instance.toRomano(1458));
        assertEquals("MCDLIX", instance.toRomano(1459));
        assertEquals("MCDLX", instance.toRomano(1460));

        assertEquals("MCDLXI", instance.toRomano(1461));
        assertEquals("MCDLXII", instance.toRomano(1462));
        assertEquals("MCDLXIII", instance.toRomano(1463));
        assertEquals("MCDLXIV", instance.toRomano(1464));
        assertEquals("MCDLXV", instance.toRomano(1465));
        assertEquals("MCDLXVI", instance.toRomano(1466));
        assertEquals("MCDLXVII", instance.toRomano(1467));
        assertEquals("MCDLXVIII", instance.toRomano(1468));
        assertEquals("MCDLXIX", instance.toRomano(1469));
        assertEquals("MCDLXX", instance.toRomano(1470));

        assertEquals("MCDLXXI", instance.toRomano(1471));
        assertEquals("MCDLXXII", instance.toRomano(1472));
        assertEquals("MCDLXXIII", instance.toRomano(1473));
        assertEquals("MCDLXXIV", instance.toRomano(1474));
        assertEquals("MCDLXXV", instance.toRomano(1475));
        assertEquals("MCDLXXVI", instance.toRomano(1476));
        assertEquals("MCDLXXVII", instance.toRomano(1477));
        assertEquals("MCDLXXVIII", instance.toRomano(1478));
        assertEquals("MCDLXXIX", instance.toRomano(1479));
        assertEquals("MCDLXXX", instance.toRomano(1480));

        assertEquals("MCDLXXXI", instance.toRomano(1481));
        assertEquals("MCDLXXXII", instance.toRomano(1482));
        assertEquals("MCDLXXXIII", instance.toRomano(1483));
        assertEquals("MCDLXXXIV", instance.toRomano(1484));
        assertEquals("MCDLXXXV", instance.toRomano(1485));
        assertEquals("MCDLXXXVI", instance.toRomano(1486));
        assertEquals("MCDLXXXVII", instance.toRomano(1487));
        assertEquals("MCDLXXXVIII", instance.toRomano(1488));
        assertEquals("MCDLXXXIX", instance.toRomano(1489));
        assertEquals("MCDXC", instance.toRomano(1490));

        assertEquals("MCDXCI", instance.toRomano(1491));
        assertEquals("MCDXCII", instance.toRomano(1492));
        assertEquals("MCDXCIII", instance.toRomano(1493));
        assertEquals("MCDXCIV", instance.toRomano(1494));
        assertEquals("MCDXCV", instance.toRomano(1495));
        assertEquals("MCDXCVI", instance.toRomano(1496));
        assertEquals("MCDXCVII", instance.toRomano(1497));
        assertEquals("MCDXCVIII", instance.toRomano(1498));
        assertEquals("MCDXCIX", instance.toRomano(1499));
        assertEquals("MD", instance.toRomano(1500));

        assertEquals("MDI", instance.toRomano(1501));
        assertEquals("MDII", instance.toRomano(1502));
        assertEquals("MDIII", instance.toRomano(1503));
        assertEquals("MDIV", instance.toRomano(1504));
        assertEquals("MDV", instance.toRomano(1505));
        assertEquals("MDVI", instance.toRomano(1506));
        assertEquals("MDVII", instance.toRomano(1507));
        assertEquals("MDVIII", instance.toRomano(1508));
        assertEquals("MDIX", instance.toRomano(1509));
        assertEquals("MDX", instance.toRomano(1510));

        assertEquals("MDXI", instance.toRomano(1511));
        assertEquals("MDXII", instance.toRomano(1512));
        assertEquals("MDXIII", instance.toRomano(1513));
        assertEquals("MDXIV", instance.toRomano(1514));
        assertEquals("MDXV", instance.toRomano(1515));
        assertEquals("MDXVI", instance.toRomano(1516));
        assertEquals("MDXVII", instance.toRomano(1517));
        assertEquals("MDXVIII", instance.toRomano(1518));
        assertEquals("MDXIX", instance.toRomano(1519));
        assertEquals("MDXX", instance.toRomano(1520));

        assertEquals("MDXXI", instance.toRomano(1521));
        assertEquals("MDXXII", instance.toRomano(1522));
        assertEquals("MDXXIII", instance.toRomano(1523));
        assertEquals("MDXXIV", instance.toRomano(1524));
        assertEquals("MDXXV", instance.toRomano(1525));
        assertEquals("MDXXVI", instance.toRomano(1526));
        assertEquals("MDXXVII", instance.toRomano(1527));
        assertEquals("MDXXVIII", instance.toRomano(1528));
        assertEquals("MDXXIX", instance.toRomano(1529));
        assertEquals("MDXXX", instance.toRomano(1530));

        assertEquals("MDXXXI", instance.toRomano(1531));
        assertEquals("MDXXXII", instance.toRomano(1532));
        assertEquals("MDXXXIII", instance.toRomano(1533));
        assertEquals("MDXXXIV", instance.toRomano(1534));
        assertEquals("MDXXXV", instance.toRomano(1535));
        assertEquals("MDXXXVI", instance.toRomano(1536));
        assertEquals("MDXXXVII", instance.toRomano(1537));
        assertEquals("MDXXXVIII", instance.toRomano(1538));
        assertEquals("MDXXXIX", instance.toRomano(1539));
        assertEquals("MDXL", instance.toRomano(1540));

        assertEquals("MDXLI", instance.toRomano(1541));
        assertEquals("MDXLII", instance.toRomano(1542));
        assertEquals("MDXLIII", instance.toRomano(1543));
        assertEquals("MDXLIV", instance.toRomano(1544));
        assertEquals("MDXLV", instance.toRomano(1545));
        assertEquals("MDXLVI", instance.toRomano(1546));
        assertEquals("MDXLVII", instance.toRomano(1547));
        assertEquals("MDXLVIII", instance.toRomano(1548));
        assertEquals("MDXLIX", instance.toRomano(1549));
        assertEquals("MDL", instance.toRomano(1550));

        assertEquals("MDLI", instance.toRomano(1551));
        assertEquals("MDLII", instance.toRomano(1552));
        assertEquals("MDLIII", instance.toRomano(1553));
        assertEquals("MDLIV", instance.toRomano(1554));
        assertEquals("MDLV", instance.toRomano(1555));
        assertEquals("MDLVI", instance.toRomano(1556));
        assertEquals("MDLVII", instance.toRomano(1557));
        assertEquals("MDLVIII", instance.toRomano(1558));
        assertEquals("MDLIX", instance.toRomano(1559));
        assertEquals("MDLX", instance.toRomano(1560));

        assertEquals("MDLXI", instance.toRomano(1561));
        assertEquals("MDLXII", instance.toRomano(1562));
        assertEquals("MDLXIII", instance.toRomano(1563));
        assertEquals("MDLXIV", instance.toRomano(1564));
        assertEquals("MDLXV", instance.toRomano(1565));
        assertEquals("MDLXVI", instance.toRomano(1566));
        assertEquals("MDLXVII", instance.toRomano(1567));
        assertEquals("MDLXVIII", instance.toRomano(1568));
        assertEquals("MDLXIX", instance.toRomano(1569));
        assertEquals("MDLXX", instance.toRomano(1570));

        assertEquals("MDLXXI", instance.toRomano(1571));
        assertEquals("MDLXXII", instance.toRomano(1572));
        assertEquals("MDLXXIII", instance.toRomano(1573));
        assertEquals("MDLXXIV", instance.toRomano(1574));
        assertEquals("MDLXXV", instance.toRomano(1575));
        assertEquals("MDLXXVI", instance.toRomano(1576));
        assertEquals("MDLXXVII", instance.toRomano(1577));
        assertEquals("MDLXXVIII", instance.toRomano(1578));
        assertEquals("MDLXXIX", instance.toRomano(1579));
        assertEquals("MDLXXX", instance.toRomano(1580));

        assertEquals("MDLXXXI", instance.toRomano(1581));
        assertEquals("MDLXXXII", instance.toRomano(1582));
        assertEquals("MDLXXXIII", instance.toRomano(1583));
        assertEquals("MDLXXXIV", instance.toRomano(1584));
        assertEquals("MDLXXXV", instance.toRomano(1585));
        assertEquals("MDLXXXVI", instance.toRomano(1586));
        assertEquals("MDLXXXVII", instance.toRomano(1587));
        assertEquals("MDLXXXVIII", instance.toRomano(1588));
        assertEquals("MDLXXXIX", instance.toRomano(1589));
        assertEquals("MDXC", instance.toRomano(1590));

        assertEquals("MDXCI", instance.toRomano(1591));
        assertEquals("MDXCII", instance.toRomano(1592));
        assertEquals("MDXCIII", instance.toRomano(1593));
        assertEquals("MDXCIV", instance.toRomano(1594));
        assertEquals("MDXCV", instance.toRomano(1595));
        assertEquals("MDXCVI", instance.toRomano(1596));
        assertEquals("MDXCVII", instance.toRomano(1597));
        assertEquals("MDXCVIII", instance.toRomano(1598));
        assertEquals("MDXCIX", instance.toRomano(1599));
        assertEquals("MDC", instance.toRomano(1600));

        assertEquals("MDCI", instance.toRomano(1601));
        assertEquals("MDCII", instance.toRomano(1602));
        assertEquals("MDCIII", instance.toRomano(1603));
        assertEquals("MDCIV", instance.toRomano(1604));
        assertEquals("MDCV", instance.toRomano(1605));
        assertEquals("MDCVI", instance.toRomano(1606));
        assertEquals("MDCVII", instance.toRomano(1607));
        assertEquals("MDCVIII", instance.toRomano(1608));
        assertEquals("MDCIX", instance.toRomano(1609));
        assertEquals("MDCX", instance.toRomano(1610));

        assertEquals("MDCXI", instance.toRomano(1611));
        assertEquals("MDCXII", instance.toRomano(1612));
        assertEquals("MDCXIII", instance.toRomano(1613));
        assertEquals("MDCXIV", instance.toRomano(1614));
        assertEquals("MDCXV", instance.toRomano(1615));
        assertEquals("MDCXVI", instance.toRomano(1616));
        assertEquals("MDCXVII", instance.toRomano(1617));
        assertEquals("MDCXVIII", instance.toRomano(1618));
        assertEquals("MDCXIX", instance.toRomano(1619));
        assertEquals("MDCXX", instance.toRomano(1620));

        assertEquals("MDCXXI", instance.toRomano(1621));
        assertEquals("MDCXXII", instance.toRomano(1622));
        assertEquals("MDCXXIII", instance.toRomano(1623));
        assertEquals("MDCXXIV", instance.toRomano(1624));
        assertEquals("MDCXXV", instance.toRomano(1625));
        assertEquals("MDCXXVI", instance.toRomano(1626));
        assertEquals("MDCXXVII", instance.toRomano(1627));
        assertEquals("MDCXXVIII", instance.toRomano(1628));
        assertEquals("MDCXXIX", instance.toRomano(1629));
        assertEquals("MDCXXX", instance.toRomano(1630));

        assertEquals("MDCXXXI", instance.toRomano(1631));
        assertEquals("MDCXXXII", instance.toRomano(1632));
        assertEquals("MDCXXXIII", instance.toRomano(1633));
        assertEquals("MDCXXXIV", instance.toRomano(1634));
        assertEquals("MDCXXXV", instance.toRomano(1635));
        assertEquals("MDCXXXVI", instance.toRomano(1636));
        assertEquals("MDCXXXVII", instance.toRomano(1637));
        assertEquals("MDCXXXVIII", instance.toRomano(1638));
        assertEquals("MDCXXXIX", instance.toRomano(1639));
        assertEquals("MDCXL", instance.toRomano(1640));

        assertEquals("MDCXLI", instance.toRomano(1641));
        assertEquals("MDCXLII", instance.toRomano(1642));
        assertEquals("MDCXLIII", instance.toRomano(1643));
        assertEquals("MDCXLIV", instance.toRomano(1644));
        assertEquals("MDCXLV", instance.toRomano(1645));
        assertEquals("MDCXLVI", instance.toRomano(1646));
        assertEquals("MDCXLVII", instance.toRomano(1647));
        assertEquals("MDCXLVIII", instance.toRomano(1648));
        assertEquals("MDCXLIX", instance.toRomano(1649));
        assertEquals("MDCL", instance.toRomano(1650));

        assertEquals("MDCLI", instance.toRomano(1651));
        assertEquals("MDCLII", instance.toRomano(1652));
        assertEquals("MDCLIII", instance.toRomano(1653));
        assertEquals("MDCLIV", instance.toRomano(1654));
        assertEquals("MDCLV", instance.toRomano(1655));
        assertEquals("MDCLVI", instance.toRomano(1656));
        assertEquals("MDCLVII", instance.toRomano(1657));
        assertEquals("MDCLVIII", instance.toRomano(1658));
        assertEquals("MDCLIX", instance.toRomano(1659));
        assertEquals("MDCLX", instance.toRomano(1660));

        assertEquals("MDCLXI", instance.toRomano(1661));
        assertEquals("MDCLXII", instance.toRomano(1662));
        assertEquals("MDCLXIII", instance.toRomano(1663));
        assertEquals("MDCLXIV", instance.toRomano(1664));
        assertEquals("MDCLXV", instance.toRomano(1665));
        assertEquals("MDCLXVI", instance.toRomano(1666));
        assertEquals("MDCLXVII", instance.toRomano(1667));
        assertEquals("MDCLXVIII", instance.toRomano(1668));
        assertEquals("MDCLXIX", instance.toRomano(1669));
        assertEquals("MDCLXX", instance.toRomano(1670));

        assertEquals("MDCLXXI", instance.toRomano(1671));
        assertEquals("MDCLXXII", instance.toRomano(1672));
        assertEquals("MDCLXXIII", instance.toRomano(1673));
        assertEquals("MDCLXXIV", instance.toRomano(1674));
        assertEquals("MDCLXXV", instance.toRomano(1675));
        assertEquals("MDCLXXVI", instance.toRomano(1676));
        assertEquals("MDCLXXVII", instance.toRomano(1677));
        assertEquals("MDCLXXVIII", instance.toRomano(1678));
        assertEquals("MDCLXXIX", instance.toRomano(1679));
        assertEquals("MDCLXXX", instance.toRomano(1680));

        assertEquals("MDCLXXXI", instance.toRomano(1681));
        assertEquals("MDCLXXXII", instance.toRomano(1682));
        assertEquals("MDCLXXXIII", instance.toRomano(1683));
        assertEquals("MDCLXXXIV", instance.toRomano(1684));
        assertEquals("MDCLXXXV", instance.toRomano(1685));
        assertEquals("MDCLXXXVI", instance.toRomano(1686));
        assertEquals("MDCLXXXVII", instance.toRomano(1687));
        assertEquals("MDCLXXXVIII", instance.toRomano(1688));
        assertEquals("MDCLXXXIX", instance.toRomano(1689));
        assertEquals("MDCXC", instance.toRomano(1690));

        assertEquals("MDCXCI", instance.toRomano(1691));
        assertEquals("MDCXCII", instance.toRomano(1692));
        assertEquals("MDCXCIII", instance.toRomano(1693));
        assertEquals("MDCXCIV", instance.toRomano(1694));
        assertEquals("MDCXCV", instance.toRomano(1695));
        assertEquals("MDCXCVI", instance.toRomano(1696));
        assertEquals("MDCXCVII", instance.toRomano(1697));
        assertEquals("MDCXCVIII", instance.toRomano(1698));
        assertEquals("MDCXCIX", instance.toRomano(1699));
        assertEquals("MDCC", instance.toRomano(1700));

        assertEquals("MDCCI", instance.toRomano(1701));
        assertEquals("MDCCII", instance.toRomano(1702));
        assertEquals("MDCCIII", instance.toRomano(1703));
        assertEquals("MDCCIV", instance.toRomano(1704));
        assertEquals("MDCCV", instance.toRomano(1705));
        assertEquals("MDCCVI", instance.toRomano(1706));
        assertEquals("MDCCVII", instance.toRomano(1707));
        assertEquals("MDCCVIII", instance.toRomano(1708));
        assertEquals("MDCCIX", instance.toRomano(1709));
        assertEquals("MDCCX", instance.toRomano(1710));

        assertEquals("MDCCXI", instance.toRomano(1711));
        assertEquals("MDCCXII", instance.toRomano(1712));
        assertEquals("MDCCXIII", instance.toRomano(1713));
        assertEquals("MDCCXIV", instance.toRomano(1714));
        assertEquals("MDCCXV", instance.toRomano(1715));
        assertEquals("MDCCXVI", instance.toRomano(1716));
        assertEquals("MDCCXVII", instance.toRomano(1717));
        assertEquals("MDCCXVIII", instance.toRomano(1718));
        assertEquals("MDCCXIX", instance.toRomano(1719));
        assertEquals("MDCCXX", instance.toRomano(1720));

        assertEquals("MDCCXXI", instance.toRomano(1721));
        assertEquals("MDCCXXII", instance.toRomano(1722));
        assertEquals("MDCCXXIII", instance.toRomano(1723));
        assertEquals("MDCCXXIV", instance.toRomano(1724));
        assertEquals("MDCCXXV", instance.toRomano(1725));
        assertEquals("MDCCXXVI", instance.toRomano(1726));
        assertEquals("MDCCXXVII", instance.toRomano(1727));
        assertEquals("MDCCXXVIII", instance.toRomano(1728));
        assertEquals("MDCCXXIX", instance.toRomano(1729));
        assertEquals("MDCCXXX", instance.toRomano(1730));

        assertEquals("MDCCXXXI", instance.toRomano(1731));
        assertEquals("MDCCXXXII", instance.toRomano(1732));
        assertEquals("MDCCXXXIII", instance.toRomano(1733));
        assertEquals("MDCCXXXIV", instance.toRomano(1734));
        assertEquals("MDCCXXXV", instance.toRomano(1735));
        assertEquals("MDCCXXXVI", instance.toRomano(1736));
        assertEquals("MDCCXXXVII", instance.toRomano(1737));
        assertEquals("MDCCXXXVIII", instance.toRomano(1738));
        assertEquals("MDCCXXXIX", instance.toRomano(1739));
        assertEquals("MDCCXL", instance.toRomano(1740));

        assertEquals("MDCCXLI", instance.toRomano(1741));
        assertEquals("MDCCXLII", instance.toRomano(1742));
        assertEquals("MDCCXLIII", instance.toRomano(1743));
        assertEquals("MDCCXLIV", instance.toRomano(1744));
        assertEquals("MDCCXLV", instance.toRomano(1745));
        assertEquals("MDCCXLVI", instance.toRomano(1746));
        assertEquals("MDCCXLVII", instance.toRomano(1747));
        assertEquals("MDCCXLVIII", instance.toRomano(1748));
        assertEquals("MDCCXLIX", instance.toRomano(1749));
        assertEquals("MDCCL", instance.toRomano(1750));

        assertEquals("MDCCLI", instance.toRomano(1751));
        assertEquals("MDCCLII", instance.toRomano(1752));
        assertEquals("MDCCLIII", instance.toRomano(1753));
        assertEquals("MDCCLIV", instance.toRomano(1754));
        assertEquals("MDCCLV", instance.toRomano(1755));
        assertEquals("MDCCLVI", instance.toRomano(1756));
        assertEquals("MDCCLVII", instance.toRomano(1757));
        assertEquals("MDCCLVIII", instance.toRomano(1758));
        assertEquals("MDCCLIX", instance.toRomano(1759));
        assertEquals("MDCCLX", instance.toRomano(1760));

        assertEquals("MDCCLXI", instance.toRomano(1761));
        assertEquals("MDCCLXII", instance.toRomano(1762));
        assertEquals("MDCCLXIII", instance.toRomano(1763));
        assertEquals("MDCCLXIV", instance.toRomano(1764));
        assertEquals("MDCCLXV", instance.toRomano(1765));
        assertEquals("MDCCLXVI", instance.toRomano(1766));
        assertEquals("MDCCLXVII", instance.toRomano(1767));
        assertEquals("MDCCLXVIII", instance.toRomano(1768));
        assertEquals("MDCCLXIX", instance.toRomano(1769));
        assertEquals("MDCCLXX", instance.toRomano(1770));

        assertEquals("MDCCLXXI", instance.toRomano(1771));
        assertEquals("MDCCLXXII", instance.toRomano(1772));
        assertEquals("MDCCLXXIII", instance.toRomano(1773));
        assertEquals("MDCCLXXIV", instance.toRomano(1774));
        assertEquals("MDCCLXXV", instance.toRomano(1775));
        assertEquals("MDCCLXXVI", instance.toRomano(1776));
        assertEquals("MDCCLXXVII", instance.toRomano(1777));
        assertEquals("MDCCLXXVIII", instance.toRomano(1778));
        assertEquals("MDCCLXXIX", instance.toRomano(1779));
        assertEquals("MDCCLXXX", instance.toRomano(1780));

        assertEquals("MDCCLXXXI", instance.toRomano(1781));
        assertEquals("MDCCLXXXII", instance.toRomano(1782));
        assertEquals("MDCCLXXXIII", instance.toRomano(1783));
        assertEquals("MDCCLXXXIV", instance.toRomano(1784));
        assertEquals("MDCCLXXXV", instance.toRomano(1785));
        assertEquals("MDCCLXXXVI", instance.toRomano(1786));
        assertEquals("MDCCLXXXVII", instance.toRomano(1787));
        assertEquals("MDCCLXXXVIII", instance.toRomano(1788));
        assertEquals("MDCCLXXXIX", instance.toRomano(1789));
        assertEquals("MDCCXC", instance.toRomano(1790));

        assertEquals("MDCCXCI", instance.toRomano(1791));
        assertEquals("MDCCXCII", instance.toRomano(1792));
        assertEquals("MDCCXCIII", instance.toRomano(1793));
        assertEquals("MDCCXCIV", instance.toRomano(1794));
        assertEquals("MDCCXCV", instance.toRomano(1795));
        assertEquals("MDCCXCVI", instance.toRomano(1796));
        assertEquals("MDCCXCVII", instance.toRomano(1797));
        assertEquals("MDCCXCVIII", instance.toRomano(1798));
        assertEquals("MDCCXCIX", instance.toRomano(1799));
        assertEquals("MDCCC", instance.toRomano(1800));

        assertEquals("MDCCCI", instance.toRomano(1801));
        assertEquals("MDCCCII", instance.toRomano(1802));
        assertEquals("MDCCCIII", instance.toRomano(1803));
        assertEquals("MDCCCIV", instance.toRomano(1804));
        assertEquals("MDCCCV", instance.toRomano(1805));
        assertEquals("MDCCCVI", instance.toRomano(1806));
        assertEquals("MDCCCVII", instance.toRomano(1807));
        assertEquals("MDCCCVIII", instance.toRomano(1808));
        assertEquals("MDCCCIX", instance.toRomano(1809));
        assertEquals("MDCCCX", instance.toRomano(1810));

        assertEquals("MDCCCXI", instance.toRomano(1811));
        assertEquals("MDCCCXII", instance.toRomano(1812));
        assertEquals("MDCCCXIII", instance.toRomano(1813));
        assertEquals("MDCCCXIV", instance.toRomano(1814));
        assertEquals("MDCCCXV", instance.toRomano(1815));
        assertEquals("MDCCCXVI", instance.toRomano(1816));
        assertEquals("MDCCCXVII", instance.toRomano(1817));
        assertEquals("MDCCCXVIII", instance.toRomano(1818));
        assertEquals("MDCCCXIX", instance.toRomano(1819));
        assertEquals("MDCCCXX", instance.toRomano(1820));

        assertEquals("MDCCCXXI", instance.toRomano(1821));
        assertEquals("MDCCCXXII", instance.toRomano(1822));
        assertEquals("MDCCCXXIII", instance.toRomano(1823));
        assertEquals("MDCCCXXIV", instance.toRomano(1824));
        assertEquals("MDCCCXXV", instance.toRomano(1825));
        assertEquals("MDCCCXXVI", instance.toRomano(1826));
        assertEquals("MDCCCXXVII", instance.toRomano(1827));
        assertEquals("MDCCCXXVIII", instance.toRomano(1828));
        assertEquals("MDCCCXXIX", instance.toRomano(1829));
        assertEquals("MDCCCXXX", instance.toRomano(1830));

        assertEquals("MDCCCXXXI", instance.toRomano(1831));
        assertEquals("MDCCCXXXII", instance.toRomano(1832));
        assertEquals("MDCCCXXXIII", instance.toRomano(1833));
        assertEquals("MDCCCXXXIV", instance.toRomano(1834));
        assertEquals("MDCCCXXXV", instance.toRomano(1835));
        assertEquals("MDCCCXXXVI", instance.toRomano(1836));
        assertEquals("MDCCCXXXVII", instance.toRomano(1837));
        assertEquals("MDCCCXXXVIII", instance.toRomano(1838));
        assertEquals("MDCCCXXXIX", instance.toRomano(1839));
        assertEquals("MDCCCXL", instance.toRomano(1840));

        assertEquals("MDCCCXLI", instance.toRomano(1841));
        assertEquals("MDCCCXLII", instance.toRomano(1842));
        assertEquals("MDCCCXLIII", instance.toRomano(1843));
        assertEquals("MDCCCXLIV", instance.toRomano(1844));
        assertEquals("MDCCCXLV", instance.toRomano(1845));
        assertEquals("MDCCCXLVI", instance.toRomano(1846));
        assertEquals("MDCCCXLVII", instance.toRomano(1847));
        assertEquals("MDCCCXLVIII", instance.toRomano(1848));
        assertEquals("MDCCCXLIX", instance.toRomano(1849));
        assertEquals("MDCCCL", instance.toRomano(1850));

        assertEquals("MDCCCLI", instance.toRomano(1851));
        assertEquals("MDCCCLII", instance.toRomano(1852));
        assertEquals("MDCCCLIII", instance.toRomano(1853));
        assertEquals("MDCCCLIV", instance.toRomano(1854));
        assertEquals("MDCCCLV", instance.toRomano(1855));
        assertEquals("MDCCCLVI", instance.toRomano(1856));
        assertEquals("MDCCCLVII", instance.toRomano(1857));
        assertEquals("MDCCCLVIII", instance.toRomano(1858));
        assertEquals("MDCCCLIX", instance.toRomano(1859));
        assertEquals("MDCCCLX", instance.toRomano(1860));

        assertEquals("MDCCCLXI", instance.toRomano(1861));
        assertEquals("MDCCCLXII", instance.toRomano(1862));
        assertEquals("MDCCCLXIII", instance.toRomano(1863));
        assertEquals("MDCCCLXIV", instance.toRomano(1864));
        assertEquals("MDCCCLXV", instance.toRomano(1865));
        assertEquals("MDCCCLXVI", instance.toRomano(1866));
        assertEquals("MDCCCLXVII", instance.toRomano(1867));
        assertEquals("MDCCCLXVIII", instance.toRomano(1868));
        assertEquals("MDCCCLXIX", instance.toRomano(1869));
        assertEquals("MDCCCLXX", instance.toRomano(1870));

        assertEquals("MDCCCLXXI", instance.toRomano(1871));
        assertEquals("MDCCCLXXII", instance.toRomano(1872));
        assertEquals("MDCCCLXXIII", instance.toRomano(1873));
        assertEquals("MDCCCLXXIV", instance.toRomano(1874));
        assertEquals("MDCCCLXXV", instance.toRomano(1875));
        assertEquals("MDCCCLXXVI", instance.toRomano(1876));
        assertEquals("MDCCCLXXVII", instance.toRomano(1877));
        assertEquals("MDCCCLXXVIII", instance.toRomano(1878));
        assertEquals("MDCCCLXXIX", instance.toRomano(1879));
        assertEquals("MDCCCLXXX", instance.toRomano(1880));

        assertEquals("MDCCCLXXXI", instance.toRomano(1881));
        assertEquals("MDCCCLXXXII", instance.toRomano(1882));
        assertEquals("MDCCCLXXXIII", instance.toRomano(1883));
        assertEquals("MDCCCLXXXIV", instance.toRomano(1884));
        assertEquals("MDCCCLXXXV", instance.toRomano(1885));
        assertEquals("MDCCCLXXXVI", instance.toRomano(1886));
        assertEquals("MDCCCLXXXVII", instance.toRomano(1887));
        assertEquals("MDCCCLXXXVIII", instance.toRomano(1888));
        assertEquals("MDCCCLXXXIX", instance.toRomano(1889));
        assertEquals("MDCCCXC", instance.toRomano(1890));

        assertEquals("MDCCCXCI", instance.toRomano(1891));
        assertEquals("MDCCCXCII", instance.toRomano(1892));
        assertEquals("MDCCCXCIII", instance.toRomano(1893));
        assertEquals("MDCCCXCIV", instance.toRomano(1894));
        assertEquals("MDCCCXCV", instance.toRomano(1895));
        assertEquals("MDCCCXCVI", instance.toRomano(1896));
        assertEquals("MDCCCXCVII", instance.toRomano(1897));
        assertEquals("MDCCCXCVIII", instance.toRomano(1898));
        assertEquals("MDCCCXCIX", instance.toRomano(1899));
        assertEquals("MCM", instance.toRomano(1900));

        assertEquals("MCMI", instance.toRomano(1901));
        assertEquals("MCMII", instance.toRomano(1902));
        assertEquals("MCMIII", instance.toRomano(1903));
        assertEquals("MCMIV", instance.toRomano(1904));
        assertEquals("MCMV", instance.toRomano(1905));
        assertEquals("MCMVI", instance.toRomano(1906));
        assertEquals("MCMVII", instance.toRomano(1907));
        assertEquals("MCMVIII", instance.toRomano(1908));
        assertEquals("MCMIX", instance.toRomano(1909));
        assertEquals("MCMX", instance.toRomano(1910));

        assertEquals("MCMXI", instance.toRomano(1911));
        assertEquals("MCMXII", instance.toRomano(1912));
        assertEquals("MCMXIII", instance.toRomano(1913));
        assertEquals("MCMXIV", instance.toRomano(1914));
        assertEquals("MCMXV", instance.toRomano(1915));
        assertEquals("MCMXVI", instance.toRomano(1916));
        assertEquals("MCMXVII", instance.toRomano(1917));
        assertEquals("MCMXVIII", instance.toRomano(1918));
        assertEquals("MCMXIX", instance.toRomano(1919));
        assertEquals("MCMXX", instance.toRomano(1920));

        assertEquals("MCMXXI", instance.toRomano(1921));
        assertEquals("MCMXXII", instance.toRomano(1922));
        assertEquals("MCMXXIII", instance.toRomano(1923));
        assertEquals("MCMXXIV", instance.toRomano(1924));
        assertEquals("MCMXXV", instance.toRomano(1925));
        assertEquals("MCMXXVI", instance.toRomano(1926));
        assertEquals("MCMXXVII", instance.toRomano(1927));
        assertEquals("MCMXXVIII", instance.toRomano(1928));
        assertEquals("MCMXXIX", instance.toRomano(1929));
        assertEquals("MCMXXX", instance.toRomano(1930));

        assertEquals("MCMXXXI", instance.toRomano(1931));
        assertEquals("MCMXXXII", instance.toRomano(1932));
        assertEquals("MCMXXXIII", instance.toRomano(1933));
        assertEquals("MCMXXXIV", instance.toRomano(1934));
        assertEquals("MCMXXXV", instance.toRomano(1935));
        assertEquals("MCMXXXVI", instance.toRomano(1936));
        assertEquals("MCMXXXVII", instance.toRomano(1937));
        assertEquals("MCMXXXVIII", instance.toRomano(1938));
        assertEquals("MCMXXXIX", instance.toRomano(1939));
        assertEquals("MCMXL", instance.toRomano(1940));

        assertEquals("MCMXLI", instance.toRomano(1941));
        assertEquals("MCMXLII", instance.toRomano(1942));
        assertEquals("MCMXLIII", instance.toRomano(1943));
        assertEquals("MCMXLIV", instance.toRomano(1944));
        assertEquals("MCMXLV", instance.toRomano(1945));
        assertEquals("MCMXLVI", instance.toRomano(1946));
        assertEquals("MCMXLVII", instance.toRomano(1947));
        assertEquals("MCMXLVIII", instance.toRomano(1948));
        assertEquals("MCMXLIX", instance.toRomano(1949));
        assertEquals("MCML", instance.toRomano(1950));

        assertEquals("MCMLI", instance.toRomano(1951));
        assertEquals("MCMLII", instance.toRomano(1952));
        assertEquals("MCMLIII", instance.toRomano(1953));
        assertEquals("MCMLIV", instance.toRomano(1954));
        assertEquals("MCMLV", instance.toRomano(1955));
        assertEquals("MCMLVI", instance.toRomano(1956));
        assertEquals("MCMLVII", instance.toRomano(1957));
        assertEquals("MCMLVIII", instance.toRomano(1958));
        assertEquals("MCMLIX", instance.toRomano(1959));
        assertEquals("MCMLX", instance.toRomano(1960));

        assertEquals("MCMLXI", instance.toRomano(1961));
        assertEquals("MCMLXII", instance.toRomano(1962));
        assertEquals("MCMLXIII", instance.toRomano(1963));
        assertEquals("MCMLXIV", instance.toRomano(1964));
        assertEquals("MCMLXV", instance.toRomano(1965));
        assertEquals("MCMLXVI", instance.toRomano(1966));
        assertEquals("MCMLXVII", instance.toRomano(1967));
        assertEquals("MCMLXVIII", instance.toRomano(1968));
        assertEquals("MCMLXIX", instance.toRomano(1969));
        assertEquals("MCMLXX", instance.toRomano(1970));

        assertEquals("MCMLXXI", instance.toRomano(1971));
        assertEquals("MCMLXXII", instance.toRomano(1972));
        assertEquals("MCMLXXIII", instance.toRomano(1973));
        assertEquals("MCMLXXIV", instance.toRomano(1974));
        assertEquals("MCMLXXV", instance.toRomano(1975));
        assertEquals("MCMLXXVI", instance.toRomano(1976));
        assertEquals("MCMLXXVII", instance.toRomano(1977));
        assertEquals("MCMLXXVIII", instance.toRomano(1978));
        assertEquals("MCMLXXIX", instance.toRomano(1979));
        assertEquals("MCMLXXX", instance.toRomano(1980));

        assertEquals("MCMLXXXI", instance.toRomano(1981));
        assertEquals("MCMLXXXII", instance.toRomano(1982));
        assertEquals("MCMLXXXIII", instance.toRomano(1983));
        assertEquals("MCMLXXXIV", instance.toRomano(1984));
        assertEquals("MCMLXXXV", instance.toRomano(1985));
        assertEquals("MCMLXXXVI", instance.toRomano(1986));
        assertEquals("MCMLXXXVII", instance.toRomano(1987));
        assertEquals("MCMLXXXVIII", instance.toRomano(1988));
        assertEquals("MCMLXXXIX", instance.toRomano(1989));
        assertEquals("MCMXC", instance.toRomano(1990));

        assertEquals("MCMXCI", instance.toRomano(1991));
        assertEquals("MCMXCII", instance.toRomano(1992));
        assertEquals("MCMXCIII", instance.toRomano(1993));
        assertEquals("MCMXCIV", instance.toRomano(1994));
        assertEquals("MCMXCV", instance.toRomano(1995));
        assertEquals("MCMXCVI", instance.toRomano(1996));
        assertEquals("MCMXCVII", instance.toRomano(1997));
        assertEquals("MCMXCVIII", instance.toRomano(1998));
        assertEquals("MCMXCIX", instance.toRomano(1999));
        assertEquals("MM", instance.toRomano(2000));

        assertEquals("MMI", instance.toRomano(2001));
        assertEquals("MMII", instance.toRomano(2002));
        assertEquals("MMIII", instance.toRomano(2003));
        assertEquals("MMIV", instance.toRomano(2004));
        assertEquals("MMV", instance.toRomano(2005));
        assertEquals("MMVI", instance.toRomano(2006));
        assertEquals("MMVII", instance.toRomano(2007));
        assertEquals("MMVIII", instance.toRomano(2008));
        assertEquals("MMIX", instance.toRomano(2009));
        assertEquals("MMX", instance.toRomano(2010));

        assertEquals("MMXI", instance.toRomano(2011));
        assertEquals("MMXII", instance.toRomano(2012));
        assertEquals("MMXIII", instance.toRomano(2013));
        assertEquals("MMXIV", instance.toRomano(2014));
        assertEquals("MMXV", instance.toRomano(2015));
        assertEquals("MMXVI", instance.toRomano(2016));
        assertEquals("MMXVII", instance.toRomano(2017));
        assertEquals("MMXVIII", instance.toRomano(2018));
        assertEquals("MMXIX", instance.toRomano(2019));
        assertEquals("MMXX", instance.toRomano(2020));

        assertEquals("MMXXI", instance.toRomano(2021));
        assertEquals("MMXXII", instance.toRomano(2022));
        assertEquals("MMXXIII", instance.toRomano(2023));
        assertEquals("MMXXIV", instance.toRomano(2024));
        assertEquals("MMXXV", instance.toRomano(2025));
        assertEquals("MMXXVI", instance.toRomano(2026));
        assertEquals("MMXXVII", instance.toRomano(2027));
        assertEquals("MMXXVIII", instance.toRomano(2028));
        assertEquals("MMXXIX", instance.toRomano(2029));
        assertEquals("MMXXX", instance.toRomano(2030));

        assertEquals("MMXXXI", instance.toRomano(2031));
        assertEquals("MMXXXII", instance.toRomano(2032));
        assertEquals("MMXXXIII", instance.toRomano(2033));
        assertEquals("MMXXXIV", instance.toRomano(2034));
        assertEquals("MMXXXV", instance.toRomano(2035));
        assertEquals("MMXXXVI", instance.toRomano(2036));
        assertEquals("MMXXXVII", instance.toRomano(2037));
        assertEquals("MMXXXVIII", instance.toRomano(2038));
        assertEquals("MMXXXIX", instance.toRomano(2039));
        assertEquals("MMXL", instance.toRomano(2040));

        assertEquals("MMXLI", instance.toRomano(2041));
        assertEquals("MMXLII", instance.toRomano(2042));
        assertEquals("MMXLIII", instance.toRomano(2043));
        assertEquals("MMXLIV", instance.toRomano(2044));
        assertEquals("MMXLV", instance.toRomano(2045));
        assertEquals("MMXLVI", instance.toRomano(2046));
        assertEquals("MMXLVII", instance.toRomano(2047));
        assertEquals("MMXLVIII", instance.toRomano(2048));
        assertEquals("MMXLIX", instance.toRomano(2049));
        assertEquals("MML", instance.toRomano(2050));

        assertEquals("MMLI", instance.toRomano(2051));
        assertEquals("MMLII", instance.toRomano(2052));
        assertEquals("MMLIII", instance.toRomano(2053));
        assertEquals("MMLIV", instance.toRomano(2054));
        assertEquals("MMLV", instance.toRomano(2055));
        assertEquals("MMLVI", instance.toRomano(2056));
        assertEquals("MMLVII", instance.toRomano(2057));
        assertEquals("MMLVIII", instance.toRomano(2058));
        assertEquals("MMLIX", instance.toRomano(2059));
        assertEquals("MMLX", instance.toRomano(2060));

        assertEquals("MMLXI", instance.toRomano(2061));
        assertEquals("MMLXII", instance.toRomano(2062));
        assertEquals("MMLXIII", instance.toRomano(2063));
        assertEquals("MMLXIV", instance.toRomano(2064));
        assertEquals("MMLXV", instance.toRomano(2065));
        assertEquals("MMLXVI", instance.toRomano(2066));
        assertEquals("MMLXVII", instance.toRomano(2067));
        assertEquals("MMLXVIII", instance.toRomano(2068));
        assertEquals("MMLXIX", instance.toRomano(2069));
        assertEquals("MMLXX", instance.toRomano(2070));

        assertEquals("MMLXXI", instance.toRomano(2071));
        assertEquals("MMLXXII", instance.toRomano(2072));
        assertEquals("MMLXXIII", instance.toRomano(2073));
        assertEquals("MMLXXIV", instance.toRomano(2074));
        assertEquals("MMLXXV", instance.toRomano(2075));
        assertEquals("MMLXXVI", instance.toRomano(2076));
        assertEquals("MMLXXVII", instance.toRomano(2077));
        assertEquals("MMLXXVIII", instance.toRomano(2078));
        assertEquals("MMLXXIX", instance.toRomano(2079));
        assertEquals("MMLXXX", instance.toRomano(2080));

        assertEquals("MMLXXXI", instance.toRomano(2081));
        assertEquals("MMLXXXII", instance.toRomano(2082));
        assertEquals("MMLXXXIII", instance.toRomano(2083));
        assertEquals("MMLXXXIV", instance.toRomano(2084));
        assertEquals("MMLXXXV", instance.toRomano(2085));
        assertEquals("MMLXXXVI", instance.toRomano(2086));
        assertEquals("MMLXXXVII", instance.toRomano(2087));
        assertEquals("MMLXXXVIII", instance.toRomano(2088));
        assertEquals("MMLXXXIX", instance.toRomano(2089));
        assertEquals("MMXC", instance.toRomano(2090));

        assertEquals("MMXCI", instance.toRomano(2091));
        assertEquals("MMXCII", instance.toRomano(2092));
        assertEquals("MMXCIII", instance.toRomano(2093));
        assertEquals("MMXCIV", instance.toRomano(2094));
        assertEquals("MMXCV", instance.toRomano(2095));
        assertEquals("MMXCVI", instance.toRomano(2096));
        assertEquals("MMXCVII", instance.toRomano(2097));
        assertEquals("MMXCVIII", instance.toRomano(2098));
        assertEquals("MMXCIX", instance.toRomano(2099));
        assertEquals("MMC", instance.toRomano(2100));

        assertEquals("MMCI", instance.toRomano(2101));
        assertEquals("MMCII", instance.toRomano(2102));
        assertEquals("MMCIII", instance.toRomano(2103));
        assertEquals("MMCIV", instance.toRomano(2104));
        assertEquals("MMCV", instance.toRomano(2105));
        assertEquals("MMCVI", instance.toRomano(2106));
        assertEquals("MMCVII", instance.toRomano(2107));
        assertEquals("MMCVIII", instance.toRomano(2108));
        assertEquals("MMCIX", instance.toRomano(2109));
        assertEquals("MMCX", instance.toRomano(2110));

        assertEquals("MMCXI", instance.toRomano(2111));
        assertEquals("MMCXII", instance.toRomano(2112));
        assertEquals("MMCXIII", instance.toRomano(2113));
        assertEquals("MMCXIV", instance.toRomano(2114));
        assertEquals("MMCXV", instance.toRomano(2115));
        assertEquals("MMCXVI", instance.toRomano(2116));
        assertEquals("MMCXVII", instance.toRomano(2117));
        assertEquals("MMCXVIII", instance.toRomano(2118));
        assertEquals("MMCXIX", instance.toRomano(2119));
        assertEquals("MMCXX", instance.toRomano(2120));

        assertEquals("MMCXXI", instance.toRomano(2121));
        assertEquals("MMCXXII", instance.toRomano(2122));
        assertEquals("MMCXXIII", instance.toRomano(2123));
        assertEquals("MMCXXIV", instance.toRomano(2124));
        assertEquals("MMCXXV", instance.toRomano(2125));
        assertEquals("MMCXXVI", instance.toRomano(2126));
        assertEquals("MMCXXVII", instance.toRomano(2127));
        assertEquals("MMCXXVIII", instance.toRomano(2128));
        assertEquals("MMCXXIX", instance.toRomano(2129));
        assertEquals("MMCXXX", instance.toRomano(2130));

        assertEquals("MMCXXXI", instance.toRomano(2131));
        assertEquals("MMCXXXII", instance.toRomano(2132));
        assertEquals("MMCXXXIII", instance.toRomano(2133));
        assertEquals("MMCXXXIV", instance.toRomano(2134));
        assertEquals("MMCXXXV", instance.toRomano(2135));
        assertEquals("MMCXXXVI", instance.toRomano(2136));
        assertEquals("MMCXXXVII", instance.toRomano(2137));
        assertEquals("MMCXXXVIII", instance.toRomano(2138));
        assertEquals("MMCXXXIX", instance.toRomano(2139));
        assertEquals("MMCXL", instance.toRomano(2140));

        assertEquals("MMCXLI", instance.toRomano(2141));
        assertEquals("MMCXLII", instance.toRomano(2142));
        assertEquals("MMCXLIII", instance.toRomano(2143));
        assertEquals("MMCXLIV", instance.toRomano(2144));
        assertEquals("MMCXLV", instance.toRomano(2145));
        assertEquals("MMCXLVI", instance.toRomano(2146));
        assertEquals("MMCXLVII", instance.toRomano(2147));
        assertEquals("MMCXLVIII", instance.toRomano(2148));
        assertEquals("MMCXLIX", instance.toRomano(2149));
        assertEquals("MMCL", instance.toRomano(2150));

        assertEquals("MMCLI", instance.toRomano(2151));
        assertEquals("MMCLII", instance.toRomano(2152));
        assertEquals("MMCLIII", instance.toRomano(2153));
        assertEquals("MMCLIV", instance.toRomano(2154));
        assertEquals("MMCLV", instance.toRomano(2155));
        assertEquals("MMCLVI", instance.toRomano(2156));
        assertEquals("MMCLVII", instance.toRomano(2157));
        assertEquals("MMCLVIII", instance.toRomano(2158));
        assertEquals("MMCLIX", instance.toRomano(2159));
        assertEquals("MMCLX", instance.toRomano(2160));

        assertEquals("MMCLXI", instance.toRomano(2161));
        assertEquals("MMCLXII", instance.toRomano(2162));
        assertEquals("MMCLXIII", instance.toRomano(2163));
        assertEquals("MMCLXIV", instance.toRomano(2164));
        assertEquals("MMCLXV", instance.toRomano(2165));
        assertEquals("MMCLXVI", instance.toRomano(2166));
        assertEquals("MMCLXVII", instance.toRomano(2167));
        assertEquals("MMCLXVIII", instance.toRomano(2168));
        assertEquals("MMCLXIX", instance.toRomano(2169));
        assertEquals("MMCLXX", instance.toRomano(2170));

        assertEquals("MMCLXXI", instance.toRomano(2171));
        assertEquals("MMCLXXII", instance.toRomano(2172));
        assertEquals("MMCLXXIII", instance.toRomano(2173));
        assertEquals("MMCLXXIV", instance.toRomano(2174));
        assertEquals("MMCLXXV", instance.toRomano(2175));
        assertEquals("MMCLXXVI", instance.toRomano(2176));
        assertEquals("MMCLXXVII", instance.toRomano(2177));
        assertEquals("MMCLXXVIII", instance.toRomano(2178));
        assertEquals("MMCLXXIX", instance.toRomano(2179));
        assertEquals("MMCLXXX", instance.toRomano(2180));

        assertEquals("MMCLXXXI", instance.toRomano(2181));
        assertEquals("MMCLXXXII", instance.toRomano(2182));
        assertEquals("MMCLXXXIII", instance.toRomano(2183));
        assertEquals("MMCLXXXIV", instance.toRomano(2184));
        assertEquals("MMCLXXXV", instance.toRomano(2185));
        assertEquals("MMCLXXXVI", instance.toRomano(2186));
        assertEquals("MMCLXXXVII", instance.toRomano(2187));
        assertEquals("MMCLXXXVIII", instance.toRomano(2188));
        assertEquals("MMCLXXXIX", instance.toRomano(2189));
        assertEquals("MMCXC", instance.toRomano(2190));

        assertEquals("MMCXCI", instance.toRomano(2191));
        assertEquals("MMCXCII", instance.toRomano(2192));
        assertEquals("MMCXCIII", instance.toRomano(2193));
        assertEquals("MMCXCIV", instance.toRomano(2194));
        assertEquals("MMCXCV", instance.toRomano(2195));
        assertEquals("MMCXCVI", instance.toRomano(2196));
        assertEquals("MMCXCVII", instance.toRomano(2197));
        assertEquals("MMCXCVIII", instance.toRomano(2198));
        assertEquals("MMCXCIX", instance.toRomano(2199));
        assertEquals("MMCC", instance.toRomano(2200));

        assertEquals("MMCCI", instance.toRomano(2201));
        assertEquals("MMCCII", instance.toRomano(2202));
        assertEquals("MMCCIII", instance.toRomano(2203));
        assertEquals("MMCCIV", instance.toRomano(2204));
        assertEquals("MMCCV", instance.toRomano(2205));
        assertEquals("MMCCVI", instance.toRomano(2206));
        assertEquals("MMCCVII", instance.toRomano(2207));
        assertEquals("MMCCVIII", instance.toRomano(2208));
        assertEquals("MMCCIX", instance.toRomano(2209));
        assertEquals("MMCCX", instance.toRomano(2210));

        assertEquals("MMCCXI", instance.toRomano(2211));
        assertEquals("MMCCXII", instance.toRomano(2212));
        assertEquals("MMCCXIII", instance.toRomano(2213));
        assertEquals("MMCCXIV", instance.toRomano(2214));
        assertEquals("MMCCXV", instance.toRomano(2215));
        assertEquals("MMCCXVI", instance.toRomano(2216));
        assertEquals("MMCCXVII", instance.toRomano(2217));
        assertEquals("MMCCXVIII", instance.toRomano(2218));
        assertEquals("MMCCXIX", instance.toRomano(2219));
        assertEquals("MMCCXX", instance.toRomano(2220));

        assertEquals("MMCCXXI", instance.toRomano(2221));
        assertEquals("MMCCXXII", instance.toRomano(2222));
        assertEquals("MMCCXXIII", instance.toRomano(2223));
        assertEquals("MMCCXXIV", instance.toRomano(2224));
        assertEquals("MMCCXXV", instance.toRomano(2225));
        assertEquals("MMCCXXVI", instance.toRomano(2226));
        assertEquals("MMCCXXVII", instance.toRomano(2227));
        assertEquals("MMCCXXVIII", instance.toRomano(2228));
        assertEquals("MMCCXXIX", instance.toRomano(2229));
        assertEquals("MMCCXXX", instance.toRomano(2230));

        assertEquals("MMCCXXXI", instance.toRomano(2231));
        assertEquals("MMCCXXXII", instance.toRomano(2232));
        assertEquals("MMCCXXXIII", instance.toRomano(2233));
        assertEquals("MMCCXXXIV", instance.toRomano(2234));
        assertEquals("MMCCXXXV", instance.toRomano(2235));
        assertEquals("MMCCXXXVI", instance.toRomano(2236));
        assertEquals("MMCCXXXVII", instance.toRomano(2237));
        assertEquals("MMCCXXXVIII", instance.toRomano(2238));
        assertEquals("MMCCXXXIX", instance.toRomano(2239));
        assertEquals("MMCCXL", instance.toRomano(2240));

        assertEquals("MMCCXLI", instance.toRomano(2241));
        assertEquals("MMCCXLII", instance.toRomano(2242));
        assertEquals("MMCCXLIII", instance.toRomano(2243));
        assertEquals("MMCCXLIV", instance.toRomano(2244));
        assertEquals("MMCCXLV", instance.toRomano(2245));
        assertEquals("MMCCXLVI", instance.toRomano(2246));
        assertEquals("MMCCXLVII", instance.toRomano(2247));
        assertEquals("MMCCXLVIII", instance.toRomano(2248));
        assertEquals("MMCCXLIX", instance.toRomano(2249));
        assertEquals("MMCCL", instance.toRomano(2250));

        assertEquals("MMCCLI", instance.toRomano(2251));
        assertEquals("MMCCLII", instance.toRomano(2252));
        assertEquals("MMCCLIII", instance.toRomano(2253));
        assertEquals("MMCCLIV", instance.toRomano(2254));
        assertEquals("MMCCLV", instance.toRomano(2255));
        assertEquals("MMCCLVI", instance.toRomano(2256));
        assertEquals("MMCCLVII", instance.toRomano(2257));
        assertEquals("MMCCLVIII", instance.toRomano(2258));
        assertEquals("MMCCLIX", instance.toRomano(2259));
        assertEquals("MMCCLX", instance.toRomano(2260));

        assertEquals("MMCCLXI", instance.toRomano(2261));
        assertEquals("MMCCLXII", instance.toRomano(2262));
        assertEquals("MMCCLXIII", instance.toRomano(2263));
        assertEquals("MMCCLXIV", instance.toRomano(2264));
        assertEquals("MMCCLXV", instance.toRomano(2265));
        assertEquals("MMCCLXVI", instance.toRomano(2266));
        assertEquals("MMCCLXVII", instance.toRomano(2267));
        assertEquals("MMCCLXVIII", instance.toRomano(2268));
        assertEquals("MMCCLXIX", instance.toRomano(2269));
        assertEquals("MMCCLXX", instance.toRomano(2270));

        assertEquals("MMCCLXXI", instance.toRomano(2271));
        assertEquals("MMCCLXXII", instance.toRomano(2272));
        assertEquals("MMCCLXXIII", instance.toRomano(2273));
        assertEquals("MMCCLXXIV", instance.toRomano(2274));
        assertEquals("MMCCLXXV", instance.toRomano(2275));
        assertEquals("MMCCLXXVI", instance.toRomano(2276));
        assertEquals("MMCCLXXVII", instance.toRomano(2277));
        assertEquals("MMCCLXXVIII", instance.toRomano(2278));
        assertEquals("MMCCLXXIX", instance.toRomano(2279));
        assertEquals("MMCCLXXX", instance.toRomano(2280));

        assertEquals("MMCCLXXXI", instance.toRomano(2281));
        assertEquals("MMCCLXXXII", instance.toRomano(2282));
        assertEquals("MMCCLXXXIII", instance.toRomano(2283));
        assertEquals("MMCCLXXXIV", instance.toRomano(2284));
        assertEquals("MMCCLXXXV", instance.toRomano(2285));
        assertEquals("MMCCLXXXVI", instance.toRomano(2286));
        assertEquals("MMCCLXXXVII", instance.toRomano(2287));
        assertEquals("MMCCLXXXVIII", instance.toRomano(2288));
        assertEquals("MMCCLXXXIX", instance.toRomano(2289));
        assertEquals("MMCCXC", instance.toRomano(2290));

        assertEquals("MMCCXCI", instance.toRomano(2291));
        assertEquals("MMCCXCII", instance.toRomano(2292));
        assertEquals("MMCCXCIII", instance.toRomano(2293));
        assertEquals("MMCCXCIV", instance.toRomano(2294));
        assertEquals("MMCCXCV", instance.toRomano(2295));
        assertEquals("MMCCXCVI", instance.toRomano(2296));
        assertEquals("MMCCXCVII", instance.toRomano(2297));
        assertEquals("MMCCXCVIII", instance.toRomano(2298));
        assertEquals("MMCCXCIX", instance.toRomano(2299));
        assertEquals("MMCCC", instance.toRomano(2300));

        assertEquals("MMCCCI", instance.toRomano(2301));
        assertEquals("MMCCCII", instance.toRomano(2302));
        assertEquals("MMCCCIII", instance.toRomano(2303));
        assertEquals("MMCCCIV", instance.toRomano(2304));
        assertEquals("MMCCCV", instance.toRomano(2305));
        assertEquals("MMCCCVI", instance.toRomano(2306));
        assertEquals("MMCCCVII", instance.toRomano(2307));
        assertEquals("MMCCCVIII", instance.toRomano(2308));
        assertEquals("MMCCCIX", instance.toRomano(2309));
        assertEquals("MMCCCX", instance.toRomano(2310));

        assertEquals("MMCCCXI", instance.toRomano(2311));
        assertEquals("MMCCCXII", instance.toRomano(2312));
        assertEquals("MMCCCXIII", instance.toRomano(2313));
        assertEquals("MMCCCXIV", instance.toRomano(2314));
        assertEquals("MMCCCXV", instance.toRomano(2315));
        assertEquals("MMCCCXVI", instance.toRomano(2316));
        assertEquals("MMCCCXVII", instance.toRomano(2317));
        assertEquals("MMCCCXVIII", instance.toRomano(2318));
        assertEquals("MMCCCXIX", instance.toRomano(2319));
        assertEquals("MMCCCXX", instance.toRomano(2320));

        assertEquals("MMCCCXXI", instance.toRomano(2321));
        assertEquals("MMCCCXXII", instance.toRomano(2322));
        assertEquals("MMCCCXXIII", instance.toRomano(2323));
        assertEquals("MMCCCXXIV", instance.toRomano(2324));
        assertEquals("MMCCCXXV", instance.toRomano(2325));
        assertEquals("MMCCCXXVI", instance.toRomano(2326));
        assertEquals("MMCCCXXVII", instance.toRomano(2327));
        assertEquals("MMCCCXXVIII", instance.toRomano(2328));
        assertEquals("MMCCCXXIX", instance.toRomano(2329));
        assertEquals("MMCCCXXX", instance.toRomano(2330));

        assertEquals("MMCCCXXXI", instance.toRomano(2331));
        assertEquals("MMCCCXXXII", instance.toRomano(2332));
        assertEquals("MMCCCXXXIII", instance.toRomano(2333));
        assertEquals("MMCCCXXXIV", instance.toRomano(2334));
        assertEquals("MMCCCXXXV", instance.toRomano(2335));
        assertEquals("MMCCCXXXVI", instance.toRomano(2336));
        assertEquals("MMCCCXXXVII", instance.toRomano(2337));
        assertEquals("MMCCCXXXVIII", instance.toRomano(2338));
        assertEquals("MMCCCXXXIX", instance.toRomano(2339));
        assertEquals("MMCCCXL", instance.toRomano(2340));

        assertEquals("MMCCCXLI", instance.toRomano(2341));
        assertEquals("MMCCCXLII", instance.toRomano(2342));
        assertEquals("MMCCCXLIII", instance.toRomano(2343));
        assertEquals("MMCCCXLIV", instance.toRomano(2344));
        assertEquals("MMCCCXLV", instance.toRomano(2345));
        assertEquals("MMCCCXLVI", instance.toRomano(2346));
        assertEquals("MMCCCXLVII", instance.toRomano(2347));
        assertEquals("MMCCCXLVIII", instance.toRomano(2348));
        assertEquals("MMCCCXLIX", instance.toRomano(2349));
        assertEquals("MMCCCL", instance.toRomano(2350));

        assertEquals("MMCCCLI", instance.toRomano(2351));
        assertEquals("MMCCCLII", instance.toRomano(2352));
        assertEquals("MMCCCLIII", instance.toRomano(2353));
        assertEquals("MMCCCLIV", instance.toRomano(2354));
        assertEquals("MMCCCLV", instance.toRomano(2355));
        assertEquals("MMCCCLVI", instance.toRomano(2356));
        assertEquals("MMCCCLVII", instance.toRomano(2357));
        assertEquals("MMCCCLVIII", instance.toRomano(2358));
        assertEquals("MMCCCLIX", instance.toRomano(2359));
        assertEquals("MMCCCLX", instance.toRomano(2360));

        assertEquals("MMCCCLXI", instance.toRomano(2361));
        assertEquals("MMCCCLXII", instance.toRomano(2362));
        assertEquals("MMCCCLXIII", instance.toRomano(2363));
        assertEquals("MMCCCLXIV", instance.toRomano(2364));
        assertEquals("MMCCCLXV", instance.toRomano(2365));
        assertEquals("MMCCCLXVI", instance.toRomano(2366));
        assertEquals("MMCCCLXVII", instance.toRomano(2367));
        assertEquals("MMCCCLXVIII", instance.toRomano(2368));
        assertEquals("MMCCCLXIX", instance.toRomano(2369));
        assertEquals("MMCCCLXX", instance.toRomano(2370));

        assertEquals("MMCCCLXXI", instance.toRomano(2371));
        assertEquals("MMCCCLXXII", instance.toRomano(2372));
        assertEquals("MMCCCLXXIII", instance.toRomano(2373));
        assertEquals("MMCCCLXXIV", instance.toRomano(2374));
        assertEquals("MMCCCLXXV", instance.toRomano(2375));
        assertEquals("MMCCCLXXVI", instance.toRomano(2376));
        assertEquals("MMCCCLXXVII", instance.toRomano(2377));
        assertEquals("MMCCCLXXVIII", instance.toRomano(2378));
        assertEquals("MMCCCLXXIX", instance.toRomano(2379));
        assertEquals("MMCCCLXXX", instance.toRomano(2380));

        assertEquals("MMCCCLXXXI", instance.toRomano(2381));
        assertEquals("MMCCCLXXXII", instance.toRomano(2382));
        assertEquals("MMCCCLXXXIII", instance.toRomano(2383));
        assertEquals("MMCCCLXXXIV", instance.toRomano(2384));
        assertEquals("MMCCCLXXXV", instance.toRomano(2385));
        assertEquals("MMCCCLXXXVI", instance.toRomano(2386));
        assertEquals("MMCCCLXXXVII", instance.toRomano(2387));
        assertEquals("MMCCCLXXXVIII", instance.toRomano(2388));
        assertEquals("MMCCCLXXXIX", instance.toRomano(2389));
        assertEquals("MMCCCXC", instance.toRomano(2390));

        assertEquals("MMCCCXCI", instance.toRomano(2391));
        assertEquals("MMCCCXCII", instance.toRomano(2392));
        assertEquals("MMCCCXCIII", instance.toRomano(2393));
        assertEquals("MMCCCXCIV", instance.toRomano(2394));
        assertEquals("MMCCCXCV", instance.toRomano(2395));
        assertEquals("MMCCCXCVI", instance.toRomano(2396));
        assertEquals("MMCCCXCVII", instance.toRomano(2397));
        assertEquals("MMCCCXCVIII", instance.toRomano(2398));
        assertEquals("MMCCCXCIX", instance.toRomano(2399));
        assertEquals("MMCD", instance.toRomano(2400));

        assertEquals("MMCDI", instance.toRomano(2401));
        assertEquals("MMCDII", instance.toRomano(2402));
        assertEquals("MMCDIII", instance.toRomano(2403));
        assertEquals("MMCDIV", instance.toRomano(2404));
        assertEquals("MMCDV", instance.toRomano(2405));
        assertEquals("MMCDVI", instance.toRomano(2406));
        assertEquals("MMCDVII", instance.toRomano(2407));
        assertEquals("MMCDVIII", instance.toRomano(2408));
        assertEquals("MMCDIX", instance.toRomano(2409));
        assertEquals("MMCDX", instance.toRomano(2410));

        assertEquals("MMCDXI", instance.toRomano(2411));
        assertEquals("MMCDXII", instance.toRomano(2412));
        assertEquals("MMCDXIII", instance.toRomano(2413));
        assertEquals("MMCDXIV", instance.toRomano(2414));
        assertEquals("MMCDXV", instance.toRomano(2415));
        assertEquals("MMCDXVI", instance.toRomano(2416));
        assertEquals("MMCDXVII", instance.toRomano(2417));
        assertEquals("MMCDXVIII", instance.toRomano(2418));
        assertEquals("MMCDXIX", instance.toRomano(2419));
        assertEquals("MMCDXX", instance.toRomano(2420));

        assertEquals("MMCDXXI", instance.toRomano(2421));
        assertEquals("MMCDXXII", instance.toRomano(2422));
        assertEquals("MMCDXXIII", instance.toRomano(2423));
        assertEquals("MMCDXXIV", instance.toRomano(2424));
        assertEquals("MMCDXXV", instance.toRomano(2425));
        assertEquals("MMCDXXVI", instance.toRomano(2426));
        assertEquals("MMCDXXVII", instance.toRomano(2427));
        assertEquals("MMCDXXVIII", instance.toRomano(2428));
        assertEquals("MMCDXXIX", instance.toRomano(2429));
        assertEquals("MMCDXXX", instance.toRomano(2430));

        assertEquals("MMCDXXXI", instance.toRomano(2431));
        assertEquals("MMCDXXXII", instance.toRomano(2432));
        assertEquals("MMCDXXXIII", instance.toRomano(2433));
        assertEquals("MMCDXXXIV", instance.toRomano(2434));
        assertEquals("MMCDXXXV", instance.toRomano(2435));
        assertEquals("MMCDXXXVI", instance.toRomano(2436));
        assertEquals("MMCDXXXVII", instance.toRomano(2437));
        assertEquals("MMCDXXXVIII", instance.toRomano(2438));
        assertEquals("MMCDXXXIX", instance.toRomano(2439));
        assertEquals("MMCDXL", instance.toRomano(2440));

        assertEquals("MMCDXLI", instance.toRomano(2441));
        assertEquals("MMCDXLII", instance.toRomano(2442));
        assertEquals("MMCDXLIII", instance.toRomano(2443));
        assertEquals("MMCDXLIV", instance.toRomano(2444));
        assertEquals("MMCDXLV", instance.toRomano(2445));
        assertEquals("MMCDXLVI", instance.toRomano(2446));
        assertEquals("MMCDXLVII", instance.toRomano(2447));
        assertEquals("MMCDXLVIII", instance.toRomano(2448));
        assertEquals("MMCDXLIX", instance.toRomano(2449));
        assertEquals("MMCDL", instance.toRomano(2450));

        assertEquals("MMCDLI", instance.toRomano(2451));
        assertEquals("MMCDLII", instance.toRomano(2452));
        assertEquals("MMCDLIII", instance.toRomano(2453));
        assertEquals("MMCDLIV", instance.toRomano(2454));
        assertEquals("MMCDLV", instance.toRomano(2455));
        assertEquals("MMCDLVI", instance.toRomano(2456));
        assertEquals("MMCDLVII", instance.toRomano(2457));
        assertEquals("MMCDLVIII", instance.toRomano(2458));
        assertEquals("MMCDLIX", instance.toRomano(2459));
        assertEquals("MMCDLX", instance.toRomano(2460));

        assertEquals("MMCDLXI", instance.toRomano(2461));
        assertEquals("MMCDLXII", instance.toRomano(2462));
        assertEquals("MMCDLXIII", instance.toRomano(2463));
        assertEquals("MMCDLXIV", instance.toRomano(2464));
        assertEquals("MMCDLXV", instance.toRomano(2465));
        assertEquals("MMCDLXVI", instance.toRomano(2466));
        assertEquals("MMCDLXVII", instance.toRomano(2467));
        assertEquals("MMCDLXVIII", instance.toRomano(2468));
        assertEquals("MMCDLXIX", instance.toRomano(2469));
        assertEquals("MMCDLXX", instance.toRomano(2470));

        assertEquals("MMCDLXXI", instance.toRomano(2471));
        assertEquals("MMCDLXXII", instance.toRomano(2472));
        assertEquals("MMCDLXXIII", instance.toRomano(2473));
        assertEquals("MMCDLXXIV", instance.toRomano(2474));
        assertEquals("MMCDLXXV", instance.toRomano(2475));
        assertEquals("MMCDLXXVI", instance.toRomano(2476));
        assertEquals("MMCDLXXVII", instance.toRomano(2477));
        assertEquals("MMCDLXXVIII", instance.toRomano(2478));
        assertEquals("MMCDLXXIX", instance.toRomano(2479));
        assertEquals("MMCDLXXX", instance.toRomano(2480));

        assertEquals("MMCDLXXXI", instance.toRomano(2481));
        assertEquals("MMCDLXXXII", instance.toRomano(2482));
        assertEquals("MMCDLXXXIII", instance.toRomano(2483));
        assertEquals("MMCDLXXXIV", instance.toRomano(2484));
        assertEquals("MMCDLXXXV", instance.toRomano(2485));
        assertEquals("MMCDLXXXVI", instance.toRomano(2486));
        assertEquals("MMCDLXXXVII", instance.toRomano(2487));
        assertEquals("MMCDLXXXVIII", instance.toRomano(2488));
        assertEquals("MMCDLXXXIX", instance.toRomano(2489));
        assertEquals("MMCDXC", instance.toRomano(2490));

        assertEquals("MMCDXCI", instance.toRomano(2491));
        assertEquals("MMCDXCII", instance.toRomano(2492));
        assertEquals("MMCDXCIII", instance.toRomano(2493));
        assertEquals("MMCDXCIV", instance.toRomano(2494));
        assertEquals("MMCDXCV", instance.toRomano(2495));
        assertEquals("MMCDXCVI", instance.toRomano(2496));
        assertEquals("MMCDXCVII", instance.toRomano(2497));
        assertEquals("MMCDXCVIII", instance.toRomano(2498));
        assertEquals("MMCDXCIX", instance.toRomano(2499));
        assertEquals("MMD", instance.toRomano(2500));

        assertEquals("MMDI", instance.toRomano(2501));
        assertEquals("MMDII", instance.toRomano(2502));
        assertEquals("MMDIII", instance.toRomano(2503));
        assertEquals("MMDIV", instance.toRomano(2504));
        assertEquals("MMDV", instance.toRomano(2505));
        assertEquals("MMDVI", instance.toRomano(2506));
        assertEquals("MMDVII", instance.toRomano(2507));
        assertEquals("MMDVIII", instance.toRomano(2508));
        assertEquals("MMDIX", instance.toRomano(2509));
        assertEquals("MMDX", instance.toRomano(2510));

        assertEquals("MMDXI", instance.toRomano(2511));
        assertEquals("MMDXII", instance.toRomano(2512));
        assertEquals("MMDXIII", instance.toRomano(2513));
        assertEquals("MMDXIV", instance.toRomano(2514));
        assertEquals("MMDXV", instance.toRomano(2515));
        assertEquals("MMDXVI", instance.toRomano(2516));
        assertEquals("MMDXVII", instance.toRomano(2517));
        assertEquals("MMDXVIII", instance.toRomano(2518));
        assertEquals("MMDXIX", instance.toRomano(2519));
        assertEquals("MMDXX", instance.toRomano(2520));

        assertEquals("MMDXXI", instance.toRomano(2521));
        assertEquals("MMDXXII", instance.toRomano(2522));
        assertEquals("MMDXXIII", instance.toRomano(2523));
        assertEquals("MMDXXIV", instance.toRomano(2524));
        assertEquals("MMDXXV", instance.toRomano(2525));
        assertEquals("MMDXXVI", instance.toRomano(2526));
        assertEquals("MMDXXVII", instance.toRomano(2527));
        assertEquals("MMDXXVIII", instance.toRomano(2528));
        assertEquals("MMDXXIX", instance.toRomano(2529));
        assertEquals("MMDXXX", instance.toRomano(2530));

        assertEquals("MMDXXXI", instance.toRomano(2531));
        assertEquals("MMDXXXII", instance.toRomano(2532));
        assertEquals("MMDXXXIII", instance.toRomano(2533));
        assertEquals("MMDXXXIV", instance.toRomano(2534));
        assertEquals("MMDXXXV", instance.toRomano(2535));
        assertEquals("MMDXXXVI", instance.toRomano(2536));
        assertEquals("MMDXXXVII", instance.toRomano(2537));
        assertEquals("MMDXXXVIII", instance.toRomano(2538));
        assertEquals("MMDXXXIX", instance.toRomano(2539));
        assertEquals("MMDXL", instance.toRomano(2540));

        assertEquals("MMDXLI", instance.toRomano(2541));
        assertEquals("MMDXLII", instance.toRomano(2542));
        assertEquals("MMDXLIII", instance.toRomano(2543));
        assertEquals("MMDXLIV", instance.toRomano(2544));
        assertEquals("MMDXLV", instance.toRomano(2545));
        assertEquals("MMDXLVI", instance.toRomano(2546));
        assertEquals("MMDXLVII", instance.toRomano(2547));
        assertEquals("MMDXLVIII", instance.toRomano(2548));
        assertEquals("MMDXLIX", instance.toRomano(2549));
        assertEquals("MMDL", instance.toRomano(2550));

        assertEquals("MMDLI", instance.toRomano(2551));
        assertEquals("MMDLII", instance.toRomano(2552));
        assertEquals("MMDLIII", instance.toRomano(2553));
        assertEquals("MMDLIV", instance.toRomano(2554));
        assertEquals("MMDLV", instance.toRomano(2555));
        assertEquals("MMDLVI", instance.toRomano(2556));
        assertEquals("MMDLVII", instance.toRomano(2557));
        assertEquals("MMDLVIII", instance.toRomano(2558));
        assertEquals("MMDLIX", instance.toRomano(2559));
        assertEquals("MMDLX", instance.toRomano(2560));

        assertEquals("MMDLXI", instance.toRomano(2561));
        assertEquals("MMDLXII", instance.toRomano(2562));
        assertEquals("MMDLXIII", instance.toRomano(2563));
        assertEquals("MMDLXIV", instance.toRomano(2564));
        assertEquals("MMDLXV", instance.toRomano(2565));
        assertEquals("MMDLXVI", instance.toRomano(2566));
        assertEquals("MMDLXVII", instance.toRomano(2567));
        assertEquals("MMDLXVIII", instance.toRomano(2568));
        assertEquals("MMDLXIX", instance.toRomano(2569));
        assertEquals("MMDLXX", instance.toRomano(2570));

        assertEquals("MMDLXXI", instance.toRomano(2571));
        assertEquals("MMDLXXII", instance.toRomano(2572));
        assertEquals("MMDLXXIII", instance.toRomano(2573));
        assertEquals("MMDLXXIV", instance.toRomano(2574));
        assertEquals("MMDLXXV", instance.toRomano(2575));
        assertEquals("MMDLXXVI", instance.toRomano(2576));
        assertEquals("MMDLXXVII", instance.toRomano(2577));
        assertEquals("MMDLXXVIII", instance.toRomano(2578));
        assertEquals("MMDLXXIX", instance.toRomano(2579));
        assertEquals("MMDLXXX", instance.toRomano(2580));

        assertEquals("MMDLXXXI", instance.toRomano(2581));
        assertEquals("MMDLXXXII", instance.toRomano(2582));
        assertEquals("MMDLXXXIII", instance.toRomano(2583));
        assertEquals("MMDLXXXIV", instance.toRomano(2584));
        assertEquals("MMDLXXXV", instance.toRomano(2585));
        assertEquals("MMDLXXXVI", instance.toRomano(2586));
        assertEquals("MMDLXXXVII", instance.toRomano(2587));
        assertEquals("MMDLXXXVIII", instance.toRomano(2588));
        assertEquals("MMDLXXXIX", instance.toRomano(2589));
        assertEquals("MMDXC", instance.toRomano(2590));

        assertEquals("MMDXCI", instance.toRomano(2591));
        assertEquals("MMDXCII", instance.toRomano(2592));
        assertEquals("MMDXCIII", instance.toRomano(2593));
        assertEquals("MMDXCIV", instance.toRomano(2594));
        assertEquals("MMDXCV", instance.toRomano(2595));
        assertEquals("MMDXCVI", instance.toRomano(2596));
        assertEquals("MMDXCVII", instance.toRomano(2597));
        assertEquals("MMDXCVIII", instance.toRomano(2598));
        assertEquals("MMDXCIX", instance.toRomano(2599));
        assertEquals("MMDC", instance.toRomano(2600));

        assertEquals("MMDCI", instance.toRomano(2601));
        assertEquals("MMDCII", instance.toRomano(2602));
        assertEquals("MMDCIII", instance.toRomano(2603));
        assertEquals("MMDCIV", instance.toRomano(2604));
        assertEquals("MMDCV", instance.toRomano(2605));
        assertEquals("MMDCVI", instance.toRomano(2606));
        assertEquals("MMDCVII", instance.toRomano(2607));
        assertEquals("MMDCVIII", instance.toRomano(2608));
        assertEquals("MMDCIX", instance.toRomano(2609));
        assertEquals("MMDCX", instance.toRomano(2610));

        assertEquals("MMDCXI", instance.toRomano(2611));
        assertEquals("MMDCXII", instance.toRomano(2612));
        assertEquals("MMDCXIII", instance.toRomano(2613));
        assertEquals("MMDCXIV", instance.toRomano(2614));
        assertEquals("MMDCXV", instance.toRomano(2615));
        assertEquals("MMDCXVI", instance.toRomano(2616));
        assertEquals("MMDCXVII", instance.toRomano(2617));
        assertEquals("MMDCXVIII", instance.toRomano(2618));
        assertEquals("MMDCXIX", instance.toRomano(2619));
        assertEquals("MMDCXX", instance.toRomano(2620));

        assertEquals("MMDCXXI", instance.toRomano(2621));
        assertEquals("MMDCXXII", instance.toRomano(2622));
        assertEquals("MMDCXXIII", instance.toRomano(2623));
        assertEquals("MMDCXXIV", instance.toRomano(2624));
        assertEquals("MMDCXXV", instance.toRomano(2625));
        assertEquals("MMDCXXVI", instance.toRomano(2626));
        assertEquals("MMDCXXVII", instance.toRomano(2627));
        assertEquals("MMDCXXVIII", instance.toRomano(2628));
        assertEquals("MMDCXXIX", instance.toRomano(2629));
        assertEquals("MMDCXXX", instance.toRomano(2630));

        assertEquals("MMDCXXXI", instance.toRomano(2631));
        assertEquals("MMDCXXXII", instance.toRomano(2632));
        assertEquals("MMDCXXXIII", instance.toRomano(2633));
        assertEquals("MMDCXXXIV", instance.toRomano(2634));
        assertEquals("MMDCXXXV", instance.toRomano(2635));
        assertEquals("MMDCXXXVI", instance.toRomano(2636));
        assertEquals("MMDCXXXVII", instance.toRomano(2637));
        assertEquals("MMDCXXXVIII", instance.toRomano(2638));
        assertEquals("MMDCXXXIX", instance.toRomano(2639));
        assertEquals("MMDCXL", instance.toRomano(2640));

        assertEquals("MMDCXLI", instance.toRomano(2641));
        assertEquals("MMDCXLII", instance.toRomano(2642));
        assertEquals("MMDCXLIII", instance.toRomano(2643));
        assertEquals("MMDCXLIV", instance.toRomano(2644));
        assertEquals("MMDCXLV", instance.toRomano(2645));
        assertEquals("MMDCXLVI", instance.toRomano(2646));
        assertEquals("MMDCXLVII", instance.toRomano(2647));
        assertEquals("MMDCXLVIII", instance.toRomano(2648));
        assertEquals("MMDCXLIX", instance.toRomano(2649));
        assertEquals("MMDCL", instance.toRomano(2650));

        assertEquals("MMDCLI", instance.toRomano(2651));
        assertEquals("MMDCLII", instance.toRomano(2652));
        assertEquals("MMDCLIII", instance.toRomano(2653));
        assertEquals("MMDCLIV", instance.toRomano(2654));
        assertEquals("MMDCLV", instance.toRomano(2655));
        assertEquals("MMDCLVI", instance.toRomano(2656));
        assertEquals("MMDCLVII", instance.toRomano(2657));
        assertEquals("MMDCLVIII", instance.toRomano(2658));
        assertEquals("MMDCLIX", instance.toRomano(2659));
        assertEquals("MMDCLX", instance.toRomano(2660));

        assertEquals("MMDCLXI", instance.toRomano(2661));
        assertEquals("MMDCLXII", instance.toRomano(2662));
        assertEquals("MMDCLXIII", instance.toRomano(2663));
        assertEquals("MMDCLXIV", instance.toRomano(2664));
        assertEquals("MMDCLXV", instance.toRomano(2665));
        assertEquals("MMDCLXVI", instance.toRomano(2666));
        assertEquals("MMDCLXVII", instance.toRomano(2667));
        assertEquals("MMDCLXVIII", instance.toRomano(2668));
        assertEquals("MMDCLXIX", instance.toRomano(2669));
        assertEquals("MMDCLXX", instance.toRomano(2670));

        assertEquals("MMDCLXXI", instance.toRomano(2671));
        assertEquals("MMDCLXXII", instance.toRomano(2672));
        assertEquals("MMDCLXXIII", instance.toRomano(2673));
        assertEquals("MMDCLXXIV", instance.toRomano(2674));
        assertEquals("MMDCLXXV", instance.toRomano(2675));
        assertEquals("MMDCLXXVI", instance.toRomano(2676));
        assertEquals("MMDCLXXVII", instance.toRomano(2677));
        assertEquals("MMDCLXXVIII", instance.toRomano(2678));
        assertEquals("MMDCLXXIX", instance.toRomano(2679));
        assertEquals("MMDCLXXX", instance.toRomano(2680));

        assertEquals("MMDCLXXXI", instance.toRomano(2681));
        assertEquals("MMDCLXXXII", instance.toRomano(2682));
        assertEquals("MMDCLXXXIII", instance.toRomano(2683));
        assertEquals("MMDCLXXXIV", instance.toRomano(2684));
        assertEquals("MMDCLXXXV", instance.toRomano(2685));
        assertEquals("MMDCLXXXVI", instance.toRomano(2686));
        assertEquals("MMDCLXXXVII", instance.toRomano(2687));
        assertEquals("MMDCLXXXVIII", instance.toRomano(2688));
        assertEquals("MMDCLXXXIX", instance.toRomano(2689));
        assertEquals("MMDCXC", instance.toRomano(2690));

        assertEquals("MMDCXCI", instance.toRomano(2691));
        assertEquals("MMDCXCII", instance.toRomano(2692));
        assertEquals("MMDCXCIII", instance.toRomano(2693));
        assertEquals("MMDCXCIV", instance.toRomano(2694));
        assertEquals("MMDCXCV", instance.toRomano(2695));
        assertEquals("MMDCXCVI", instance.toRomano(2696));
        assertEquals("MMDCXCVII", instance.toRomano(2697));
        assertEquals("MMDCXCVIII", instance.toRomano(2698));
        assertEquals("MMDCXCIX", instance.toRomano(2699));
        assertEquals("MMDCC", instance.toRomano(2700));

        assertEquals("MMDCCI", instance.toRomano(2701));
        assertEquals("MMDCCII", instance.toRomano(2702));
        assertEquals("MMDCCIII", instance.toRomano(2703));
        assertEquals("MMDCCIV", instance.toRomano(2704));
        assertEquals("MMDCCV", instance.toRomano(2705));
        assertEquals("MMDCCVI", instance.toRomano(2706));
        assertEquals("MMDCCVII", instance.toRomano(2707));
        assertEquals("MMDCCVIII", instance.toRomano(2708));
        assertEquals("MMDCCIX", instance.toRomano(2709));
        assertEquals("MMDCCX", instance.toRomano(2710));

        assertEquals("MMDCCXI", instance.toRomano(2711));
        assertEquals("MMDCCXII", instance.toRomano(2712));
        assertEquals("MMDCCXIII", instance.toRomano(2713));
        assertEquals("MMDCCXIV", instance.toRomano(2714));
        assertEquals("MMDCCXV", instance.toRomano(2715));
        assertEquals("MMDCCXVI", instance.toRomano(2716));
        assertEquals("MMDCCXVII", instance.toRomano(2717));
        assertEquals("MMDCCXVIII", instance.toRomano(2718));
        assertEquals("MMDCCXIX", instance.toRomano(2719));
        assertEquals("MMDCCXX", instance.toRomano(2720));

        assertEquals("MMDCCXXI", instance.toRomano(2721));
        assertEquals("MMDCCXXII", instance.toRomano(2722));
        assertEquals("MMDCCXXIII", instance.toRomano(2723));
        assertEquals("MMDCCXXIV", instance.toRomano(2724));
        assertEquals("MMDCCXXV", instance.toRomano(2725));
        assertEquals("MMDCCXXVI", instance.toRomano(2726));
        assertEquals("MMDCCXXVII", instance.toRomano(2727));
        assertEquals("MMDCCXXVIII", instance.toRomano(2728));
        assertEquals("MMDCCXXIX", instance.toRomano(2729));
        assertEquals("MMDCCXXX", instance.toRomano(2730));

        assertEquals("MMDCCXXXI", instance.toRomano(2731));
        assertEquals("MMDCCXXXII", instance.toRomano(2732));
        assertEquals("MMDCCXXXIII", instance.toRomano(2733));
        assertEquals("MMDCCXXXIV", instance.toRomano(2734));
        assertEquals("MMDCCXXXV", instance.toRomano(2735));
        assertEquals("MMDCCXXXVI", instance.toRomano(2736));
        assertEquals("MMDCCXXXVII", instance.toRomano(2737));
        assertEquals("MMDCCXXXVIII", instance.toRomano(2738));
        assertEquals("MMDCCXXXIX", instance.toRomano(2739));
        assertEquals("MMDCCXL", instance.toRomano(2740));

        assertEquals("MMDCCXLI", instance.toRomano(2741));
        assertEquals("MMDCCXLII", instance.toRomano(2742));
        assertEquals("MMDCCXLIII", instance.toRomano(2743));
        assertEquals("MMDCCXLIV", instance.toRomano(2744));
        assertEquals("MMDCCXLV", instance.toRomano(2745));
        assertEquals("MMDCCXLVI", instance.toRomano(2746));
        assertEquals("MMDCCXLVII", instance.toRomano(2747));
        assertEquals("MMDCCXLVIII", instance.toRomano(2748));
        assertEquals("MMDCCXLIX", instance.toRomano(2749));
        assertEquals("MMDCCL", instance.toRomano(2750));

        assertEquals("MMDCCLI", instance.toRomano(2751));
        assertEquals("MMDCCLII", instance.toRomano(2752));
        assertEquals("MMDCCLIII", instance.toRomano(2753));
        assertEquals("MMDCCLIV", instance.toRomano(2754));
        assertEquals("MMDCCLV", instance.toRomano(2755));
        assertEquals("MMDCCLVI", instance.toRomano(2756));
        assertEquals("MMDCCLVII", instance.toRomano(2757));
        assertEquals("MMDCCLVIII", instance.toRomano(2758));
        assertEquals("MMDCCLIX", instance.toRomano(2759));
        assertEquals("MMDCCLX", instance.toRomano(2760));

        assertEquals("MMDCCLXI", instance.toRomano(2761));
        assertEquals("MMDCCLXII", instance.toRomano(2762));
        assertEquals("MMDCCLXIII", instance.toRomano(2763));
        assertEquals("MMDCCLXIV", instance.toRomano(2764));
        assertEquals("MMDCCLXV", instance.toRomano(2765));
        assertEquals("MMDCCLXVI", instance.toRomano(2766));
        assertEquals("MMDCCLXVII", instance.toRomano(2767));
        assertEquals("MMDCCLXVIII", instance.toRomano(2768));
        assertEquals("MMDCCLXIX", instance.toRomano(2769));
        assertEquals("MMDCCLXX", instance.toRomano(2770));

        assertEquals("MMDCCLXXI", instance.toRomano(2771));
        assertEquals("MMDCCLXXII", instance.toRomano(2772));
        assertEquals("MMDCCLXXIII", instance.toRomano(2773));
        assertEquals("MMDCCLXXIV", instance.toRomano(2774));
        assertEquals("MMDCCLXXV", instance.toRomano(2775));
        assertEquals("MMDCCLXXVI", instance.toRomano(2776));
        assertEquals("MMDCCLXXVII", instance.toRomano(2777));
        assertEquals("MMDCCLXXVIII", instance.toRomano(2778));
        assertEquals("MMDCCLXXIX", instance.toRomano(2779));
        assertEquals("MMDCCLXXX", instance.toRomano(2780));

        assertEquals("MMDCCLXXXI", instance.toRomano(2781));
        assertEquals("MMDCCLXXXII", instance.toRomano(2782));
        assertEquals("MMDCCLXXXIII", instance.toRomano(2783));
        assertEquals("MMDCCLXXXIV", instance.toRomano(2784));
        assertEquals("MMDCCLXXXV", instance.toRomano(2785));
        assertEquals("MMDCCLXXXVI", instance.toRomano(2786));
        assertEquals("MMDCCLXXXVII", instance.toRomano(2787));
        assertEquals("MMDCCLXXXVIII", instance.toRomano(2788));
        assertEquals("MMDCCLXXXIX", instance.toRomano(2789));
        assertEquals("MMDCCXC", instance.toRomano(2790));

        assertEquals("MMDCCXCI", instance.toRomano(2791));
        assertEquals("MMDCCXCII", instance.toRomano(2792));
        assertEquals("MMDCCXCIII", instance.toRomano(2793));
        assertEquals("MMDCCXCIV", instance.toRomano(2794));
        assertEquals("MMDCCXCV", instance.toRomano(2795));
        assertEquals("MMDCCXCVI", instance.toRomano(2796));
        assertEquals("MMDCCXCVII", instance.toRomano(2797));
        assertEquals("MMDCCXCVIII", instance.toRomano(2798));
        assertEquals("MMDCCXCIX", instance.toRomano(2799));
        assertEquals("MMDCCC", instance.toRomano(2800));

        assertEquals("MMDCCCI", instance.toRomano(2801));
        assertEquals("MMDCCCII", instance.toRomano(2802));
        assertEquals("MMDCCCIII", instance.toRomano(2803));
        assertEquals("MMDCCCIV", instance.toRomano(2804));
        assertEquals("MMDCCCV", instance.toRomano(2805));
        assertEquals("MMDCCCVI", instance.toRomano(2806));
        assertEquals("MMDCCCVII", instance.toRomano(2807));
        assertEquals("MMDCCCVIII", instance.toRomano(2808));
        assertEquals("MMDCCCIX", instance.toRomano(2809));
        assertEquals("MMDCCCX", instance.toRomano(2810));

        assertEquals("MMDCCCXI", instance.toRomano(2811));
        assertEquals("MMDCCCXII", instance.toRomano(2812));
        assertEquals("MMDCCCXIII", instance.toRomano(2813));
        assertEquals("MMDCCCXIV", instance.toRomano(2814));
        assertEquals("MMDCCCXV", instance.toRomano(2815));
        assertEquals("MMDCCCXVI", instance.toRomano(2816));
        assertEquals("MMDCCCXVII", instance.toRomano(2817));
        assertEquals("MMDCCCXVIII", instance.toRomano(2818));
        assertEquals("MMDCCCXIX", instance.toRomano(2819));
        assertEquals("MMDCCCXX", instance.toRomano(2820));

        assertEquals("MMDCCCXXI", instance.toRomano(2821));
        assertEquals("MMDCCCXXII", instance.toRomano(2822));
        assertEquals("MMDCCCXXIII", instance.toRomano(2823));
        assertEquals("MMDCCCXXIV", instance.toRomano(2824));
        assertEquals("MMDCCCXXV", instance.toRomano(2825));
        assertEquals("MMDCCCXXVI", instance.toRomano(2826));
        assertEquals("MMDCCCXXVII", instance.toRomano(2827));
        assertEquals("MMDCCCXXVIII", instance.toRomano(2828));
        assertEquals("MMDCCCXXIX", instance.toRomano(2829));
        assertEquals("MMDCCCXXX", instance.toRomano(2830));

        assertEquals("MMDCCCXXXI", instance.toRomano(2831));
        assertEquals("MMDCCCXXXII", instance.toRomano(2832));
        assertEquals("MMDCCCXXXIII", instance.toRomano(2833));
        assertEquals("MMDCCCXXXIV", instance.toRomano(2834));
        assertEquals("MMDCCCXXXV", instance.toRomano(2835));
        assertEquals("MMDCCCXXXVI", instance.toRomano(2836));
        assertEquals("MMDCCCXXXVII", instance.toRomano(2837));
        assertEquals("MMDCCCXXXVIII", instance.toRomano(2838));
        assertEquals("MMDCCCXXXIX", instance.toRomano(2839));
        assertEquals("MMDCCCXL", instance.toRomano(2840));

        assertEquals("MMDCCCXLI", instance.toRomano(2841));
        assertEquals("MMDCCCXLII", instance.toRomano(2842));
        assertEquals("MMDCCCXLIII", instance.toRomano(2843));
        assertEquals("MMDCCCXLIV", instance.toRomano(2844));
        assertEquals("MMDCCCXLV", instance.toRomano(2845));
        assertEquals("MMDCCCXLVI", instance.toRomano(2846));
        assertEquals("MMDCCCXLVII", instance.toRomano(2847));
        assertEquals("MMDCCCXLVIII", instance.toRomano(2848));
        assertEquals("MMDCCCXLIX", instance.toRomano(2849));
        assertEquals("MMDCCCL", instance.toRomano(2850));

        assertEquals("MMDCCCLI", instance.toRomano(2851));
        assertEquals("MMDCCCLII", instance.toRomano(2852));
        assertEquals("MMDCCCLIII", instance.toRomano(2853));
        assertEquals("MMDCCCLIV", instance.toRomano(2854));
        assertEquals("MMDCCCLV", instance.toRomano(2855));
        assertEquals("MMDCCCLVI", instance.toRomano(2856));
        assertEquals("MMDCCCLVII", instance.toRomano(2857));
        assertEquals("MMDCCCLVIII", instance.toRomano(2858));
        assertEquals("MMDCCCLIX", instance.toRomano(2859));
        assertEquals("MMDCCCLX", instance.toRomano(2860));

        assertEquals("MMDCCCLXI", instance.toRomano(2861));
        assertEquals("MMDCCCLXII", instance.toRomano(2862));
        assertEquals("MMDCCCLXIII", instance.toRomano(2863));
        assertEquals("MMDCCCLXIV", instance.toRomano(2864));
        assertEquals("MMDCCCLXV", instance.toRomano(2865));
        assertEquals("MMDCCCLXVI", instance.toRomano(2866));
        assertEquals("MMDCCCLXVII", instance.toRomano(2867));
        assertEquals("MMDCCCLXVIII", instance.toRomano(2868));
        assertEquals("MMDCCCLXIX", instance.toRomano(2869));
        assertEquals("MMDCCCLXX", instance.toRomano(2870));

        assertEquals("MMDCCCLXXI", instance.toRomano(2871));
        assertEquals("MMDCCCLXXII", instance.toRomano(2872));
        assertEquals("MMDCCCLXXIII", instance.toRomano(2873));
        assertEquals("MMDCCCLXXIV", instance.toRomano(2874));
        assertEquals("MMDCCCLXXV", instance.toRomano(2875));
        assertEquals("MMDCCCLXXVI", instance.toRomano(2876));
        assertEquals("MMDCCCLXXVII", instance.toRomano(2877));
        assertEquals("MMDCCCLXXVIII", instance.toRomano(2878));
        assertEquals("MMDCCCLXXIX", instance.toRomano(2879));
        assertEquals("MMDCCCLXXX", instance.toRomano(2880));

        assertEquals("MMDCCCLXXXI", instance.toRomano(2881));
        assertEquals("MMDCCCLXXXII", instance.toRomano(2882));
        assertEquals("MMDCCCLXXXIII", instance.toRomano(2883));
        assertEquals("MMDCCCLXXXIV", instance.toRomano(2884));
        assertEquals("MMDCCCLXXXV", instance.toRomano(2885));
        assertEquals("MMDCCCLXXXVI", instance.toRomano(2886));
        assertEquals("MMDCCCLXXXVII", instance.toRomano(2887));
        assertEquals("MMDCCCLXXXVIII", instance.toRomano(2888));
        assertEquals("MMDCCCLXXXIX", instance.toRomano(2889));
        assertEquals("MMDCCCXC", instance.toRomano(2890));

        assertEquals("MMDCCCXCI", instance.toRomano(2891));
        assertEquals("MMDCCCXCII", instance.toRomano(2892));
        assertEquals("MMDCCCXCIII", instance.toRomano(2893));
        assertEquals("MMDCCCXCIV", instance.toRomano(2894));
        assertEquals("MMDCCCXCV", instance.toRomano(2895));
        assertEquals("MMDCCCXCVI", instance.toRomano(2896));
        assertEquals("MMDCCCXCVII", instance.toRomano(2897));
        assertEquals("MMDCCCXCVIII", instance.toRomano(2898));
        assertEquals("MMDCCCXCIX", instance.toRomano(2899));
        assertEquals("MMCM", instance.toRomano(2900));

        assertEquals("MMCMI", instance.toRomano(2901));
        assertEquals("MMCMII", instance.toRomano(2902));
        assertEquals("MMCMIII", instance.toRomano(2903));
        assertEquals("MMCMIV", instance.toRomano(2904));
        assertEquals("MMCMV", instance.toRomano(2905));
        assertEquals("MMCMVI", instance.toRomano(2906));
        assertEquals("MMCMVII", instance.toRomano(2907));
        assertEquals("MMCMVIII", instance.toRomano(2908));
        assertEquals("MMCMIX", instance.toRomano(2909));
        assertEquals("MMCMX", instance.toRomano(2910));

        assertEquals("MMCMXI", instance.toRomano(2911));
        assertEquals("MMCMXII", instance.toRomano(2912));
        assertEquals("MMCMXIII", instance.toRomano(2913));
        assertEquals("MMCMXIV", instance.toRomano(2914));
        assertEquals("MMCMXV", instance.toRomano(2915));
        assertEquals("MMCMXVI", instance.toRomano(2916));
        assertEquals("MMCMXVII", instance.toRomano(2917));
        assertEquals("MMCMXVIII", instance.toRomano(2918));
        assertEquals("MMCMXIX", instance.toRomano(2919));
        assertEquals("MMCMXX", instance.toRomano(2920));

        assertEquals("MMCMXXI", instance.toRomano(2921));
        assertEquals("MMCMXXII", instance.toRomano(2922));
        assertEquals("MMCMXXIII", instance.toRomano(2923));
        assertEquals("MMCMXXIV", instance.toRomano(2924));
        assertEquals("MMCMXXV", instance.toRomano(2925));
        assertEquals("MMCMXXVI", instance.toRomano(2926));
        assertEquals("MMCMXXVII", instance.toRomano(2927));
        assertEquals("MMCMXXVIII", instance.toRomano(2928));
        assertEquals("MMCMXXIX", instance.toRomano(2929));
        assertEquals("MMCMXXX", instance.toRomano(2930));

        assertEquals("MMCMXXXI", instance.toRomano(2931));
        assertEquals("MMCMXXXII", instance.toRomano(2932));
        assertEquals("MMCMXXXIII", instance.toRomano(2933));
        assertEquals("MMCMXXXIV", instance.toRomano(2934));
        assertEquals("MMCMXXXV", instance.toRomano(2935));
        assertEquals("MMCMXXXVI", instance.toRomano(2936));
        assertEquals("MMCMXXXVII", instance.toRomano(2937));
        assertEquals("MMCMXXXVIII", instance.toRomano(2938));
        assertEquals("MMCMXXXIX", instance.toRomano(2939));
        assertEquals("MMCMXL", instance.toRomano(2940));

        assertEquals("MMCMXLI", instance.toRomano(2941));
        assertEquals("MMCMXLII", instance.toRomano(2942));
        assertEquals("MMCMXLIII", instance.toRomano(2943));
        assertEquals("MMCMXLIV", instance.toRomano(2944));
        assertEquals("MMCMXLV", instance.toRomano(2945));
        assertEquals("MMCMXLVI", instance.toRomano(2946));
        assertEquals("MMCMXLVII", instance.toRomano(2947));
        assertEquals("MMCMXLVIII", instance.toRomano(2948));
        assertEquals("MMCMXLIX", instance.toRomano(2949));
        assertEquals("MMCML", instance.toRomano(2950));

        assertEquals("MMCMLI", instance.toRomano(2951));
        assertEquals("MMCMLII", instance.toRomano(2952));
        assertEquals("MMCMLIII", instance.toRomano(2953));
        assertEquals("MMCMLIV", instance.toRomano(2954));
        assertEquals("MMCMLV", instance.toRomano(2955));
        assertEquals("MMCMLVI", instance.toRomano(2956));
        assertEquals("MMCMLVII", instance.toRomano(2957));
        assertEquals("MMCMLVIII", instance.toRomano(2958));
        assertEquals("MMCMLIX", instance.toRomano(2959));
        assertEquals("MMCMLX", instance.toRomano(2960));

        assertEquals("MMCMLXI", instance.toRomano(2961));
        assertEquals("MMCMLXII", instance.toRomano(2962));
        assertEquals("MMCMLXIII", instance.toRomano(2963));
        assertEquals("MMCMLXIV", instance.toRomano(2964));
        assertEquals("MMCMLXV", instance.toRomano(2965));
        assertEquals("MMCMLXVI", instance.toRomano(2966));
        assertEquals("MMCMLXVII", instance.toRomano(2967));
        assertEquals("MMCMLXVIII", instance.toRomano(2968));
        assertEquals("MMCMLXIX", instance.toRomano(2969));
        assertEquals("MMCMLXX", instance.toRomano(2970));

        assertEquals("MMCMLXXI", instance.toRomano(2971));
        assertEquals("MMCMLXXII", instance.toRomano(2972));
        assertEquals("MMCMLXXIII", instance.toRomano(2973));
        assertEquals("MMCMLXXIV", instance.toRomano(2974));
        assertEquals("MMCMLXXV", instance.toRomano(2975));
        assertEquals("MMCMLXXVI", instance.toRomano(2976));
        assertEquals("MMCMLXXVII", instance.toRomano(2977));
        assertEquals("MMCMLXXVIII", instance.toRomano(2978));
        assertEquals("MMCMLXXIX", instance.toRomano(2979));
        assertEquals("MMCMLXXX", instance.toRomano(2980));

        assertEquals("MMCMLXXXI", instance.toRomano(2981));
        assertEquals("MMCMLXXXII", instance.toRomano(2982));
        assertEquals("MMCMLXXXIII", instance.toRomano(2983));
        assertEquals("MMCMLXXXIV", instance.toRomano(2984));
        assertEquals("MMCMLXXXV", instance.toRomano(2985));
        assertEquals("MMCMLXXXVI", instance.toRomano(2986));
        assertEquals("MMCMLXXXVII", instance.toRomano(2987));
        assertEquals("MMCMLXXXVIII", instance.toRomano(2988));
        assertEquals("MMCMLXXXIX", instance.toRomano(2989));
        assertEquals("MMCMXC", instance.toRomano(2990));

        assertEquals("MMCMXCI", instance.toRomano(2991));
        assertEquals("MMCMXCII", instance.toRomano(2992));
        assertEquals("MMCMXCIII", instance.toRomano(2993));
        assertEquals("MMCMXCIV", instance.toRomano(2994));
        assertEquals("MMCMXCV", instance.toRomano(2995));
        assertEquals("MMCMXCVI", instance.toRomano(2996));
        assertEquals("MMCMXCVII", instance.toRomano(2997));
        assertEquals("MMCMXCVIII", instance.toRomano(2998));
        assertEquals("MMCMXCIX", instance.toRomano(2999));
        assertEquals("MMM", instance.toRomano(3000));
    }

    /**
     * Test of toDecimal method, of class NumeroRomano.
     */
    @Test(expected=NumeroRomanoNoValidoException.class)
    public void testToDecimal_0args() throws Exception {
        System.out.println("toDecimal");
        NumeroRomano numero = new NumeroRomano();
        numero.toDecimal();
    }

    /**
     * Test of toDecimal method, of class NumeroRomano.
     */
    @Test
    public void testToDecimal_String() throws Exception {
        System.out.println("toDecimal");
        
        NumeroRomano instance = new NumeroRomano();
       
        assertEquals(1, instance.toDecimal("I"));
        assertEquals(2, instance.toDecimal("II"));
        assertEquals(3, instance.toDecimal("III"));
        assertEquals(4, instance.toDecimal("IV"));
        assertEquals(5, instance.toDecimal("V"));
        assertEquals(6, instance.toDecimal("VI"));
        assertEquals(7, instance.toDecimal("VII"));
        assertEquals(8, instance.toDecimal("VIII"));
        assertEquals(9, instance.toDecimal("IX"));
        assertEquals(10, instance.toDecimal("X"));

        assertEquals(11, instance.toDecimal("XI"));
        assertEquals(12, instance.toDecimal("XII"));
        assertEquals(13, instance.toDecimal("XIII"));
        assertEquals(14, instance.toDecimal("XIV"));
        assertEquals(15, instance.toDecimal("XV"));
        assertEquals(16, instance.toDecimal("XVI"));
        assertEquals(17, instance.toDecimal("XVII"));
        assertEquals(18, instance.toDecimal("XVIII"));
        assertEquals(19, instance.toDecimal("XIX"));
        assertEquals(20, instance.toDecimal("XX"));

        assertEquals(21, instance.toDecimal("XXI"));
        assertEquals(22, instance.toDecimal("XXII"));
        assertEquals(23, instance.toDecimal("XXIII"));
        assertEquals(24, instance.toDecimal("XXIV"));
        assertEquals(25, instance.toDecimal("XXV"));
        assertEquals(26, instance.toDecimal("XXVI"));
        assertEquals(27, instance.toDecimal("XXVII"));
        assertEquals(28, instance.toDecimal("XXVIII"));
        assertEquals(29, instance.toDecimal("XXIX"));
        assertEquals(30, instance.toDecimal("XXX"));

        assertEquals(31, instance.toDecimal("XXXI"));
        assertEquals(32, instance.toDecimal("XXXII"));
        assertEquals(33, instance.toDecimal("XXXIII"));
        assertEquals(34, instance.toDecimal("XXXIV"));
        assertEquals(35, instance.toDecimal("XXXV"));
        assertEquals(36, instance.toDecimal("XXXVI"));
        assertEquals(37, instance.toDecimal("XXXVII"));
        assertEquals(38, instance.toDecimal("XXXVIII"));
        assertEquals(39, instance.toDecimal("XXXIX"));
        assertEquals(40, instance.toDecimal("XL"));

        assertEquals(41, instance.toDecimal("XLI"));
        assertEquals(42, instance.toDecimal("XLII"));
        assertEquals(43, instance.toDecimal("XLIII"));
        assertEquals(44, instance.toDecimal("XLIV"));
        assertEquals(45, instance.toDecimal("XLV"));
        assertEquals(46, instance.toDecimal("XLVI"));
        assertEquals(47, instance.toDecimal("XLVII"));
        assertEquals(48, instance.toDecimal("XLVIII"));
        assertEquals(49, instance.toDecimal("XLIX"));
        assertEquals(50, instance.toDecimal("L"));

        assertEquals(51, instance.toDecimal("LI"));
        assertEquals(52, instance.toDecimal("LII"));
        assertEquals(53, instance.toDecimal("LIII"));
        assertEquals(54, instance.toDecimal("LIV"));
        assertEquals(55, instance.toDecimal("LV"));
        assertEquals(56, instance.toDecimal("LVI"));
        assertEquals(57, instance.toDecimal("LVII"));
        assertEquals(58, instance.toDecimal("LVIII"));
        assertEquals(59, instance.toDecimal("LIX"));
        assertEquals(60, instance.toDecimal("LX"));

        assertEquals(61, instance.toDecimal("LXI"));
        assertEquals(62, instance.toDecimal("LXII"));
        assertEquals(63, instance.toDecimal("LXIII"));
        assertEquals(64, instance.toDecimal("LXIV"));
        assertEquals(65, instance.toDecimal("LXV"));
        assertEquals(66, instance.toDecimal("LXVI"));
        assertEquals(67, instance.toDecimal("LXVII"));
        assertEquals(68, instance.toDecimal("LXVIII"));
        assertEquals(69, instance.toDecimal("LXIX"));
        assertEquals(70, instance.toDecimal("LXX"));

        assertEquals(71, instance.toDecimal("LXXI"));
        assertEquals(72, instance.toDecimal("LXXII"));
        assertEquals(73, instance.toDecimal("LXXIII"));
        assertEquals(74, instance.toDecimal("LXXIV"));
        assertEquals(75, instance.toDecimal("LXXV"));
        assertEquals(76, instance.toDecimal("LXXVI"));
        assertEquals(77, instance.toDecimal("LXXVII"));
        assertEquals(78, instance.toDecimal("LXXVIII"));
        assertEquals(79, instance.toDecimal("LXXIX"));
        assertEquals(80, instance.toDecimal("LXXX"));

        assertEquals(81, instance.toDecimal("LXXXI"));
        assertEquals(82, instance.toDecimal("LXXXII"));
        assertEquals(83, instance.toDecimal("LXXXIII"));
        assertEquals(84, instance.toDecimal("LXXXIV"));
        assertEquals(85, instance.toDecimal("LXXXV"));
        assertEquals(86, instance.toDecimal("LXXXVI"));
        assertEquals(87, instance.toDecimal("LXXXVII"));
        assertEquals(88, instance.toDecimal("LXXXVIII"));
        assertEquals(89, instance.toDecimal("LXXXIX"));
        assertEquals(90, instance.toDecimal("XC"));

        assertEquals(91, instance.toDecimal("XCI"));
        assertEquals(92, instance.toDecimal("XCII"));
        assertEquals(93, instance.toDecimal("XCIII"));
        assertEquals(94, instance.toDecimal("XCIV"));
        assertEquals(95, instance.toDecimal("XCV"));
        assertEquals(96, instance.toDecimal("XCVI"));
        assertEquals(97, instance.toDecimal("XCVII"));
        assertEquals(98, instance.toDecimal("XCVIII"));
        assertEquals(99, instance.toDecimal("XCIX"));
        assertEquals(100, instance.toDecimal("C"));

        assertEquals(101, instance.toDecimal("CI"));
        assertEquals(102, instance.toDecimal("CII"));
        assertEquals(103, instance.toDecimal("CIII"));
        assertEquals(104, instance.toDecimal("CIV"));
        assertEquals(105, instance.toDecimal("CV"));
        assertEquals(106, instance.toDecimal("CVI"));
        assertEquals(107, instance.toDecimal("CVII"));
        assertEquals(108, instance.toDecimal("CVIII"));
        assertEquals(109, instance.toDecimal("CIX"));
        assertEquals(110, instance.toDecimal("CX"));

        assertEquals(111, instance.toDecimal("CXI"));
        assertEquals(112, instance.toDecimal("CXII"));
        assertEquals(113, instance.toDecimal("CXIII"));
        assertEquals(114, instance.toDecimal("CXIV"));
        assertEquals(115, instance.toDecimal("CXV"));
        assertEquals(116, instance.toDecimal("CXVI"));
        assertEquals(117, instance.toDecimal("CXVII"));
        assertEquals(118, instance.toDecimal("CXVIII"));
        assertEquals(119, instance.toDecimal("CXIX"));
        assertEquals(120, instance.toDecimal("CXX"));

        assertEquals(121, instance.toDecimal("CXXI"));
        assertEquals(122, instance.toDecimal("CXXII"));
        assertEquals(123, instance.toDecimal("CXXIII"));
        assertEquals(124, instance.toDecimal("CXXIV"));
        assertEquals(125, instance.toDecimal("CXXV"));
        assertEquals(126, instance.toDecimal("CXXVI"));
        assertEquals(127, instance.toDecimal("CXXVII"));
        assertEquals(128, instance.toDecimal("CXXVIII"));
        assertEquals(129, instance.toDecimal("CXXIX"));
        assertEquals(130, instance.toDecimal("CXXX"));

        assertEquals(131, instance.toDecimal("CXXXI"));
        assertEquals(132, instance.toDecimal("CXXXII"));
        assertEquals(133, instance.toDecimal("CXXXIII"));
        assertEquals(134, instance.toDecimal("CXXXIV"));
        assertEquals(135, instance.toDecimal("CXXXV"));
        assertEquals(136, instance.toDecimal("CXXXVI"));
        assertEquals(137, instance.toDecimal("CXXXVII"));
        assertEquals(138, instance.toDecimal("CXXXVIII"));
        assertEquals(139, instance.toDecimal("CXXXIX"));
        assertEquals(140, instance.toDecimal("CXL"));

        assertEquals(141, instance.toDecimal("CXLI"));
        assertEquals(142, instance.toDecimal("CXLII"));
        assertEquals(143, instance.toDecimal("CXLIII"));
        assertEquals(144, instance.toDecimal("CXLIV"));
        assertEquals(145, instance.toDecimal("CXLV"));
        assertEquals(146, instance.toDecimal("CXLVI"));
        assertEquals(147, instance.toDecimal("CXLVII"));
        assertEquals(148, instance.toDecimal("CXLVIII"));
        assertEquals(149, instance.toDecimal("CXLIX"));
        assertEquals(150, instance.toDecimal("CL"));

        assertEquals(151, instance.toDecimal("CLI"));
        assertEquals(152, instance.toDecimal("CLII"));
        assertEquals(153, instance.toDecimal("CLIII"));
        assertEquals(154, instance.toDecimal("CLIV"));
        assertEquals(155, instance.toDecimal("CLV"));
        assertEquals(156, instance.toDecimal("CLVI"));
        assertEquals(157, instance.toDecimal("CLVII"));
        assertEquals(158, instance.toDecimal("CLVIII"));
        assertEquals(159, instance.toDecimal("CLIX"));
        assertEquals(160, instance.toDecimal("CLX"));

        assertEquals(161, instance.toDecimal("CLXI"));
        assertEquals(162, instance.toDecimal("CLXII"));
        assertEquals(163, instance.toDecimal("CLXIII"));
        assertEquals(164, instance.toDecimal("CLXIV"));
        assertEquals(165, instance.toDecimal("CLXV"));
        assertEquals(166, instance.toDecimal("CLXVI"));
        assertEquals(167, instance.toDecimal("CLXVII"));
        assertEquals(168, instance.toDecimal("CLXVIII"));
        assertEquals(169, instance.toDecimal("CLXIX"));
        assertEquals(170, instance.toDecimal("CLXX"));

        assertEquals(171, instance.toDecimal("CLXXI"));
        assertEquals(172, instance.toDecimal("CLXXII"));
        assertEquals(173, instance.toDecimal("CLXXIII"));
        assertEquals(174, instance.toDecimal("CLXXIV"));
        assertEquals(175, instance.toDecimal("CLXXV"));
        assertEquals(176, instance.toDecimal("CLXXVI"));
        assertEquals(177, instance.toDecimal("CLXXVII"));
        assertEquals(178, instance.toDecimal("CLXXVIII"));
        assertEquals(179, instance.toDecimal("CLXXIX"));
        assertEquals(180, instance.toDecimal("CLXXX"));

        assertEquals(181, instance.toDecimal("CLXXXI"));
        assertEquals(182, instance.toDecimal("CLXXXII"));
        assertEquals(183, instance.toDecimal("CLXXXIII"));
        assertEquals(184, instance.toDecimal("CLXXXIV"));
        assertEquals(185, instance.toDecimal("CLXXXV"));
        assertEquals(186, instance.toDecimal("CLXXXVI"));
        assertEquals(187, instance.toDecimal("CLXXXVII"));
        assertEquals(188, instance.toDecimal("CLXXXVIII"));
        assertEquals(189, instance.toDecimal("CLXXXIX"));
        assertEquals(190, instance.toDecimal("CXC"));

        assertEquals(191, instance.toDecimal("CXCI"));
        assertEquals(192, instance.toDecimal("CXCII"));
        assertEquals(193, instance.toDecimal("CXCIII"));
        assertEquals(194, instance.toDecimal("CXCIV"));
        assertEquals(195, instance.toDecimal("CXCV"));
        assertEquals(196, instance.toDecimal("CXCVI"));
        assertEquals(197, instance.toDecimal("CXCVII"));
        assertEquals(198, instance.toDecimal("CXCVIII"));
        assertEquals(199, instance.toDecimal("CXCIX"));
        assertEquals(200, instance.toDecimal("CC"));

        assertEquals(201, instance.toDecimal("CCI"));
        assertEquals(202, instance.toDecimal("CCII"));
        assertEquals(203, instance.toDecimal("CCIII"));
        assertEquals(204, instance.toDecimal("CCIV"));
        assertEquals(205, instance.toDecimal("CCV"));
        assertEquals(206, instance.toDecimal("CCVI"));
        assertEquals(207, instance.toDecimal("CCVII"));
        assertEquals(208, instance.toDecimal("CCVIII"));
        assertEquals(209, instance.toDecimal("CCIX"));
        assertEquals(210, instance.toDecimal("CCX"));

        assertEquals(211, instance.toDecimal("CCXI"));
        assertEquals(212, instance.toDecimal("CCXII"));
        assertEquals(213, instance.toDecimal("CCXIII"));
        assertEquals(214, instance.toDecimal("CCXIV"));
        assertEquals(215, instance.toDecimal("CCXV"));
        assertEquals(216, instance.toDecimal("CCXVI"));
        assertEquals(217, instance.toDecimal("CCXVII"));
        assertEquals(218, instance.toDecimal("CCXVIII"));
        assertEquals(219, instance.toDecimal("CCXIX"));
        assertEquals(220, instance.toDecimal("CCXX"));

        assertEquals(221, instance.toDecimal("CCXXI"));
        assertEquals(222, instance.toDecimal("CCXXII"));
        assertEquals(223, instance.toDecimal("CCXXIII"));
        assertEquals(224, instance.toDecimal("CCXXIV"));
        assertEquals(225, instance.toDecimal("CCXXV"));
        assertEquals(226, instance.toDecimal("CCXXVI"));
        assertEquals(227, instance.toDecimal("CCXXVII"));
        assertEquals(228, instance.toDecimal("CCXXVIII"));
        assertEquals(229, instance.toDecimal("CCXXIX"));
        assertEquals(230, instance.toDecimal("CCXXX"));

        assertEquals(231, instance.toDecimal("CCXXXI"));
        assertEquals(232, instance.toDecimal("CCXXXII"));
        assertEquals(233, instance.toDecimal("CCXXXIII"));
        assertEquals(234, instance.toDecimal("CCXXXIV"));
        assertEquals(235, instance.toDecimal("CCXXXV"));
        assertEquals(236, instance.toDecimal("CCXXXVI"));
        assertEquals(237, instance.toDecimal("CCXXXVII"));
        assertEquals(238, instance.toDecimal("CCXXXVIII"));
        assertEquals(239, instance.toDecimal("CCXXXIX"));
        assertEquals(240, instance.toDecimal("CCXL"));

        assertEquals(241, instance.toDecimal("CCXLI"));
        assertEquals(242, instance.toDecimal("CCXLII"));
        assertEquals(243, instance.toDecimal("CCXLIII"));
        assertEquals(244, instance.toDecimal("CCXLIV"));
        assertEquals(245, instance.toDecimal("CCXLV"));
        assertEquals(246, instance.toDecimal("CCXLVI"));
        assertEquals(247, instance.toDecimal("CCXLVII"));
        assertEquals(248, instance.toDecimal("CCXLVIII"));
        assertEquals(249, instance.toDecimal("CCXLIX"));
        assertEquals(250, instance.toDecimal("CCL"));

        assertEquals(251, instance.toDecimal("CCLI"));
        assertEquals(252, instance.toDecimal("CCLII"));
        assertEquals(253, instance.toDecimal("CCLIII"));
        assertEquals(254, instance.toDecimal("CCLIV"));
        assertEquals(255, instance.toDecimal("CCLV"));
        assertEquals(256, instance.toDecimal("CCLVI"));
        assertEquals(257, instance.toDecimal("CCLVII"));
        assertEquals(258, instance.toDecimal("CCLVIII"));
        assertEquals(259, instance.toDecimal("CCLIX"));
        assertEquals(260, instance.toDecimal("CCLX"));

        assertEquals(261, instance.toDecimal("CCLXI"));
        assertEquals(262, instance.toDecimal("CCLXII"));
        assertEquals(263, instance.toDecimal("CCLXIII"));
        assertEquals(264, instance.toDecimal("CCLXIV"));
        assertEquals(265, instance.toDecimal("CCLXV"));
        assertEquals(266, instance.toDecimal("CCLXVI"));
        assertEquals(267, instance.toDecimal("CCLXVII"));
        assertEquals(268, instance.toDecimal("CCLXVIII"));
        assertEquals(269, instance.toDecimal("CCLXIX"));
        assertEquals(270, instance.toDecimal("CCLXX"));

        assertEquals(271, instance.toDecimal("CCLXXI"));
        assertEquals(272, instance.toDecimal("CCLXXII"));
        assertEquals(273, instance.toDecimal("CCLXXIII"));
        assertEquals(274, instance.toDecimal("CCLXXIV"));
        assertEquals(275, instance.toDecimal("CCLXXV"));
        assertEquals(276, instance.toDecimal("CCLXXVI"));
        assertEquals(277, instance.toDecimal("CCLXXVII"));
        assertEquals(278, instance.toDecimal("CCLXXVIII"));
        assertEquals(279, instance.toDecimal("CCLXXIX"));
        assertEquals(280, instance.toDecimal("CCLXXX"));

        assertEquals(281, instance.toDecimal("CCLXXXI"));
        assertEquals(282, instance.toDecimal("CCLXXXII"));
        assertEquals(283, instance.toDecimal("CCLXXXIII"));
        assertEquals(284, instance.toDecimal("CCLXXXIV"));
        assertEquals(285, instance.toDecimal("CCLXXXV"));
        assertEquals(286, instance.toDecimal("CCLXXXVI"));
        assertEquals(287, instance.toDecimal("CCLXXXVII"));
        assertEquals(288, instance.toDecimal("CCLXXXVIII"));
        assertEquals(289, instance.toDecimal("CCLXXXIX"));
        assertEquals(290, instance.toDecimal("CCXC"));

        assertEquals(291, instance.toDecimal("CCXCI"));
        assertEquals(292, instance.toDecimal("CCXCII"));
        assertEquals(293, instance.toDecimal("CCXCIII"));
        assertEquals(294, instance.toDecimal("CCXCIV"));
        assertEquals(295, instance.toDecimal("CCXCV"));
        assertEquals(296, instance.toDecimal("CCXCVI"));
        assertEquals(297, instance.toDecimal("CCXCVII"));
        assertEquals(298, instance.toDecimal("CCXCVIII"));
        assertEquals(299, instance.toDecimal("CCXCIX"));
        assertEquals(300, instance.toDecimal("CCC"));

        assertEquals(301, instance.toDecimal("CCCI"));
        assertEquals(302, instance.toDecimal("CCCII"));
        assertEquals(303, instance.toDecimal("CCCIII"));
        assertEquals(304, instance.toDecimal("CCCIV"));
        assertEquals(305, instance.toDecimal("CCCV"));
        assertEquals(306, instance.toDecimal("CCCVI"));
        assertEquals(307, instance.toDecimal("CCCVII"));
        assertEquals(308, instance.toDecimal("CCCVIII"));
        assertEquals(309, instance.toDecimal("CCCIX"));
        assertEquals(310, instance.toDecimal("CCCX"));

        assertEquals(311, instance.toDecimal("CCCXI"));
        assertEquals(312, instance.toDecimal("CCCXII"));
        assertEquals(313, instance.toDecimal("CCCXIII"));
        assertEquals(314, instance.toDecimal("CCCXIV"));
        assertEquals(315, instance.toDecimal("CCCXV"));
        assertEquals(316, instance.toDecimal("CCCXVI"));
        assertEquals(317, instance.toDecimal("CCCXVII"));
        assertEquals(318, instance.toDecimal("CCCXVIII"));
        assertEquals(319, instance.toDecimal("CCCXIX"));
        assertEquals(320, instance.toDecimal("CCCXX"));

        assertEquals(321, instance.toDecimal("CCCXXI"));
        assertEquals(322, instance.toDecimal("CCCXXII"));
        assertEquals(323, instance.toDecimal("CCCXXIII"));
        assertEquals(324, instance.toDecimal("CCCXXIV"));
        assertEquals(325, instance.toDecimal("CCCXXV"));
        assertEquals(326, instance.toDecimal("CCCXXVI"));
        assertEquals(327, instance.toDecimal("CCCXXVII"));
        assertEquals(328, instance.toDecimal("CCCXXVIII"));
        assertEquals(329, instance.toDecimal("CCCXXIX"));
        assertEquals(330, instance.toDecimal("CCCXXX"));

        assertEquals(331, instance.toDecimal("CCCXXXI"));
        assertEquals(332, instance.toDecimal("CCCXXXII"));
        assertEquals(333, instance.toDecimal("CCCXXXIII"));
        assertEquals(334, instance.toDecimal("CCCXXXIV"));
        assertEquals(335, instance.toDecimal("CCCXXXV"));
        assertEquals(336, instance.toDecimal("CCCXXXVI"));
        assertEquals(337, instance.toDecimal("CCCXXXVII"));
        assertEquals(338, instance.toDecimal("CCCXXXVIII"));
        assertEquals(339, instance.toDecimal("CCCXXXIX"));
        assertEquals(340, instance.toDecimal("CCCXL"));

        assertEquals(341, instance.toDecimal("CCCXLI"));
        assertEquals(342, instance.toDecimal("CCCXLII"));
        assertEquals(343, instance.toDecimal("CCCXLIII"));
        assertEquals(344, instance.toDecimal("CCCXLIV"));
        assertEquals(345, instance.toDecimal("CCCXLV"));
        assertEquals(346, instance.toDecimal("CCCXLVI"));
        assertEquals(347, instance.toDecimal("CCCXLVII"));
        assertEquals(348, instance.toDecimal("CCCXLVIII"));
        assertEquals(349, instance.toDecimal("CCCXLIX"));
        assertEquals(350, instance.toDecimal("CCCL"));

        assertEquals(351, instance.toDecimal("CCCLI"));
        assertEquals(352, instance.toDecimal("CCCLII"));
        assertEquals(353, instance.toDecimal("CCCLIII"));
        assertEquals(354, instance.toDecimal("CCCLIV"));
        assertEquals(355, instance.toDecimal("CCCLV"));
        assertEquals(356, instance.toDecimal("CCCLVI"));
        assertEquals(357, instance.toDecimal("CCCLVII"));
        assertEquals(358, instance.toDecimal("CCCLVIII"));
        assertEquals(359, instance.toDecimal("CCCLIX"));
        assertEquals(360, instance.toDecimal("CCCLX"));

        assertEquals(361, instance.toDecimal("CCCLXI"));
        assertEquals(362, instance.toDecimal("CCCLXII"));
        assertEquals(363, instance.toDecimal("CCCLXIII"));
        assertEquals(364, instance.toDecimal("CCCLXIV"));
        assertEquals(365, instance.toDecimal("CCCLXV"));
        assertEquals(366, instance.toDecimal("CCCLXVI"));
        assertEquals(367, instance.toDecimal("CCCLXVII"));
        assertEquals(368, instance.toDecimal("CCCLXVIII"));
        assertEquals(369, instance.toDecimal("CCCLXIX"));
        assertEquals(370, instance.toDecimal("CCCLXX"));

        assertEquals(371, instance.toDecimal("CCCLXXI"));
        assertEquals(372, instance.toDecimal("CCCLXXII"));
        assertEquals(373, instance.toDecimal("CCCLXXIII"));
        assertEquals(374, instance.toDecimal("CCCLXXIV"));
        assertEquals(375, instance.toDecimal("CCCLXXV"));
        assertEquals(376, instance.toDecimal("CCCLXXVI"));
        assertEquals(377, instance.toDecimal("CCCLXXVII"));
        assertEquals(378, instance.toDecimal("CCCLXXVIII"));
        assertEquals(379, instance.toDecimal("CCCLXXIX"));
        assertEquals(380, instance.toDecimal("CCCLXXX"));

        assertEquals(381, instance.toDecimal("CCCLXXXI"));
        assertEquals(382, instance.toDecimal("CCCLXXXII"));
        assertEquals(383, instance.toDecimal("CCCLXXXIII"));
        assertEquals(384, instance.toDecimal("CCCLXXXIV"));
        assertEquals(385, instance.toDecimal("CCCLXXXV"));
        assertEquals(386, instance.toDecimal("CCCLXXXVI"));
        assertEquals(387, instance.toDecimal("CCCLXXXVII"));
        assertEquals(388, instance.toDecimal("CCCLXXXVIII"));
        assertEquals(389, instance.toDecimal("CCCLXXXIX"));
        assertEquals(390, instance.toDecimal("CCCXC"));

        assertEquals(391, instance.toDecimal("CCCXCI"));
        assertEquals(392, instance.toDecimal("CCCXCII"));
        assertEquals(393, instance.toDecimal("CCCXCIII"));
        assertEquals(394, instance.toDecimal("CCCXCIV"));
        assertEquals(395, instance.toDecimal("CCCXCV"));
        assertEquals(396, instance.toDecimal("CCCXCVI"));
        assertEquals(397, instance.toDecimal("CCCXCVII"));
        assertEquals(398, instance.toDecimal("CCCXCVIII"));
        assertEquals(399, instance.toDecimal("CCCXCIX"));
        assertEquals(400, instance.toDecimal("CD"));

        assertEquals(401, instance.toDecimal("CDI"));
        assertEquals(402, instance.toDecimal("CDII"));
        assertEquals(403, instance.toDecimal("CDIII"));
        assertEquals(404, instance.toDecimal("CDIV"));
        assertEquals(405, instance.toDecimal("CDV"));
        assertEquals(406, instance.toDecimal("CDVI"));
        assertEquals(407, instance.toDecimal("CDVII"));
        assertEquals(408, instance.toDecimal("CDVIII"));
        assertEquals(409, instance.toDecimal("CDIX"));
        assertEquals(410, instance.toDecimal("CDX"));

        assertEquals(411, instance.toDecimal("CDXI"));
        assertEquals(412, instance.toDecimal("CDXII"));
        assertEquals(413, instance.toDecimal("CDXIII"));
        assertEquals(414, instance.toDecimal("CDXIV"));
        assertEquals(415, instance.toDecimal("CDXV"));
        assertEquals(416, instance.toDecimal("CDXVI"));
        assertEquals(417, instance.toDecimal("CDXVII"));
        assertEquals(418, instance.toDecimal("CDXVIII"));
        assertEquals(419, instance.toDecimal("CDXIX"));
        assertEquals(420, instance.toDecimal("CDXX"));

        assertEquals(421, instance.toDecimal("CDXXI"));
        assertEquals(422, instance.toDecimal("CDXXII"));
        assertEquals(423, instance.toDecimal("CDXXIII"));
        assertEquals(424, instance.toDecimal("CDXXIV"));
        assertEquals(425, instance.toDecimal("CDXXV"));
        assertEquals(426, instance.toDecimal("CDXXVI"));
        assertEquals(427, instance.toDecimal("CDXXVII"));
        assertEquals(428, instance.toDecimal("CDXXVIII"));
        assertEquals(429, instance.toDecimal("CDXXIX"));
        assertEquals(430, instance.toDecimal("CDXXX"));

        assertEquals(431, instance.toDecimal("CDXXXI"));
        assertEquals(432, instance.toDecimal("CDXXXII"));
        assertEquals(433, instance.toDecimal("CDXXXIII"));
        assertEquals(434, instance.toDecimal("CDXXXIV"));
        assertEquals(435, instance.toDecimal("CDXXXV"));
        assertEquals(436, instance.toDecimal("CDXXXVI"));
        assertEquals(437, instance.toDecimal("CDXXXVII"));
        assertEquals(438, instance.toDecimal("CDXXXVIII"));
        assertEquals(439, instance.toDecimal("CDXXXIX"));
        assertEquals(440, instance.toDecimal("CDXL"));

        assertEquals(441, instance.toDecimal("CDXLI"));
        assertEquals(442, instance.toDecimal("CDXLII"));
        assertEquals(443, instance.toDecimal("CDXLIII"));
        assertEquals(444, instance.toDecimal("CDXLIV"));
        assertEquals(445, instance.toDecimal("CDXLV"));
        assertEquals(446, instance.toDecimal("CDXLVI"));
        assertEquals(447, instance.toDecimal("CDXLVII"));
        assertEquals(448, instance.toDecimal("CDXLVIII"));
        assertEquals(449, instance.toDecimal("CDXLIX"));
        assertEquals(450, instance.toDecimal("CDL"));

        assertEquals(451, instance.toDecimal("CDLI"));
        assertEquals(452, instance.toDecimal("CDLII"));
        assertEquals(453, instance.toDecimal("CDLIII"));
        assertEquals(454, instance.toDecimal("CDLIV"));
        assertEquals(455, instance.toDecimal("CDLV"));
        assertEquals(456, instance.toDecimal("CDLVI"));
        assertEquals(457, instance.toDecimal("CDLVII"));
        assertEquals(458, instance.toDecimal("CDLVIII"));
        assertEquals(459, instance.toDecimal("CDLIX"));
        assertEquals(460, instance.toDecimal("CDLX"));

        assertEquals(461, instance.toDecimal("CDLXI"));
        assertEquals(462, instance.toDecimal("CDLXII"));
        assertEquals(463, instance.toDecimal("CDLXIII"));
        assertEquals(464, instance.toDecimal("CDLXIV"));
        assertEquals(465, instance.toDecimal("CDLXV"));
        assertEquals(466, instance.toDecimal("CDLXVI"));
        assertEquals(467, instance.toDecimal("CDLXVII"));
        assertEquals(468, instance.toDecimal("CDLXVIII"));
        assertEquals(469, instance.toDecimal("CDLXIX"));
        assertEquals(470, instance.toDecimal("CDLXX"));

        assertEquals(471, instance.toDecimal("CDLXXI"));
        assertEquals(472, instance.toDecimal("CDLXXII"));
        assertEquals(473, instance.toDecimal("CDLXXIII"));
        assertEquals(474, instance.toDecimal("CDLXXIV"));
        assertEquals(475, instance.toDecimal("CDLXXV"));
        assertEquals(476, instance.toDecimal("CDLXXVI"));
        assertEquals(477, instance.toDecimal("CDLXXVII"));
        assertEquals(478, instance.toDecimal("CDLXXVIII"));
        assertEquals(479, instance.toDecimal("CDLXXIX"));
        assertEquals(480, instance.toDecimal("CDLXXX"));

        assertEquals(481, instance.toDecimal("CDLXXXI"));
        assertEquals(482, instance.toDecimal("CDLXXXII"));
        assertEquals(483, instance.toDecimal("CDLXXXIII"));
        assertEquals(484, instance.toDecimal("CDLXXXIV"));
        assertEquals(485, instance.toDecimal("CDLXXXV"));
        assertEquals(486, instance.toDecimal("CDLXXXVI"));
        assertEquals(487, instance.toDecimal("CDLXXXVII"));
        assertEquals(488, instance.toDecimal("CDLXXXVIII"));
        assertEquals(489, instance.toDecimal("CDLXXXIX"));
        assertEquals(490, instance.toDecimal("CDXC"));

        assertEquals(491, instance.toDecimal("CDXCI"));
        assertEquals(492, instance.toDecimal("CDXCII"));
        assertEquals(493, instance.toDecimal("CDXCIII"));
        assertEquals(494, instance.toDecimal("CDXCIV"));
        assertEquals(495, instance.toDecimal("CDXCV"));
        assertEquals(496, instance.toDecimal("CDXCVI"));
        assertEquals(497, instance.toDecimal("CDXCVII"));
        assertEquals(498, instance.toDecimal("CDXCVIII"));
        assertEquals(499, instance.toDecimal("CDXCIX"));
        assertEquals(500, instance.toDecimal("D"));

        assertEquals(501, instance.toDecimal("DI"));
        assertEquals(502, instance.toDecimal("DII"));
        assertEquals(503, instance.toDecimal("DIII"));
        assertEquals(504, instance.toDecimal("DIV"));
        assertEquals(505, instance.toDecimal("DV"));
        assertEquals(506, instance.toDecimal("DVI"));
        assertEquals(507, instance.toDecimal("DVII"));
        assertEquals(508, instance.toDecimal("DVIII"));
        assertEquals(509, instance.toDecimal("DIX"));
        assertEquals(510, instance.toDecimal("DX"));

        assertEquals(511, instance.toDecimal("DXI"));
        assertEquals(512, instance.toDecimal("DXII"));
        assertEquals(513, instance.toDecimal("DXIII"));
        assertEquals(514, instance.toDecimal("DXIV"));
        assertEquals(515, instance.toDecimal("DXV"));
        assertEquals(516, instance.toDecimal("DXVI"));
        assertEquals(517, instance.toDecimal("DXVII"));
        assertEquals(518, instance.toDecimal("DXVIII"));
        assertEquals(519, instance.toDecimal("DXIX"));
        assertEquals(520, instance.toDecimal("DXX"));

        assertEquals(521, instance.toDecimal("DXXI"));
        assertEquals(522, instance.toDecimal("DXXII"));
        assertEquals(523, instance.toDecimal("DXXIII"));
        assertEquals(524, instance.toDecimal("DXXIV"));
        assertEquals(525, instance.toDecimal("DXXV"));
        assertEquals(526, instance.toDecimal("DXXVI"));
        assertEquals(527, instance.toDecimal("DXXVII"));
        assertEquals(528, instance.toDecimal("DXXVIII"));
        assertEquals(529, instance.toDecimal("DXXIX"));
        assertEquals(530, instance.toDecimal("DXXX"));

        assertEquals(531, instance.toDecimal("DXXXI"));
        assertEquals(532, instance.toDecimal("DXXXII"));
        assertEquals(533, instance.toDecimal("DXXXIII"));
        assertEquals(534, instance.toDecimal("DXXXIV"));
        assertEquals(535, instance.toDecimal("DXXXV"));
        assertEquals(536, instance.toDecimal("DXXXVI"));
        assertEquals(537, instance.toDecimal("DXXXVII"));
        assertEquals(538, instance.toDecimal("DXXXVIII"));
        assertEquals(539, instance.toDecimal("DXXXIX"));
        assertEquals(540, instance.toDecimal("DXL"));

        assertEquals(541, instance.toDecimal("DXLI"));
        assertEquals(542, instance.toDecimal("DXLII"));
        assertEquals(543, instance.toDecimal("DXLIII"));
        assertEquals(544, instance.toDecimal("DXLIV"));
        assertEquals(545, instance.toDecimal("DXLV"));
        assertEquals(546, instance.toDecimal("DXLVI"));
        assertEquals(547, instance.toDecimal("DXLVII"));
        assertEquals(548, instance.toDecimal("DXLVIII"));
        assertEquals(549, instance.toDecimal("DXLIX"));
        assertEquals(550, instance.toDecimal("DL"));

        assertEquals(551, instance.toDecimal("DLI"));
        assertEquals(552, instance.toDecimal("DLII"));
        assertEquals(553, instance.toDecimal("DLIII"));
        assertEquals(554, instance.toDecimal("DLIV"));
        assertEquals(555, instance.toDecimal("DLV"));
        assertEquals(556, instance.toDecimal("DLVI"));
        assertEquals(557, instance.toDecimal("DLVII"));
        assertEquals(558, instance.toDecimal("DLVIII"));
        assertEquals(559, instance.toDecimal("DLIX"));
        assertEquals(560, instance.toDecimal("DLX"));

        assertEquals(561, instance.toDecimal("DLXI"));
        assertEquals(562, instance.toDecimal("DLXII"));
        assertEquals(563, instance.toDecimal("DLXIII"));
        assertEquals(564, instance.toDecimal("DLXIV"));
        assertEquals(565, instance.toDecimal("DLXV"));
        assertEquals(566, instance.toDecimal("DLXVI"));
        assertEquals(567, instance.toDecimal("DLXVII"));
        assertEquals(568, instance.toDecimal("DLXVIII"));
        assertEquals(569, instance.toDecimal("DLXIX"));
        assertEquals(570, instance.toDecimal("DLXX"));

        assertEquals(571, instance.toDecimal("DLXXI"));
        assertEquals(572, instance.toDecimal("DLXXII"));
        assertEquals(573, instance.toDecimal("DLXXIII"));
        assertEquals(574, instance.toDecimal("DLXXIV"));
        assertEquals(575, instance.toDecimal("DLXXV"));
        assertEquals(576, instance.toDecimal("DLXXVI"));
        assertEquals(577, instance.toDecimal("DLXXVII"));
        assertEquals(578, instance.toDecimal("DLXXVIII"));
        assertEquals(579, instance.toDecimal("DLXXIX"));
        assertEquals(580, instance.toDecimal("DLXXX"));

        assertEquals(581, instance.toDecimal("DLXXXI"));
        assertEquals(582, instance.toDecimal("DLXXXII"));
        assertEquals(583, instance.toDecimal("DLXXXIII"));
        assertEquals(584, instance.toDecimal("DLXXXIV"));
        assertEquals(585, instance.toDecimal("DLXXXV"));
        assertEquals(586, instance.toDecimal("DLXXXVI"));
        assertEquals(587, instance.toDecimal("DLXXXVII"));
        assertEquals(588, instance.toDecimal("DLXXXVIII"));
        assertEquals(589, instance.toDecimal("DLXXXIX"));
        assertEquals(590, instance.toDecimal("DXC"));

        assertEquals(591, instance.toDecimal("DXCI"));
        assertEquals(592, instance.toDecimal("DXCII"));
        assertEquals(593, instance.toDecimal("DXCIII"));
        assertEquals(594, instance.toDecimal("DXCIV"));
        assertEquals(595, instance.toDecimal("DXCV"));
        assertEquals(596, instance.toDecimal("DXCVI"));
        assertEquals(597, instance.toDecimal("DXCVII"));
        assertEquals(598, instance.toDecimal("DXCVIII"));
        assertEquals(599, instance.toDecimal("DXCIX"));
        assertEquals(600, instance.toDecimal("DC"));

        assertEquals(601, instance.toDecimal("DCI"));
        assertEquals(602, instance.toDecimal("DCII"));
        assertEquals(603, instance.toDecimal("DCIII"));
        assertEquals(604, instance.toDecimal("DCIV"));
        assertEquals(605, instance.toDecimal("DCV"));
        assertEquals(606, instance.toDecimal("DCVI"));
        assertEquals(607, instance.toDecimal("DCVII"));
        assertEquals(608, instance.toDecimal("DCVIII"));
        assertEquals(609, instance.toDecimal("DCIX"));
        assertEquals(610, instance.toDecimal("DCX"));

        assertEquals(611, instance.toDecimal("DCXI"));
        assertEquals(612, instance.toDecimal("DCXII"));
        assertEquals(613, instance.toDecimal("DCXIII"));
        assertEquals(614, instance.toDecimal("DCXIV"));
        assertEquals(615, instance.toDecimal("DCXV"));
        assertEquals(616, instance.toDecimal("DCXVI"));
        assertEquals(617, instance.toDecimal("DCXVII"));
        assertEquals(618, instance.toDecimal("DCXVIII"));
        assertEquals(619, instance.toDecimal("DCXIX"));
        assertEquals(620, instance.toDecimal("DCXX"));

        assertEquals(621, instance.toDecimal("DCXXI"));
        assertEquals(622, instance.toDecimal("DCXXII"));
        assertEquals(623, instance.toDecimal("DCXXIII"));
        assertEquals(624, instance.toDecimal("DCXXIV"));
        assertEquals(625, instance.toDecimal("DCXXV"));
        assertEquals(626, instance.toDecimal("DCXXVI"));
        assertEquals(627, instance.toDecimal("DCXXVII"));
        assertEquals(628, instance.toDecimal("DCXXVIII"));
        assertEquals(629, instance.toDecimal("DCXXIX"));
        assertEquals(630, instance.toDecimal("DCXXX"));

        assertEquals(631, instance.toDecimal("DCXXXI"));
        assertEquals(632, instance.toDecimal("DCXXXII"));
        assertEquals(633, instance.toDecimal("DCXXXIII"));
        assertEquals(634, instance.toDecimal("DCXXXIV"));
        assertEquals(635, instance.toDecimal("DCXXXV"));
        assertEquals(636, instance.toDecimal("DCXXXVI"));
        assertEquals(637, instance.toDecimal("DCXXXVII"));
        assertEquals(638, instance.toDecimal("DCXXXVIII"));
        assertEquals(639, instance.toDecimal("DCXXXIX"));
        assertEquals(640, instance.toDecimal("DCXL"));

        assertEquals(641, instance.toDecimal("DCXLI"));
        assertEquals(642, instance.toDecimal("DCXLII"));
        assertEquals(643, instance.toDecimal("DCXLIII"));
        assertEquals(644, instance.toDecimal("DCXLIV"));
        assertEquals(645, instance.toDecimal("DCXLV"));
        assertEquals(646, instance.toDecimal("DCXLVI"));
        assertEquals(647, instance.toDecimal("DCXLVII"));
        assertEquals(648, instance.toDecimal("DCXLVIII"));
        assertEquals(649, instance.toDecimal("DCXLIX"));
        assertEquals(650, instance.toDecimal("DCL"));

        assertEquals(651, instance.toDecimal("DCLI"));
        assertEquals(652, instance.toDecimal("DCLII"));
        assertEquals(653, instance.toDecimal("DCLIII"));
        assertEquals(654, instance.toDecimal("DCLIV"));
        assertEquals(655, instance.toDecimal("DCLV"));
        assertEquals(656, instance.toDecimal("DCLVI"));
        assertEquals(657, instance.toDecimal("DCLVII"));
        assertEquals(658, instance.toDecimal("DCLVIII"));
        assertEquals(659, instance.toDecimal("DCLIX"));
        assertEquals(660, instance.toDecimal("DCLX"));

        assertEquals(661, instance.toDecimal("DCLXI"));
        assertEquals(662, instance.toDecimal("DCLXII"));
        assertEquals(663, instance.toDecimal("DCLXIII"));
        assertEquals(664, instance.toDecimal("DCLXIV"));
        assertEquals(665, instance.toDecimal("DCLXV"));
        assertEquals(666, instance.toDecimal("DCLXVI"));
        assertEquals(667, instance.toDecimal("DCLXVII"));
        assertEquals(668, instance.toDecimal("DCLXVIII"));
        assertEquals(669, instance.toDecimal("DCLXIX"));
        assertEquals(670, instance.toDecimal("DCLXX"));

        assertEquals(671, instance.toDecimal("DCLXXI"));
        assertEquals(672, instance.toDecimal("DCLXXII"));
        assertEquals(673, instance.toDecimal("DCLXXIII"));
        assertEquals(674, instance.toDecimal("DCLXXIV"));
        assertEquals(675, instance.toDecimal("DCLXXV"));
        assertEquals(676, instance.toDecimal("DCLXXVI"));
        assertEquals(677, instance.toDecimal("DCLXXVII"));
        assertEquals(678, instance.toDecimal("DCLXXVIII"));
        assertEquals(679, instance.toDecimal("DCLXXIX"));
        assertEquals(680, instance.toDecimal("DCLXXX"));

        assertEquals(681, instance.toDecimal("DCLXXXI"));
        assertEquals(682, instance.toDecimal("DCLXXXII"));
        assertEquals(683, instance.toDecimal("DCLXXXIII"));
        assertEquals(684, instance.toDecimal("DCLXXXIV"));
        assertEquals(685, instance.toDecimal("DCLXXXV"));
        assertEquals(686, instance.toDecimal("DCLXXXVI"));
        assertEquals(687, instance.toDecimal("DCLXXXVII"));
        assertEquals(688, instance.toDecimal("DCLXXXVIII"));
        assertEquals(689, instance.toDecimal("DCLXXXIX"));
        assertEquals(690, instance.toDecimal("DCXC"));

        assertEquals(691, instance.toDecimal("DCXCI"));
        assertEquals(692, instance.toDecimal("DCXCII"));
        assertEquals(693, instance.toDecimal("DCXCIII"));
        assertEquals(694, instance.toDecimal("DCXCIV"));
        assertEquals(695, instance.toDecimal("DCXCV"));
        assertEquals(696, instance.toDecimal("DCXCVI"));
        assertEquals(697, instance.toDecimal("DCXCVII"));
        assertEquals(698, instance.toDecimal("DCXCVIII"));
        assertEquals(699, instance.toDecimal("DCXCIX"));
        assertEquals(700, instance.toDecimal("DCC"));

        assertEquals(701, instance.toDecimal("DCCI"));
        assertEquals(702, instance.toDecimal("DCCII"));
        assertEquals(703, instance.toDecimal("DCCIII"));
        assertEquals(704, instance.toDecimal("DCCIV"));
        assertEquals(705, instance.toDecimal("DCCV"));
        assertEquals(706, instance.toDecimal("DCCVI"));
        assertEquals(707, instance.toDecimal("DCCVII"));
        assertEquals(708, instance.toDecimal("DCCVIII"));
        assertEquals(709, instance.toDecimal("DCCIX"));
        assertEquals(710, instance.toDecimal("DCCX"));

        assertEquals(711, instance.toDecimal("DCCXI"));
        assertEquals(712, instance.toDecimal("DCCXII"));
        assertEquals(713, instance.toDecimal("DCCXIII"));
        assertEquals(714, instance.toDecimal("DCCXIV"));
        assertEquals(715, instance.toDecimal("DCCXV"));
        assertEquals(716, instance.toDecimal("DCCXVI"));
        assertEquals(717, instance.toDecimal("DCCXVII"));
        assertEquals(718, instance.toDecimal("DCCXVIII"));
        assertEquals(719, instance.toDecimal("DCCXIX"));
        assertEquals(720, instance.toDecimal("DCCXX"));

        assertEquals(721, instance.toDecimal("DCCXXI"));
        assertEquals(722, instance.toDecimal("DCCXXII"));
        assertEquals(723, instance.toDecimal("DCCXXIII"));
        assertEquals(724, instance.toDecimal("DCCXXIV"));
        assertEquals(725, instance.toDecimal("DCCXXV"));
        assertEquals(726, instance.toDecimal("DCCXXVI"));
        assertEquals(727, instance.toDecimal("DCCXXVII"));
        assertEquals(728, instance.toDecimal("DCCXXVIII"));
        assertEquals(729, instance.toDecimal("DCCXXIX"));
        assertEquals(730, instance.toDecimal("DCCXXX"));

        assertEquals(731, instance.toDecimal("DCCXXXI"));
        assertEquals(732, instance.toDecimal("DCCXXXII"));
        assertEquals(733, instance.toDecimal("DCCXXXIII"));
        assertEquals(734, instance.toDecimal("DCCXXXIV"));
        assertEquals(735, instance.toDecimal("DCCXXXV"));
        assertEquals(736, instance.toDecimal("DCCXXXVI"));
        assertEquals(737, instance.toDecimal("DCCXXXVII"));
        assertEquals(738, instance.toDecimal("DCCXXXVIII"));
        assertEquals(739, instance.toDecimal("DCCXXXIX"));
        assertEquals(740, instance.toDecimal("DCCXL"));

        assertEquals(741, instance.toDecimal("DCCXLI"));
        assertEquals(742, instance.toDecimal("DCCXLII"));
        assertEquals(743, instance.toDecimal("DCCXLIII"));
        assertEquals(744, instance.toDecimal("DCCXLIV"));
        assertEquals(745, instance.toDecimal("DCCXLV"));
        assertEquals(746, instance.toDecimal("DCCXLVI"));
        assertEquals(747, instance.toDecimal("DCCXLVII"));
        assertEquals(748, instance.toDecimal("DCCXLVIII"));
        assertEquals(749, instance.toDecimal("DCCXLIX"));
        assertEquals(750, instance.toDecimal("DCCL"));

        assertEquals(751, instance.toDecimal("DCCLI"));
        assertEquals(752, instance.toDecimal("DCCLII"));
        assertEquals(753, instance.toDecimal("DCCLIII"));
        assertEquals(754, instance.toDecimal("DCCLIV"));
        assertEquals(755, instance.toDecimal("DCCLV"));
        assertEquals(756, instance.toDecimal("DCCLVI"));
        assertEquals(757, instance.toDecimal("DCCLVII"));
        assertEquals(758, instance.toDecimal("DCCLVIII"));
        assertEquals(759, instance.toDecimal("DCCLIX"));
        assertEquals(760, instance.toDecimal("DCCLX"));

        assertEquals(761, instance.toDecimal("DCCLXI"));
        assertEquals(762, instance.toDecimal("DCCLXII"));
        assertEquals(763, instance.toDecimal("DCCLXIII"));
        assertEquals(764, instance.toDecimal("DCCLXIV"));
        assertEquals(765, instance.toDecimal("DCCLXV"));
        assertEquals(766, instance.toDecimal("DCCLXVI"));
        assertEquals(767, instance.toDecimal("DCCLXVII"));
        assertEquals(768, instance.toDecimal("DCCLXVIII"));
        assertEquals(769, instance.toDecimal("DCCLXIX"));
        assertEquals(770, instance.toDecimal("DCCLXX"));

        assertEquals(771, instance.toDecimal("DCCLXXI"));
        assertEquals(772, instance.toDecimal("DCCLXXII"));
        assertEquals(773, instance.toDecimal("DCCLXXIII"));
        assertEquals(774, instance.toDecimal("DCCLXXIV"));
        assertEquals(775, instance.toDecimal("DCCLXXV"));
        assertEquals(776, instance.toDecimal("DCCLXXVI"));
        assertEquals(777, instance.toDecimal("DCCLXXVII"));
        assertEquals(778, instance.toDecimal("DCCLXXVIII"));
        assertEquals(779, instance.toDecimal("DCCLXXIX"));
        assertEquals(780, instance.toDecimal("DCCLXXX"));

        assertEquals(781, instance.toDecimal("DCCLXXXI"));
        assertEquals(782, instance.toDecimal("DCCLXXXII"));
        assertEquals(783, instance.toDecimal("DCCLXXXIII"));
        assertEquals(784, instance.toDecimal("DCCLXXXIV"));
        assertEquals(785, instance.toDecimal("DCCLXXXV"));
        assertEquals(786, instance.toDecimal("DCCLXXXVI"));
        assertEquals(787, instance.toDecimal("DCCLXXXVII"));
        assertEquals(788, instance.toDecimal("DCCLXXXVIII"));
        assertEquals(789, instance.toDecimal("DCCLXXXIX"));
        assertEquals(790, instance.toDecimal("DCCXC"));

        assertEquals(791, instance.toDecimal("DCCXCI"));
        assertEquals(792, instance.toDecimal("DCCXCII"));
        assertEquals(793, instance.toDecimal("DCCXCIII"));
        assertEquals(794, instance.toDecimal("DCCXCIV"));
        assertEquals(795, instance.toDecimal("DCCXCV"));
        assertEquals(796, instance.toDecimal("DCCXCVI"));
        assertEquals(797, instance.toDecimal("DCCXCVII"));
        assertEquals(798, instance.toDecimal("DCCXCVIII"));
        assertEquals(799, instance.toDecimal("DCCXCIX"));
        assertEquals(800, instance.toDecimal("DCCC"));

        assertEquals(801, instance.toDecimal("DCCCI"));
        assertEquals(802, instance.toDecimal("DCCCII"));
        assertEquals(803, instance.toDecimal("DCCCIII"));
        assertEquals(804, instance.toDecimal("DCCCIV"));
        assertEquals(805, instance.toDecimal("DCCCV"));
        assertEquals(806, instance.toDecimal("DCCCVI"));
        assertEquals(807, instance.toDecimal("DCCCVII"));
        assertEquals(808, instance.toDecimal("DCCCVIII"));
        assertEquals(809, instance.toDecimal("DCCCIX"));
        assertEquals(810, instance.toDecimal("DCCCX"));

        assertEquals(811, instance.toDecimal("DCCCXI"));
        assertEquals(812, instance.toDecimal("DCCCXII"));
        assertEquals(813, instance.toDecimal("DCCCXIII"));
        assertEquals(814, instance.toDecimal("DCCCXIV"));
        assertEquals(815, instance.toDecimal("DCCCXV"));
        assertEquals(816, instance.toDecimal("DCCCXVI"));
        assertEquals(817, instance.toDecimal("DCCCXVII"));
        assertEquals(818, instance.toDecimal("DCCCXVIII"));
        assertEquals(819, instance.toDecimal("DCCCXIX"));
        assertEquals(820, instance.toDecimal("DCCCXX"));

        assertEquals(821, instance.toDecimal("DCCCXXI"));
        assertEquals(822, instance.toDecimal("DCCCXXII"));
        assertEquals(823, instance.toDecimal("DCCCXXIII"));
        assertEquals(824, instance.toDecimal("DCCCXXIV"));
        assertEquals(825, instance.toDecimal("DCCCXXV"));
        assertEquals(826, instance.toDecimal("DCCCXXVI"));
        assertEquals(827, instance.toDecimal("DCCCXXVII"));
        assertEquals(828, instance.toDecimal("DCCCXXVIII"));
        assertEquals(829, instance.toDecimal("DCCCXXIX"));
        assertEquals(830, instance.toDecimal("DCCCXXX"));

        assertEquals(831, instance.toDecimal("DCCCXXXI"));
        assertEquals(832, instance.toDecimal("DCCCXXXII"));
        assertEquals(833, instance.toDecimal("DCCCXXXIII"));
        assertEquals(834, instance.toDecimal("DCCCXXXIV"));
        assertEquals(835, instance.toDecimal("DCCCXXXV"));
        assertEquals(836, instance.toDecimal("DCCCXXXVI"));
        assertEquals(837, instance.toDecimal("DCCCXXXVII"));
        assertEquals(838, instance.toDecimal("DCCCXXXVIII"));
        assertEquals(839, instance.toDecimal("DCCCXXXIX"));
        assertEquals(840, instance.toDecimal("DCCCXL"));

        assertEquals(841, instance.toDecimal("DCCCXLI"));
        assertEquals(842, instance.toDecimal("DCCCXLII"));
        assertEquals(843, instance.toDecimal("DCCCXLIII"));
        assertEquals(844, instance.toDecimal("DCCCXLIV"));
        assertEquals(845, instance.toDecimal("DCCCXLV"));
        assertEquals(846, instance.toDecimal("DCCCXLVI"));
        assertEquals(847, instance.toDecimal("DCCCXLVII"));
        assertEquals(848, instance.toDecimal("DCCCXLVIII"));
        assertEquals(849, instance.toDecimal("DCCCXLIX"));
        assertEquals(850, instance.toDecimal("DCCCL"));

        assertEquals(851, instance.toDecimal("DCCCLI"));
        assertEquals(852, instance.toDecimal("DCCCLII"));
        assertEquals(853, instance.toDecimal("DCCCLIII"));
        assertEquals(854, instance.toDecimal("DCCCLIV"));
        assertEquals(855, instance.toDecimal("DCCCLV"));
        assertEquals(856, instance.toDecimal("DCCCLVI"));
        assertEquals(857, instance.toDecimal("DCCCLVII"));
        assertEquals(858, instance.toDecimal("DCCCLVIII"));
        assertEquals(859, instance.toDecimal("DCCCLIX"));
        assertEquals(860, instance.toDecimal("DCCCLX"));

        assertEquals(861, instance.toDecimal("DCCCLXI"));
        assertEquals(862, instance.toDecimal("DCCCLXII"));
        assertEquals(863, instance.toDecimal("DCCCLXIII"));
        assertEquals(864, instance.toDecimal("DCCCLXIV"));
        assertEquals(865, instance.toDecimal("DCCCLXV"));
        assertEquals(866, instance.toDecimal("DCCCLXVI"));
        assertEquals(867, instance.toDecimal("DCCCLXVII"));
        assertEquals(868, instance.toDecimal("DCCCLXVIII"));
        assertEquals(869, instance.toDecimal("DCCCLXIX"));
        assertEquals(870, instance.toDecimal("DCCCLXX"));

        assertEquals(871, instance.toDecimal("DCCCLXXI"));
        assertEquals(872, instance.toDecimal("DCCCLXXII"));
        assertEquals(873, instance.toDecimal("DCCCLXXIII"));
        assertEquals(874, instance.toDecimal("DCCCLXXIV"));
        assertEquals(875, instance.toDecimal("DCCCLXXV"));
        assertEquals(876, instance.toDecimal("DCCCLXXVI"));
        assertEquals(877, instance.toDecimal("DCCCLXXVII"));
        assertEquals(878, instance.toDecimal("DCCCLXXVIII"));
        assertEquals(879, instance.toDecimal("DCCCLXXIX"));
        assertEquals(880, instance.toDecimal("DCCCLXXX"));

        assertEquals(881, instance.toDecimal("DCCCLXXXI"));
        assertEquals(882, instance.toDecimal("DCCCLXXXII"));
        assertEquals(883, instance.toDecimal("DCCCLXXXIII"));
        assertEquals(884, instance.toDecimal("DCCCLXXXIV"));
        assertEquals(885, instance.toDecimal("DCCCLXXXV"));
        assertEquals(886, instance.toDecimal("DCCCLXXXVI"));
        assertEquals(887, instance.toDecimal("DCCCLXXXVII"));
        assertEquals(888, instance.toDecimal("DCCCLXXXVIII"));
        assertEquals(889, instance.toDecimal("DCCCLXXXIX"));
        assertEquals(890, instance.toDecimal("DCCCXC"));

        assertEquals(891, instance.toDecimal("DCCCXCI"));
        assertEquals(892, instance.toDecimal("DCCCXCII"));
        assertEquals(893, instance.toDecimal("DCCCXCIII"));
        assertEquals(894, instance.toDecimal("DCCCXCIV"));
        assertEquals(895, instance.toDecimal("DCCCXCV"));
        assertEquals(896, instance.toDecimal("DCCCXCVI"));
        assertEquals(897, instance.toDecimal("DCCCXCVII"));
        assertEquals(898, instance.toDecimal("DCCCXCVIII"));
        assertEquals(899, instance.toDecimal("DCCCXCIX"));
        assertEquals(900, instance.toDecimal("CM"));

        assertEquals(901, instance.toDecimal("CMI"));
        assertEquals(902, instance.toDecimal("CMII"));
        assertEquals(903, instance.toDecimal("CMIII"));
        assertEquals(904, instance.toDecimal("CMIV"));
        assertEquals(905, instance.toDecimal("CMV"));
        assertEquals(906, instance.toDecimal("CMVI"));
        assertEquals(907, instance.toDecimal("CMVII"));
        assertEquals(908, instance.toDecimal("CMVIII"));
        assertEquals(909, instance.toDecimal("CMIX"));
        assertEquals(910, instance.toDecimal("CMX"));

        assertEquals(911, instance.toDecimal("CMXI"));
        assertEquals(912, instance.toDecimal("CMXII"));
        assertEquals(913, instance.toDecimal("CMXIII"));
        assertEquals(914, instance.toDecimal("CMXIV"));
        assertEquals(915, instance.toDecimal("CMXV"));
        assertEquals(916, instance.toDecimal("CMXVI"));
        assertEquals(917, instance.toDecimal("CMXVII"));
        assertEquals(918, instance.toDecimal("CMXVIII"));
        assertEquals(919, instance.toDecimal("CMXIX"));
        assertEquals(920, instance.toDecimal("CMXX"));

        assertEquals(921, instance.toDecimal("CMXXI"));
        assertEquals(922, instance.toDecimal("CMXXII"));
        assertEquals(923, instance.toDecimal("CMXXIII"));
        assertEquals(924, instance.toDecimal("CMXXIV"));
        assertEquals(925, instance.toDecimal("CMXXV"));
        assertEquals(926, instance.toDecimal("CMXXVI"));
        assertEquals(927, instance.toDecimal("CMXXVII"));
        assertEquals(928, instance.toDecimal("CMXXVIII"));
        assertEquals(929, instance.toDecimal("CMXXIX"));
        assertEquals(930, instance.toDecimal("CMXXX"));

        assertEquals(931, instance.toDecimal("CMXXXI"));
        assertEquals(932, instance.toDecimal("CMXXXII"));
        assertEquals(933, instance.toDecimal("CMXXXIII"));
        assertEquals(934, instance.toDecimal("CMXXXIV"));
        assertEquals(935, instance.toDecimal("CMXXXV"));
        assertEquals(936, instance.toDecimal("CMXXXVI"));
        assertEquals(937, instance.toDecimal("CMXXXVII"));
        assertEquals(938, instance.toDecimal("CMXXXVIII"));
        assertEquals(939, instance.toDecimal("CMXXXIX"));
        assertEquals(940, instance.toDecimal("CMXL"));

        assertEquals(941, instance.toDecimal("CMXLI"));
        assertEquals(942, instance.toDecimal("CMXLII"));
        assertEquals(943, instance.toDecimal("CMXLIII"));
        assertEquals(944, instance.toDecimal("CMXLIV"));
        assertEquals(945, instance.toDecimal("CMXLV"));
        assertEquals(946, instance.toDecimal("CMXLVI"));
        assertEquals(947, instance.toDecimal("CMXLVII"));
        assertEquals(948, instance.toDecimal("CMXLVIII"));
        assertEquals(949, instance.toDecimal("CMXLIX"));
        assertEquals(950, instance.toDecimal("CML"));

        assertEquals(951, instance.toDecimal("CMLI"));
        assertEquals(952, instance.toDecimal("CMLII"));
        assertEquals(953, instance.toDecimal("CMLIII"));
        assertEquals(954, instance.toDecimal("CMLIV"));
        assertEquals(955, instance.toDecimal("CMLV"));
        assertEquals(956, instance.toDecimal("CMLVI"));
        assertEquals(957, instance.toDecimal("CMLVII"));
        assertEquals(958, instance.toDecimal("CMLVIII"));
        assertEquals(959, instance.toDecimal("CMLIX"));
        assertEquals(960, instance.toDecimal("CMLX"));

        assertEquals(961, instance.toDecimal("CMLXI"));
        assertEquals(962, instance.toDecimal("CMLXII"));
        assertEquals(963, instance.toDecimal("CMLXIII"));
        assertEquals(964, instance.toDecimal("CMLXIV"));
        assertEquals(965, instance.toDecimal("CMLXV"));
        assertEquals(966, instance.toDecimal("CMLXVI"));
        assertEquals(967, instance.toDecimal("CMLXVII"));
        assertEquals(968, instance.toDecimal("CMLXVIII"));
        assertEquals(969, instance.toDecimal("CMLXIX"));
        assertEquals(970, instance.toDecimal("CMLXX"));

        assertEquals(971, instance.toDecimal("CMLXXI"));
        assertEquals(972, instance.toDecimal("CMLXXII"));
        assertEquals(973, instance.toDecimal("CMLXXIII"));
        assertEquals(974, instance.toDecimal("CMLXXIV"));
        assertEquals(975, instance.toDecimal("CMLXXV"));
        assertEquals(976, instance.toDecimal("CMLXXVI"));
        assertEquals(977, instance.toDecimal("CMLXXVII"));
        assertEquals(978, instance.toDecimal("CMLXXVIII"));
        assertEquals(979, instance.toDecimal("CMLXXIX"));
        assertEquals(980, instance.toDecimal("CMLXXX"));

        assertEquals(981, instance.toDecimal("CMLXXXI"));
        assertEquals(982, instance.toDecimal("CMLXXXII"));
        assertEquals(983, instance.toDecimal("CMLXXXIII"));
        assertEquals(984, instance.toDecimal("CMLXXXIV"));
        assertEquals(985, instance.toDecimal("CMLXXXV"));
        assertEquals(986, instance.toDecimal("CMLXXXVI"));
        assertEquals(987, instance.toDecimal("CMLXXXVII"));
        assertEquals(988, instance.toDecimal("CMLXXXVIII"));
        assertEquals(989, instance.toDecimal("CMLXXXIX"));
        assertEquals(990, instance.toDecimal("CMXC"));

        assertEquals(991, instance.toDecimal("CMXCI"));
        assertEquals(992, instance.toDecimal("CMXCII"));
        assertEquals(993, instance.toDecimal("CMXCIII"));
        assertEquals(994, instance.toDecimal("CMXCIV"));
        assertEquals(995, instance.toDecimal("CMXCV"));
        assertEquals(996, instance.toDecimal("CMXCVI"));
        assertEquals(997, instance.toDecimal("CMXCVII"));
        assertEquals(998, instance.toDecimal("CMXCVIII"));
        assertEquals(999, instance.toDecimal("CMXCIX"));
        assertEquals(1000, instance.toDecimal("M"));

        assertEquals(1001, instance.toDecimal("MI"));
        assertEquals(1002, instance.toDecimal("MII"));
        assertEquals(1003, instance.toDecimal("MIII"));
        assertEquals(1004, instance.toDecimal("MIV"));
        assertEquals(1005, instance.toDecimal("MV"));
        assertEquals(1006, instance.toDecimal("MVI"));
        assertEquals(1007, instance.toDecimal("MVII"));
        assertEquals(1008, instance.toDecimal("MVIII"));
        assertEquals(1009, instance.toDecimal("MIX"));
        assertEquals(1010, instance.toDecimal("MX"));

        assertEquals(1011, instance.toDecimal("MXI"));
        assertEquals(1012, instance.toDecimal("MXII"));
        assertEquals(1013, instance.toDecimal("MXIII"));
        assertEquals(1014, instance.toDecimal("MXIV"));
        assertEquals(1015, instance.toDecimal("MXV"));
        assertEquals(1016, instance.toDecimal("MXVI"));
        assertEquals(1017, instance.toDecimal("MXVII"));
        assertEquals(1018, instance.toDecimal("MXVIII"));
        assertEquals(1019, instance.toDecimal("MXIX"));
        assertEquals(1020, instance.toDecimal("MXX"));

        assertEquals(1021, instance.toDecimal("MXXI"));
        assertEquals(1022, instance.toDecimal("MXXII"));
        assertEquals(1023, instance.toDecimal("MXXIII"));
        assertEquals(1024, instance.toDecimal("MXXIV"));
        assertEquals(1025, instance.toDecimal("MXXV"));
        assertEquals(1026, instance.toDecimal("MXXVI"));
        assertEquals(1027, instance.toDecimal("MXXVII"));
        assertEquals(1028, instance.toDecimal("MXXVIII"));
        assertEquals(1029, instance.toDecimal("MXXIX"));
        assertEquals(1030, instance.toDecimal("MXXX"));

        assertEquals(1031, instance.toDecimal("MXXXI"));
        assertEquals(1032, instance.toDecimal("MXXXII"));
        assertEquals(1033, instance.toDecimal("MXXXIII"));
        assertEquals(1034, instance.toDecimal("MXXXIV"));
        assertEquals(1035, instance.toDecimal("MXXXV"));
        assertEquals(1036, instance.toDecimal("MXXXVI"));
        assertEquals(1037, instance.toDecimal("MXXXVII"));
        assertEquals(1038, instance.toDecimal("MXXXVIII"));
        assertEquals(1039, instance.toDecimal("MXXXIX"));
        assertEquals(1040, instance.toDecimal("MXL"));

        assertEquals(1041, instance.toDecimal("MXLI"));
        assertEquals(1042, instance.toDecimal("MXLII"));
        assertEquals(1043, instance.toDecimal("MXLIII"));
        assertEquals(1044, instance.toDecimal("MXLIV"));
        assertEquals(1045, instance.toDecimal("MXLV"));
        assertEquals(1046, instance.toDecimal("MXLVI"));
        assertEquals(1047, instance.toDecimal("MXLVII"));
        assertEquals(1048, instance.toDecimal("MXLVIII"));
        assertEquals(1049, instance.toDecimal("MXLIX"));
        assertEquals(1050, instance.toDecimal("ML"));

        assertEquals(1051, instance.toDecimal("MLI"));
        assertEquals(1052, instance.toDecimal("MLII"));
        assertEquals(1053, instance.toDecimal("MLIII"));
        assertEquals(1054, instance.toDecimal("MLIV"));
        assertEquals(1055, instance.toDecimal("MLV"));
        assertEquals(1056, instance.toDecimal("MLVI"));
        assertEquals(1057, instance.toDecimal("MLVII"));
        assertEquals(1058, instance.toDecimal("MLVIII"));
        assertEquals(1059, instance.toDecimal("MLIX"));
        assertEquals(1060, instance.toDecimal("MLX"));

        assertEquals(1061, instance.toDecimal("MLXI"));
        assertEquals(1062, instance.toDecimal("MLXII"));
        assertEquals(1063, instance.toDecimal("MLXIII"));
        assertEquals(1064, instance.toDecimal("MLXIV"));
        assertEquals(1065, instance.toDecimal("MLXV"));
        assertEquals(1066, instance.toDecimal("MLXVI"));
        assertEquals(1067, instance.toDecimal("MLXVII"));
        assertEquals(1068, instance.toDecimal("MLXVIII"));
        assertEquals(1069, instance.toDecimal("MLXIX"));
        assertEquals(1070, instance.toDecimal("MLXX"));

        assertEquals(1071, instance.toDecimal("MLXXI"));
        assertEquals(1072, instance.toDecimal("MLXXII"));
        assertEquals(1073, instance.toDecimal("MLXXIII"));
        assertEquals(1074, instance.toDecimal("MLXXIV"));
        assertEquals(1075, instance.toDecimal("MLXXV"));
        assertEquals(1076, instance.toDecimal("MLXXVI"));
        assertEquals(1077, instance.toDecimal("MLXXVII"));
        assertEquals(1078, instance.toDecimal("MLXXVIII"));
        assertEquals(1079, instance.toDecimal("MLXXIX"));
        assertEquals(1080, instance.toDecimal("MLXXX"));

        assertEquals(1081, instance.toDecimal("MLXXXI"));
        assertEquals(1082, instance.toDecimal("MLXXXII"));
        assertEquals(1083, instance.toDecimal("MLXXXIII"));
        assertEquals(1084, instance.toDecimal("MLXXXIV"));
        assertEquals(1085, instance.toDecimal("MLXXXV"));
        assertEquals(1086, instance.toDecimal("MLXXXVI"));
        assertEquals(1087, instance.toDecimal("MLXXXVII"));
        assertEquals(1088, instance.toDecimal("MLXXXVIII"));
        assertEquals(1089, instance.toDecimal("MLXXXIX"));
        assertEquals(1090, instance.toDecimal("MXC"));

        assertEquals(1091, instance.toDecimal("MXCI"));
        assertEquals(1092, instance.toDecimal("MXCII"));
        assertEquals(1093, instance.toDecimal("MXCIII"));
        assertEquals(1094, instance.toDecimal("MXCIV"));
        assertEquals(1095, instance.toDecimal("MXCV"));
        assertEquals(1096, instance.toDecimal("MXCVI"));
        assertEquals(1097, instance.toDecimal("MXCVII"));
        assertEquals(1098, instance.toDecimal("MXCVIII"));
        assertEquals(1099, instance.toDecimal("MXCIX"));
        assertEquals(1100, instance.toDecimal("MC"));

        assertEquals(1101, instance.toDecimal("MCI"));
        assertEquals(1102, instance.toDecimal("MCII"));
        assertEquals(1103, instance.toDecimal("MCIII"));
        assertEquals(1104, instance.toDecimal("MCIV"));
        assertEquals(1105, instance.toDecimal("MCV"));
        assertEquals(1106, instance.toDecimal("MCVI"));
        assertEquals(1107, instance.toDecimal("MCVII"));
        assertEquals(1108, instance.toDecimal("MCVIII"));
        assertEquals(1109, instance.toDecimal("MCIX"));
        assertEquals(1110, instance.toDecimal("MCX"));

        assertEquals(1111, instance.toDecimal("MCXI"));
        assertEquals(1112, instance.toDecimal("MCXII"));
        assertEquals(1113, instance.toDecimal("MCXIII"));
        assertEquals(1114, instance.toDecimal("MCXIV"));
        assertEquals(1115, instance.toDecimal("MCXV"));
        assertEquals(1116, instance.toDecimal("MCXVI"));
        assertEquals(1117, instance.toDecimal("MCXVII"));
        assertEquals(1118, instance.toDecimal("MCXVIII"));
        assertEquals(1119, instance.toDecimal("MCXIX"));
        assertEquals(1120, instance.toDecimal("MCXX"));

        assertEquals(1121, instance.toDecimal("MCXXI"));
        assertEquals(1122, instance.toDecimal("MCXXII"));
        assertEquals(1123, instance.toDecimal("MCXXIII"));
        assertEquals(1124, instance.toDecimal("MCXXIV"));
        assertEquals(1125, instance.toDecimal("MCXXV"));
        assertEquals(1126, instance.toDecimal("MCXXVI"));
        assertEquals(1127, instance.toDecimal("MCXXVII"));
        assertEquals(1128, instance.toDecimal("MCXXVIII"));
        assertEquals(1129, instance.toDecimal("MCXXIX"));
        assertEquals(1130, instance.toDecimal("MCXXX"));

        assertEquals(1131, instance.toDecimal("MCXXXI"));
        assertEquals(1132, instance.toDecimal("MCXXXII"));
        assertEquals(1133, instance.toDecimal("MCXXXIII"));
        assertEquals(1134, instance.toDecimal("MCXXXIV"));
        assertEquals(1135, instance.toDecimal("MCXXXV"));
        assertEquals(1136, instance.toDecimal("MCXXXVI"));
        assertEquals(1137, instance.toDecimal("MCXXXVII"));
        assertEquals(1138, instance.toDecimal("MCXXXVIII"));
        assertEquals(1139, instance.toDecimal("MCXXXIX"));
        assertEquals(1140, instance.toDecimal("MCXL"));

        assertEquals(1141, instance.toDecimal("MCXLI"));
        assertEquals(1142, instance.toDecimal("MCXLII"));
        assertEquals(1143, instance.toDecimal("MCXLIII"));
        assertEquals(1144, instance.toDecimal("MCXLIV"));
        assertEquals(1145, instance.toDecimal("MCXLV"));
        assertEquals(1146, instance.toDecimal("MCXLVI"));
        assertEquals(1147, instance.toDecimal("MCXLVII"));
        assertEquals(1148, instance.toDecimal("MCXLVIII"));
        assertEquals(1149, instance.toDecimal("MCXLIX"));
        assertEquals(1150, instance.toDecimal("MCL"));

        assertEquals(1151, instance.toDecimal("MCLI"));
        assertEquals(1152, instance.toDecimal("MCLII"));
        assertEquals(1153, instance.toDecimal("MCLIII"));
        assertEquals(1154, instance.toDecimal("MCLIV"));
        assertEquals(1155, instance.toDecimal("MCLV"));
        assertEquals(1156, instance.toDecimal("MCLVI"));
        assertEquals(1157, instance.toDecimal("MCLVII"));
        assertEquals(1158, instance.toDecimal("MCLVIII"));
        assertEquals(1159, instance.toDecimal("MCLIX"));
        assertEquals(1160, instance.toDecimal("MCLX"));

        assertEquals(1161, instance.toDecimal("MCLXI"));
        assertEquals(1162, instance.toDecimal("MCLXII"));
        assertEquals(1163, instance.toDecimal("MCLXIII"));
        assertEquals(1164, instance.toDecimal("MCLXIV"));
        assertEquals(1165, instance.toDecimal("MCLXV"));
        assertEquals(1166, instance.toDecimal("MCLXVI"));
        assertEquals(1167, instance.toDecimal("MCLXVII"));
        assertEquals(1168, instance.toDecimal("MCLXVIII"));
        assertEquals(1169, instance.toDecimal("MCLXIX"));
        assertEquals(1170, instance.toDecimal("MCLXX"));

        assertEquals(1171, instance.toDecimal("MCLXXI"));
        assertEquals(1172, instance.toDecimal("MCLXXII"));
        assertEquals(1173, instance.toDecimal("MCLXXIII"));
        assertEquals(1174, instance.toDecimal("MCLXXIV"));
        assertEquals(1175, instance.toDecimal("MCLXXV"));
        assertEquals(1176, instance.toDecimal("MCLXXVI"));
        assertEquals(1177, instance.toDecimal("MCLXXVII"));
        assertEquals(1178, instance.toDecimal("MCLXXVIII"));
        assertEquals(1179, instance.toDecimal("MCLXXIX"));
        assertEquals(1180, instance.toDecimal("MCLXXX"));

        assertEquals(1181, instance.toDecimal("MCLXXXI"));
        assertEquals(1182, instance.toDecimal("MCLXXXII"));
        assertEquals(1183, instance.toDecimal("MCLXXXIII"));
        assertEquals(1184, instance.toDecimal("MCLXXXIV"));
        assertEquals(1185, instance.toDecimal("MCLXXXV"));
        assertEquals(1186, instance.toDecimal("MCLXXXVI"));
        assertEquals(1187, instance.toDecimal("MCLXXXVII"));
        assertEquals(1188, instance.toDecimal("MCLXXXVIII"));
        assertEquals(1189, instance.toDecimal("MCLXXXIX"));
        assertEquals(1190, instance.toDecimal("MCXC"));

        assertEquals(1191, instance.toDecimal("MCXCI"));
        assertEquals(1192, instance.toDecimal("MCXCII"));
        assertEquals(1193, instance.toDecimal("MCXCIII"));
        assertEquals(1194, instance.toDecimal("MCXCIV"));
        assertEquals(1195, instance.toDecimal("MCXCV"));
        assertEquals(1196, instance.toDecimal("MCXCVI"));
        assertEquals(1197, instance.toDecimal("MCXCVII"));
        assertEquals(1198, instance.toDecimal("MCXCVIII"));
        assertEquals(1199, instance.toDecimal("MCXCIX"));
        assertEquals(1200, instance.toDecimal("MCC"));

        assertEquals(1201, instance.toDecimal("MCCI"));
        assertEquals(1202, instance.toDecimal("MCCII"));
        assertEquals(1203, instance.toDecimal("MCCIII"));
        assertEquals(1204, instance.toDecimal("MCCIV"));
        assertEquals(1205, instance.toDecimal("MCCV"));
        assertEquals(1206, instance.toDecimal("MCCVI"));
        assertEquals(1207, instance.toDecimal("MCCVII"));
        assertEquals(1208, instance.toDecimal("MCCVIII"));
        assertEquals(1209, instance.toDecimal("MCCIX"));
        assertEquals(1210, instance.toDecimal("MCCX"));

        assertEquals(1211, instance.toDecimal("MCCXI"));
        assertEquals(1212, instance.toDecimal("MCCXII"));
        assertEquals(1213, instance.toDecimal("MCCXIII"));
        assertEquals(1214, instance.toDecimal("MCCXIV"));
        assertEquals(1215, instance.toDecimal("MCCXV"));
        assertEquals(1216, instance.toDecimal("MCCXVI"));
        assertEquals(1217, instance.toDecimal("MCCXVII"));
        assertEquals(1218, instance.toDecimal("MCCXVIII"));
        assertEquals(1219, instance.toDecimal("MCCXIX"));
        assertEquals(1220, instance.toDecimal("MCCXX"));

        assertEquals(1221, instance.toDecimal("MCCXXI"));
        assertEquals(1222, instance.toDecimal("MCCXXII"));
        assertEquals(1223, instance.toDecimal("MCCXXIII"));
        assertEquals(1224, instance.toDecimal("MCCXXIV"));
        assertEquals(1225, instance.toDecimal("MCCXXV"));
        assertEquals(1226, instance.toDecimal("MCCXXVI"));
        assertEquals(1227, instance.toDecimal("MCCXXVII"));
        assertEquals(1228, instance.toDecimal("MCCXXVIII"));
        assertEquals(1229, instance.toDecimal("MCCXXIX"));
        assertEquals(1230, instance.toDecimal("MCCXXX"));

        assertEquals(1231, instance.toDecimal("MCCXXXI"));
        assertEquals(1232, instance.toDecimal("MCCXXXII"));
        assertEquals(1233, instance.toDecimal("MCCXXXIII"));
        assertEquals(1234, instance.toDecimal("MCCXXXIV"));
        assertEquals(1235, instance.toDecimal("MCCXXXV"));
        assertEquals(1236, instance.toDecimal("MCCXXXVI"));
        assertEquals(1237, instance.toDecimal("MCCXXXVII"));
        assertEquals(1238, instance.toDecimal("MCCXXXVIII"));
        assertEquals(1239, instance.toDecimal("MCCXXXIX"));
        assertEquals(1240, instance.toDecimal("MCCXL"));

        assertEquals(1241, instance.toDecimal("MCCXLI"));
        assertEquals(1242, instance.toDecimal("MCCXLII"));
        assertEquals(1243, instance.toDecimal("MCCXLIII"));
        assertEquals(1244, instance.toDecimal("MCCXLIV"));
        assertEquals(1245, instance.toDecimal("MCCXLV"));
        assertEquals(1246, instance.toDecimal("MCCXLVI"));
        assertEquals(1247, instance.toDecimal("MCCXLVII"));
        assertEquals(1248, instance.toDecimal("MCCXLVIII"));
        assertEquals(1249, instance.toDecimal("MCCXLIX"));
        assertEquals(1250, instance.toDecimal("MCCL"));

        assertEquals(1251, instance.toDecimal("MCCLI"));
        assertEquals(1252, instance.toDecimal("MCCLII"));
        assertEquals(1253, instance.toDecimal("MCCLIII"));
        assertEquals(1254, instance.toDecimal("MCCLIV"));
        assertEquals(1255, instance.toDecimal("MCCLV"));
        assertEquals(1256, instance.toDecimal("MCCLVI"));
        assertEquals(1257, instance.toDecimal("MCCLVII"));
        assertEquals(1258, instance.toDecimal("MCCLVIII"));
        assertEquals(1259, instance.toDecimal("MCCLIX"));
        assertEquals(1260, instance.toDecimal("MCCLX"));

        assertEquals(1261, instance.toDecimal("MCCLXI"));
        assertEquals(1262, instance.toDecimal("MCCLXII"));
        assertEquals(1263, instance.toDecimal("MCCLXIII"));
        assertEquals(1264, instance.toDecimal("MCCLXIV"));
        assertEquals(1265, instance.toDecimal("MCCLXV"));
        assertEquals(1266, instance.toDecimal("MCCLXVI"));
        assertEquals(1267, instance.toDecimal("MCCLXVII"));
        assertEquals(1268, instance.toDecimal("MCCLXVIII"));
        assertEquals(1269, instance.toDecimal("MCCLXIX"));
        assertEquals(1270, instance.toDecimal("MCCLXX"));

        assertEquals(1271, instance.toDecimal("MCCLXXI"));
        assertEquals(1272, instance.toDecimal("MCCLXXII"));
        assertEquals(1273, instance.toDecimal("MCCLXXIII"));
        assertEquals(1274, instance.toDecimal("MCCLXXIV"));
        assertEquals(1275, instance.toDecimal("MCCLXXV"));
        assertEquals(1276, instance.toDecimal("MCCLXXVI"));
        assertEquals(1277, instance.toDecimal("MCCLXXVII"));
        assertEquals(1278, instance.toDecimal("MCCLXXVIII"));
        assertEquals(1279, instance.toDecimal("MCCLXXIX"));
        assertEquals(1280, instance.toDecimal("MCCLXXX"));

        assertEquals(1281, instance.toDecimal("MCCLXXXI"));
        assertEquals(1282, instance.toDecimal("MCCLXXXII"));
        assertEquals(1283, instance.toDecimal("MCCLXXXIII"));
        assertEquals(1284, instance.toDecimal("MCCLXXXIV"));
        assertEquals(1285, instance.toDecimal("MCCLXXXV"));
        assertEquals(1286, instance.toDecimal("MCCLXXXVI"));
        assertEquals(1287, instance.toDecimal("MCCLXXXVII"));
        assertEquals(1288, instance.toDecimal("MCCLXXXVIII"));
        assertEquals(1289, instance.toDecimal("MCCLXXXIX"));
        assertEquals(1290, instance.toDecimal("MCCXC"));

        assertEquals(1291, instance.toDecimal("MCCXCI"));
        assertEquals(1292, instance.toDecimal("MCCXCII"));
        assertEquals(1293, instance.toDecimal("MCCXCIII"));
        assertEquals(1294, instance.toDecimal("MCCXCIV"));
        assertEquals(1295, instance.toDecimal("MCCXCV"));
        assertEquals(1296, instance.toDecimal("MCCXCVI"));
        assertEquals(1297, instance.toDecimal("MCCXCVII"));
        assertEquals(1298, instance.toDecimal("MCCXCVIII"));
        assertEquals(1299, instance.toDecimal("MCCXCIX"));
        assertEquals(1300, instance.toDecimal("MCCC"));

        assertEquals(1301, instance.toDecimal("MCCCI"));
        assertEquals(1302, instance.toDecimal("MCCCII"));
        assertEquals(1303, instance.toDecimal("MCCCIII"));
        assertEquals(1304, instance.toDecimal("MCCCIV"));
        assertEquals(1305, instance.toDecimal("MCCCV"));
        assertEquals(1306, instance.toDecimal("MCCCVI"));
        assertEquals(1307, instance.toDecimal("MCCCVII"));
        assertEquals(1308, instance.toDecimal("MCCCVIII"));
        assertEquals(1309, instance.toDecimal("MCCCIX"));
        assertEquals(1310, instance.toDecimal("MCCCX"));

        assertEquals(1311, instance.toDecimal("MCCCXI"));
        assertEquals(1312, instance.toDecimal("MCCCXII"));
        assertEquals(1313, instance.toDecimal("MCCCXIII"));
        assertEquals(1314, instance.toDecimal("MCCCXIV"));
        assertEquals(1315, instance.toDecimal("MCCCXV"));
        assertEquals(1316, instance.toDecimal("MCCCXVI"));
        assertEquals(1317, instance.toDecimal("MCCCXVII"));
        assertEquals(1318, instance.toDecimal("MCCCXVIII"));
        assertEquals(1319, instance.toDecimal("MCCCXIX"));
        assertEquals(1320, instance.toDecimal("MCCCXX"));

        assertEquals(1321, instance.toDecimal("MCCCXXI"));
        assertEquals(1322, instance.toDecimal("MCCCXXII"));
        assertEquals(1323, instance.toDecimal("MCCCXXIII"));
        assertEquals(1324, instance.toDecimal("MCCCXXIV"));
        assertEquals(1325, instance.toDecimal("MCCCXXV"));
        assertEquals(1326, instance.toDecimal("MCCCXXVI"));
        assertEquals(1327, instance.toDecimal("MCCCXXVII"));
        assertEquals(1328, instance.toDecimal("MCCCXXVIII"));
        assertEquals(1329, instance.toDecimal("MCCCXXIX"));
        assertEquals(1330, instance.toDecimal("MCCCXXX"));

        assertEquals(1331, instance.toDecimal("MCCCXXXI"));
        assertEquals(1332, instance.toDecimal("MCCCXXXII"));
        assertEquals(1333, instance.toDecimal("MCCCXXXIII"));
        assertEquals(1334, instance.toDecimal("MCCCXXXIV"));
        assertEquals(1335, instance.toDecimal("MCCCXXXV"));
        assertEquals(1336, instance.toDecimal("MCCCXXXVI"));
        assertEquals(1337, instance.toDecimal("MCCCXXXVII"));
        assertEquals(1338, instance.toDecimal("MCCCXXXVIII"));
        assertEquals(1339, instance.toDecimal("MCCCXXXIX"));
        assertEquals(1340, instance.toDecimal("MCCCXL"));

        assertEquals(1341, instance.toDecimal("MCCCXLI"));
        assertEquals(1342, instance.toDecimal("MCCCXLII"));
        assertEquals(1343, instance.toDecimal("MCCCXLIII"));
        assertEquals(1344, instance.toDecimal("MCCCXLIV"));
        assertEquals(1345, instance.toDecimal("MCCCXLV"));
        assertEquals(1346, instance.toDecimal("MCCCXLVI"));
        assertEquals(1347, instance.toDecimal("MCCCXLVII"));
        assertEquals(1348, instance.toDecimal("MCCCXLVIII"));
        assertEquals(1349, instance.toDecimal("MCCCXLIX"));
        assertEquals(1350, instance.toDecimal("MCCCL"));

        assertEquals(1351, instance.toDecimal("MCCCLI"));
        assertEquals(1352, instance.toDecimal("MCCCLII"));
        assertEquals(1353, instance.toDecimal("MCCCLIII"));
        assertEquals(1354, instance.toDecimal("MCCCLIV"));
        assertEquals(1355, instance.toDecimal("MCCCLV"));
        assertEquals(1356, instance.toDecimal("MCCCLVI"));
        assertEquals(1357, instance.toDecimal("MCCCLVII"));
        assertEquals(1358, instance.toDecimal("MCCCLVIII"));
        assertEquals(1359, instance.toDecimal("MCCCLIX"));
        assertEquals(1360, instance.toDecimal("MCCCLX"));

        assertEquals(1361, instance.toDecimal("MCCCLXI"));
        assertEquals(1362, instance.toDecimal("MCCCLXII"));
        assertEquals(1363, instance.toDecimal("MCCCLXIII"));
        assertEquals(1364, instance.toDecimal("MCCCLXIV"));
        assertEquals(1365, instance.toDecimal("MCCCLXV"));
        assertEquals(1366, instance.toDecimal("MCCCLXVI"));
        assertEquals(1367, instance.toDecimal("MCCCLXVII"));
        assertEquals(1368, instance.toDecimal("MCCCLXVIII"));
        assertEquals(1369, instance.toDecimal("MCCCLXIX"));
        assertEquals(1370, instance.toDecimal("MCCCLXX"));

        assertEquals(1371, instance.toDecimal("MCCCLXXI"));
        assertEquals(1372, instance.toDecimal("MCCCLXXII"));
        assertEquals(1373, instance.toDecimal("MCCCLXXIII"));
        assertEquals(1374, instance.toDecimal("MCCCLXXIV"));
        assertEquals(1375, instance.toDecimal("MCCCLXXV"));
        assertEquals(1376, instance.toDecimal("MCCCLXXVI"));
        assertEquals(1377, instance.toDecimal("MCCCLXXVII"));
        assertEquals(1378, instance.toDecimal("MCCCLXXVIII"));
        assertEquals(1379, instance.toDecimal("MCCCLXXIX"));
        assertEquals(1380, instance.toDecimal("MCCCLXXX"));

        assertEquals(1381, instance.toDecimal("MCCCLXXXI"));
        assertEquals(1382, instance.toDecimal("MCCCLXXXII"));
        assertEquals(1383, instance.toDecimal("MCCCLXXXIII"));
        assertEquals(1384, instance.toDecimal("MCCCLXXXIV"));
        assertEquals(1385, instance.toDecimal("MCCCLXXXV"));
        assertEquals(1386, instance.toDecimal("MCCCLXXXVI"));
        assertEquals(1387, instance.toDecimal("MCCCLXXXVII"));
        assertEquals(1388, instance.toDecimal("MCCCLXXXVIII"));
        assertEquals(1389, instance.toDecimal("MCCCLXXXIX"));
        assertEquals(1390, instance.toDecimal("MCCCXC"));

        assertEquals(1391, instance.toDecimal("MCCCXCI"));
        assertEquals(1392, instance.toDecimal("MCCCXCII"));
        assertEquals(1393, instance.toDecimal("MCCCXCIII"));
        assertEquals(1394, instance.toDecimal("MCCCXCIV"));
        assertEquals(1395, instance.toDecimal("MCCCXCV"));
        assertEquals(1396, instance.toDecimal("MCCCXCVI"));
        assertEquals(1397, instance.toDecimal("MCCCXCVII"));
        assertEquals(1398, instance.toDecimal("MCCCXCVIII"));
        assertEquals(1399, instance.toDecimal("MCCCXCIX"));
        assertEquals(1400, instance.toDecimal("MCD"));

        assertEquals(1401, instance.toDecimal("MCDI"));
        assertEquals(1402, instance.toDecimal("MCDII"));
        assertEquals(1403, instance.toDecimal("MCDIII"));
        assertEquals(1404, instance.toDecimal("MCDIV"));
        assertEquals(1405, instance.toDecimal("MCDV"));
        assertEquals(1406, instance.toDecimal("MCDVI"));
        assertEquals(1407, instance.toDecimal("MCDVII"));
        assertEquals(1408, instance.toDecimal("MCDVIII"));
        assertEquals(1409, instance.toDecimal("MCDIX"));
        assertEquals(1410, instance.toDecimal("MCDX"));

        assertEquals(1411, instance.toDecimal("MCDXI"));
        assertEquals(1412, instance.toDecimal("MCDXII"));
        assertEquals(1413, instance.toDecimal("MCDXIII"));
        assertEquals(1414, instance.toDecimal("MCDXIV"));
        assertEquals(1415, instance.toDecimal("MCDXV"));
        assertEquals(1416, instance.toDecimal("MCDXVI"));
        assertEquals(1417, instance.toDecimal("MCDXVII"));
        assertEquals(1418, instance.toDecimal("MCDXVIII"));
        assertEquals(1419, instance.toDecimal("MCDXIX"));
        assertEquals(1420, instance.toDecimal("MCDXX"));

        assertEquals(1421, instance.toDecimal("MCDXXI"));
        assertEquals(1422, instance.toDecimal("MCDXXII"));
        assertEquals(1423, instance.toDecimal("MCDXXIII"));
        assertEquals(1424, instance.toDecimal("MCDXXIV"));
        assertEquals(1425, instance.toDecimal("MCDXXV"));
        assertEquals(1426, instance.toDecimal("MCDXXVI"));
        assertEquals(1427, instance.toDecimal("MCDXXVII"));
        assertEquals(1428, instance.toDecimal("MCDXXVIII"));
        assertEquals(1429, instance.toDecimal("MCDXXIX"));
        assertEquals(1430, instance.toDecimal("MCDXXX"));

        assertEquals(1431, instance.toDecimal("MCDXXXI"));
        assertEquals(1432, instance.toDecimal("MCDXXXII"));
        assertEquals(1433, instance.toDecimal("MCDXXXIII"));
        assertEquals(1434, instance.toDecimal("MCDXXXIV"));
        assertEquals(1435, instance.toDecimal("MCDXXXV"));
        assertEquals(1436, instance.toDecimal("MCDXXXVI"));
        assertEquals(1437, instance.toDecimal("MCDXXXVII"));
        assertEquals(1438, instance.toDecimal("MCDXXXVIII"));
        assertEquals(1439, instance.toDecimal("MCDXXXIX"));
        assertEquals(1440, instance.toDecimal("MCDXL"));

        assertEquals(1441, instance.toDecimal("MCDXLI"));
        assertEquals(1442, instance.toDecimal("MCDXLII"));
        assertEquals(1443, instance.toDecimal("MCDXLIII"));
        assertEquals(1444, instance.toDecimal("MCDXLIV"));
        assertEquals(1445, instance.toDecimal("MCDXLV"));
        assertEquals(1446, instance.toDecimal("MCDXLVI"));
        assertEquals(1447, instance.toDecimal("MCDXLVII"));
        assertEquals(1448, instance.toDecimal("MCDXLVIII"));
        assertEquals(1449, instance.toDecimal("MCDXLIX"));
        assertEquals(1450, instance.toDecimal("MCDL"));

        assertEquals(1451, instance.toDecimal("MCDLI"));
        assertEquals(1452, instance.toDecimal("MCDLII"));
        assertEquals(1453, instance.toDecimal("MCDLIII"));
        assertEquals(1454, instance.toDecimal("MCDLIV"));
        assertEquals(1455, instance.toDecimal("MCDLV"));
        assertEquals(1456, instance.toDecimal("MCDLVI"));
        assertEquals(1457, instance.toDecimal("MCDLVII"));
        assertEquals(1458, instance.toDecimal("MCDLVIII"));
        assertEquals(1459, instance.toDecimal("MCDLIX"));
        assertEquals(1460, instance.toDecimal("MCDLX"));

        assertEquals(1461, instance.toDecimal("MCDLXI"));
        assertEquals(1462, instance.toDecimal("MCDLXII"));
        assertEquals(1463, instance.toDecimal("MCDLXIII"));
        assertEquals(1464, instance.toDecimal("MCDLXIV"));
        assertEquals(1465, instance.toDecimal("MCDLXV"));
        assertEquals(1466, instance.toDecimal("MCDLXVI"));
        assertEquals(1467, instance.toDecimal("MCDLXVII"));
        assertEquals(1468, instance.toDecimal("MCDLXVIII"));
        assertEquals(1469, instance.toDecimal("MCDLXIX"));
        assertEquals(1470, instance.toDecimal("MCDLXX"));

        assertEquals(1471, instance.toDecimal("MCDLXXI"));
        assertEquals(1472, instance.toDecimal("MCDLXXII"));
        assertEquals(1473, instance.toDecimal("MCDLXXIII"));
        assertEquals(1474, instance.toDecimal("MCDLXXIV"));
        assertEquals(1475, instance.toDecimal("MCDLXXV"));
        assertEquals(1476, instance.toDecimal("MCDLXXVI"));
        assertEquals(1477, instance.toDecimal("MCDLXXVII"));
        assertEquals(1478, instance.toDecimal("MCDLXXVIII"));
        assertEquals(1479, instance.toDecimal("MCDLXXIX"));
        assertEquals(1480, instance.toDecimal("MCDLXXX"));

        assertEquals(1481, instance.toDecimal("MCDLXXXI"));
        assertEquals(1482, instance.toDecimal("MCDLXXXII"));
        assertEquals(1483, instance.toDecimal("MCDLXXXIII"));
        assertEquals(1484, instance.toDecimal("MCDLXXXIV"));
        assertEquals(1485, instance.toDecimal("MCDLXXXV"));
        assertEquals(1486, instance.toDecimal("MCDLXXXVI"));
        assertEquals(1487, instance.toDecimal("MCDLXXXVII"));
        assertEquals(1488, instance.toDecimal("MCDLXXXVIII"));
        assertEquals(1489, instance.toDecimal("MCDLXXXIX"));
        assertEquals(1490, instance.toDecimal("MCDXC"));

        assertEquals(1491, instance.toDecimal("MCDXCI"));
        assertEquals(1492, instance.toDecimal("MCDXCII"));
        assertEquals(1493, instance.toDecimal("MCDXCIII"));
        assertEquals(1494, instance.toDecimal("MCDXCIV"));
        assertEquals(1495, instance.toDecimal("MCDXCV"));
        assertEquals(1496, instance.toDecimal("MCDXCVI"));
        assertEquals(1497, instance.toDecimal("MCDXCVII"));
        assertEquals(1498, instance.toDecimal("MCDXCVIII"));
        assertEquals(1499, instance.toDecimal("MCDXCIX"));
        assertEquals(1500, instance.toDecimal("MD"));

        assertEquals(1501, instance.toDecimal("MDI"));
        assertEquals(1502, instance.toDecimal("MDII"));
        assertEquals(1503, instance.toDecimal("MDIII"));
        assertEquals(1504, instance.toDecimal("MDIV"));
        assertEquals(1505, instance.toDecimal("MDV"));
        assertEquals(1506, instance.toDecimal("MDVI"));
        assertEquals(1507, instance.toDecimal("MDVII"));
        assertEquals(1508, instance.toDecimal("MDVIII"));
        assertEquals(1509, instance.toDecimal("MDIX"));
        assertEquals(1510, instance.toDecimal("MDX"));

        assertEquals(1511, instance.toDecimal("MDXI"));
        assertEquals(1512, instance.toDecimal("MDXII"));
        assertEquals(1513, instance.toDecimal("MDXIII"));
        assertEquals(1514, instance.toDecimal("MDXIV"));
        assertEquals(1515, instance.toDecimal("MDXV"));
        assertEquals(1516, instance.toDecimal("MDXVI"));
        assertEquals(1517, instance.toDecimal("MDXVII"));
        assertEquals(1518, instance.toDecimal("MDXVIII"));
        assertEquals(1519, instance.toDecimal("MDXIX"));
        assertEquals(1520, instance.toDecimal("MDXX"));

        assertEquals(1521, instance.toDecimal("MDXXI"));
        assertEquals(1522, instance.toDecimal("MDXXII"));
        assertEquals(1523, instance.toDecimal("MDXXIII"));
        assertEquals(1524, instance.toDecimal("MDXXIV"));
        assertEquals(1525, instance.toDecimal("MDXXV"));
        assertEquals(1526, instance.toDecimal("MDXXVI"));
        assertEquals(1527, instance.toDecimal("MDXXVII"));
        assertEquals(1528, instance.toDecimal("MDXXVIII"));
        assertEquals(1529, instance.toDecimal("MDXXIX"));
        assertEquals(1530, instance.toDecimal("MDXXX"));

        assertEquals(1531, instance.toDecimal("MDXXXI"));
        assertEquals(1532, instance.toDecimal("MDXXXII"));
        assertEquals(1533, instance.toDecimal("MDXXXIII"));
        assertEquals(1534, instance.toDecimal("MDXXXIV"));
        assertEquals(1535, instance.toDecimal("MDXXXV"));
        assertEquals(1536, instance.toDecimal("MDXXXVI"));
        assertEquals(1537, instance.toDecimal("MDXXXVII"));
        assertEquals(1538, instance.toDecimal("MDXXXVIII"));
        assertEquals(1539, instance.toDecimal("MDXXXIX"));
        assertEquals(1540, instance.toDecimal("MDXL"));

        assertEquals(1541, instance.toDecimal("MDXLI"));
        assertEquals(1542, instance.toDecimal("MDXLII"));
        assertEquals(1543, instance.toDecimal("MDXLIII"));
        assertEquals(1544, instance.toDecimal("MDXLIV"));
        assertEquals(1545, instance.toDecimal("MDXLV"));
        assertEquals(1546, instance.toDecimal("MDXLVI"));
        assertEquals(1547, instance.toDecimal("MDXLVII"));
        assertEquals(1548, instance.toDecimal("MDXLVIII"));
        assertEquals(1549, instance.toDecimal("MDXLIX"));
        assertEquals(1550, instance.toDecimal("MDL"));

        assertEquals(1551, instance.toDecimal("MDLI"));
        assertEquals(1552, instance.toDecimal("MDLII"));
        assertEquals(1553, instance.toDecimal("MDLIII"));
        assertEquals(1554, instance.toDecimal("MDLIV"));
        assertEquals(1555, instance.toDecimal("MDLV"));
        assertEquals(1556, instance.toDecimal("MDLVI"));
        assertEquals(1557, instance.toDecimal("MDLVII"));
        assertEquals(1558, instance.toDecimal("MDLVIII"));
        assertEquals(1559, instance.toDecimal("MDLIX"));
        assertEquals(1560, instance.toDecimal("MDLX"));

        assertEquals(1561, instance.toDecimal("MDLXI"));
        assertEquals(1562, instance.toDecimal("MDLXII"));
        assertEquals(1563, instance.toDecimal("MDLXIII"));
        assertEquals(1564, instance.toDecimal("MDLXIV"));
        assertEquals(1565, instance.toDecimal("MDLXV"));
        assertEquals(1566, instance.toDecimal("MDLXVI"));
        assertEquals(1567, instance.toDecimal("MDLXVII"));
        assertEquals(1568, instance.toDecimal("MDLXVIII"));
        assertEquals(1569, instance.toDecimal("MDLXIX"));
        assertEquals(1570, instance.toDecimal("MDLXX"));

        assertEquals(1571, instance.toDecimal("MDLXXI"));
        assertEquals(1572, instance.toDecimal("MDLXXII"));
        assertEquals(1573, instance.toDecimal("MDLXXIII"));
        assertEquals(1574, instance.toDecimal("MDLXXIV"));
        assertEquals(1575, instance.toDecimal("MDLXXV"));
        assertEquals(1576, instance.toDecimal("MDLXXVI"));
        assertEquals(1577, instance.toDecimal("MDLXXVII"));
        assertEquals(1578, instance.toDecimal("MDLXXVIII"));
        assertEquals(1579, instance.toDecimal("MDLXXIX"));
        assertEquals(1580, instance.toDecimal("MDLXXX"));

        assertEquals(1581, instance.toDecimal("MDLXXXI"));
        assertEquals(1582, instance.toDecimal("MDLXXXII"));
        assertEquals(1583, instance.toDecimal("MDLXXXIII"));
        assertEquals(1584, instance.toDecimal("MDLXXXIV"));
        assertEquals(1585, instance.toDecimal("MDLXXXV"));
        assertEquals(1586, instance.toDecimal("MDLXXXVI"));
        assertEquals(1587, instance.toDecimal("MDLXXXVII"));
        assertEquals(1588, instance.toDecimal("MDLXXXVIII"));
        assertEquals(1589, instance.toDecimal("MDLXXXIX"));
        assertEquals(1590, instance.toDecimal("MDXC"));

        assertEquals(1591, instance.toDecimal("MDXCI"));
        assertEquals(1592, instance.toDecimal("MDXCII"));
        assertEquals(1593, instance.toDecimal("MDXCIII"));
        assertEquals(1594, instance.toDecimal("MDXCIV"));
        assertEquals(1595, instance.toDecimal("MDXCV"));
        assertEquals(1596, instance.toDecimal("MDXCVI"));
        assertEquals(1597, instance.toDecimal("MDXCVII"));
        assertEquals(1598, instance.toDecimal("MDXCVIII"));
        assertEquals(1599, instance.toDecimal("MDXCIX"));
        assertEquals(1600, instance.toDecimal("MDC"));

        assertEquals(1601, instance.toDecimal("MDCI"));
        assertEquals(1602, instance.toDecimal("MDCII"));
        assertEquals(1603, instance.toDecimal("MDCIII"));
        assertEquals(1604, instance.toDecimal("MDCIV"));
        assertEquals(1605, instance.toDecimal("MDCV"));
        assertEquals(1606, instance.toDecimal("MDCVI"));
        assertEquals(1607, instance.toDecimal("MDCVII"));
        assertEquals(1608, instance.toDecimal("MDCVIII"));
        assertEquals(1609, instance.toDecimal("MDCIX"));
        assertEquals(1610, instance.toDecimal("MDCX"));

        assertEquals(1611, instance.toDecimal("MDCXI"));
        assertEquals(1612, instance.toDecimal("MDCXII"));
        assertEquals(1613, instance.toDecimal("MDCXIII"));
        assertEquals(1614, instance.toDecimal("MDCXIV"));
        assertEquals(1615, instance.toDecimal("MDCXV"));
        assertEquals(1616, instance.toDecimal("MDCXVI"));
        assertEquals(1617, instance.toDecimal("MDCXVII"));
        assertEquals(1618, instance.toDecimal("MDCXVIII"));
        assertEquals(1619, instance.toDecimal("MDCXIX"));
        assertEquals(1620, instance.toDecimal("MDCXX"));

        assertEquals(1621, instance.toDecimal("MDCXXI"));
        assertEquals(1622, instance.toDecimal("MDCXXII"));
        assertEquals(1623, instance.toDecimal("MDCXXIII"));
        assertEquals(1624, instance.toDecimal("MDCXXIV"));
        assertEquals(1625, instance.toDecimal("MDCXXV"));
        assertEquals(1626, instance.toDecimal("MDCXXVI"));
        assertEquals(1627, instance.toDecimal("MDCXXVII"));
        assertEquals(1628, instance.toDecimal("MDCXXVIII"));
        assertEquals(1629, instance.toDecimal("MDCXXIX"));
        assertEquals(1630, instance.toDecimal("MDCXXX"));

        assertEquals(1631, instance.toDecimal("MDCXXXI"));
        assertEquals(1632, instance.toDecimal("MDCXXXII"));
        assertEquals(1633, instance.toDecimal("MDCXXXIII"));
        assertEquals(1634, instance.toDecimal("MDCXXXIV"));
        assertEquals(1635, instance.toDecimal("MDCXXXV"));
        assertEquals(1636, instance.toDecimal("MDCXXXVI"));
        assertEquals(1637, instance.toDecimal("MDCXXXVII"));
        assertEquals(1638, instance.toDecimal("MDCXXXVIII"));
        assertEquals(1639, instance.toDecimal("MDCXXXIX"));
        assertEquals(1640, instance.toDecimal("MDCXL"));

        assertEquals(1641, instance.toDecimal("MDCXLI"));
        assertEquals(1642, instance.toDecimal("MDCXLII"));
        assertEquals(1643, instance.toDecimal("MDCXLIII"));
        assertEquals(1644, instance.toDecimal("MDCXLIV"));
        assertEquals(1645, instance.toDecimal("MDCXLV"));
        assertEquals(1646, instance.toDecimal("MDCXLVI"));
        assertEquals(1647, instance.toDecimal("MDCXLVII"));
        assertEquals(1648, instance.toDecimal("MDCXLVIII"));
        assertEquals(1649, instance.toDecimal("MDCXLIX"));
        assertEquals(1650, instance.toDecimal("MDCL"));

        assertEquals(1651, instance.toDecimal("MDCLI"));
        assertEquals(1652, instance.toDecimal("MDCLII"));
        assertEquals(1653, instance.toDecimal("MDCLIII"));
        assertEquals(1654, instance.toDecimal("MDCLIV"));
        assertEquals(1655, instance.toDecimal("MDCLV"));
        assertEquals(1656, instance.toDecimal("MDCLVI"));
        assertEquals(1657, instance.toDecimal("MDCLVII"));
        assertEquals(1658, instance.toDecimal("MDCLVIII"));
        assertEquals(1659, instance.toDecimal("MDCLIX"));
        assertEquals(1660, instance.toDecimal("MDCLX"));

        assertEquals(1661, instance.toDecimal("MDCLXI"));
        assertEquals(1662, instance.toDecimal("MDCLXII"));
        assertEquals(1663, instance.toDecimal("MDCLXIII"));
        assertEquals(1664, instance.toDecimal("MDCLXIV"));
        assertEquals(1665, instance.toDecimal("MDCLXV"));
        assertEquals(1666, instance.toDecimal("MDCLXVI"));
        assertEquals(1667, instance.toDecimal("MDCLXVII"));
        assertEquals(1668, instance.toDecimal("MDCLXVIII"));
        assertEquals(1669, instance.toDecimal("MDCLXIX"));
        assertEquals(1670, instance.toDecimal("MDCLXX"));

        assertEquals(1671, instance.toDecimal("MDCLXXI"));
        assertEquals(1672, instance.toDecimal("MDCLXXII"));
        assertEquals(1673, instance.toDecimal("MDCLXXIII"));
        assertEquals(1674, instance.toDecimal("MDCLXXIV"));
        assertEquals(1675, instance.toDecimal("MDCLXXV"));
        assertEquals(1676, instance.toDecimal("MDCLXXVI"));
        assertEquals(1677, instance.toDecimal("MDCLXXVII"));
        assertEquals(1678, instance.toDecimal("MDCLXXVIII"));
        assertEquals(1679, instance.toDecimal("MDCLXXIX"));
        assertEquals(1680, instance.toDecimal("MDCLXXX"));

        assertEquals(1681, instance.toDecimal("MDCLXXXI"));
        assertEquals(1682, instance.toDecimal("MDCLXXXII"));
        assertEquals(1683, instance.toDecimal("MDCLXXXIII"));
        assertEquals(1684, instance.toDecimal("MDCLXXXIV"));
        assertEquals(1685, instance.toDecimal("MDCLXXXV"));
        assertEquals(1686, instance.toDecimal("MDCLXXXVI"));
        assertEquals(1687, instance.toDecimal("MDCLXXXVII"));
        assertEquals(1688, instance.toDecimal("MDCLXXXVIII"));
        assertEquals(1689, instance.toDecimal("MDCLXXXIX"));
        assertEquals(1690, instance.toDecimal("MDCXC"));

        assertEquals(1691, instance.toDecimal("MDCXCI"));
        assertEquals(1692, instance.toDecimal("MDCXCII"));
        assertEquals(1693, instance.toDecimal("MDCXCIII"));
        assertEquals(1694, instance.toDecimal("MDCXCIV"));
        assertEquals(1695, instance.toDecimal("MDCXCV"));
        assertEquals(1696, instance.toDecimal("MDCXCVI"));
        assertEquals(1697, instance.toDecimal("MDCXCVII"));
        assertEquals(1698, instance.toDecimal("MDCXCVIII"));
        assertEquals(1699, instance.toDecimal("MDCXCIX"));
        assertEquals(1700, instance.toDecimal("MDCC"));

        assertEquals(1701, instance.toDecimal("MDCCI"));
        assertEquals(1702, instance.toDecimal("MDCCII"));
        assertEquals(1703, instance.toDecimal("MDCCIII"));
        assertEquals(1704, instance.toDecimal("MDCCIV"));
        assertEquals(1705, instance.toDecimal("MDCCV"));
        assertEquals(1706, instance.toDecimal("MDCCVI"));
        assertEquals(1707, instance.toDecimal("MDCCVII"));
        assertEquals(1708, instance.toDecimal("MDCCVIII"));
        assertEquals(1709, instance.toDecimal("MDCCIX"));
        assertEquals(1710, instance.toDecimal("MDCCX"));

        assertEquals(1711, instance.toDecimal("MDCCXI"));
        assertEquals(1712, instance.toDecimal("MDCCXII"));
        assertEquals(1713, instance.toDecimal("MDCCXIII"));
        assertEquals(1714, instance.toDecimal("MDCCXIV"));
        assertEquals(1715, instance.toDecimal("MDCCXV"));
        assertEquals(1716, instance.toDecimal("MDCCXVI"));
        assertEquals(1717, instance.toDecimal("MDCCXVII"));
        assertEquals(1718, instance.toDecimal("MDCCXVIII"));
        assertEquals(1719, instance.toDecimal("MDCCXIX"));
        assertEquals(1720, instance.toDecimal("MDCCXX"));

        assertEquals(1721, instance.toDecimal("MDCCXXI"));
        assertEquals(1722, instance.toDecimal("MDCCXXII"));
        assertEquals(1723, instance.toDecimal("MDCCXXIII"));
        assertEquals(1724, instance.toDecimal("MDCCXXIV"));
        assertEquals(1725, instance.toDecimal("MDCCXXV"));
        assertEquals(1726, instance.toDecimal("MDCCXXVI"));
        assertEquals(1727, instance.toDecimal("MDCCXXVII"));
        assertEquals(1728, instance.toDecimal("MDCCXXVIII"));
        assertEquals(1729, instance.toDecimal("MDCCXXIX"));
        assertEquals(1730, instance.toDecimal("MDCCXXX"));

        assertEquals(1731, instance.toDecimal("MDCCXXXI"));
        assertEquals(1732, instance.toDecimal("MDCCXXXII"));
        assertEquals(1733, instance.toDecimal("MDCCXXXIII"));
        assertEquals(1734, instance.toDecimal("MDCCXXXIV"));
        assertEquals(1735, instance.toDecimal("MDCCXXXV"));
        assertEquals(1736, instance.toDecimal("MDCCXXXVI"));
        assertEquals(1737, instance.toDecimal("MDCCXXXVII"));
        assertEquals(1738, instance.toDecimal("MDCCXXXVIII"));
        assertEquals(1739, instance.toDecimal("MDCCXXXIX"));
        assertEquals(1740, instance.toDecimal("MDCCXL"));

        assertEquals(1741, instance.toDecimal("MDCCXLI"));
        assertEquals(1742, instance.toDecimal("MDCCXLII"));
        assertEquals(1743, instance.toDecimal("MDCCXLIII"));
        assertEquals(1744, instance.toDecimal("MDCCXLIV"));
        assertEquals(1745, instance.toDecimal("MDCCXLV"));
        assertEquals(1746, instance.toDecimal("MDCCXLVI"));
        assertEquals(1747, instance.toDecimal("MDCCXLVII"));
        assertEquals(1748, instance.toDecimal("MDCCXLVIII"));
        assertEquals(1749, instance.toDecimal("MDCCXLIX"));
        assertEquals(1750, instance.toDecimal("MDCCL"));

        assertEquals(1751, instance.toDecimal("MDCCLI"));
        assertEquals(1752, instance.toDecimal("MDCCLII"));
        assertEquals(1753, instance.toDecimal("MDCCLIII"));
        assertEquals(1754, instance.toDecimal("MDCCLIV"));
        assertEquals(1755, instance.toDecimal("MDCCLV"));
        assertEquals(1756, instance.toDecimal("MDCCLVI"));
        assertEquals(1757, instance.toDecimal("MDCCLVII"));
        assertEquals(1758, instance.toDecimal("MDCCLVIII"));
        assertEquals(1759, instance.toDecimal("MDCCLIX"));
        assertEquals(1760, instance.toDecimal("MDCCLX"));

        assertEquals(1761, instance.toDecimal("MDCCLXI"));
        assertEquals(1762, instance.toDecimal("MDCCLXII"));
        assertEquals(1763, instance.toDecimal("MDCCLXIII"));
        assertEquals(1764, instance.toDecimal("MDCCLXIV"));
        assertEquals(1765, instance.toDecimal("MDCCLXV"));
        assertEquals(1766, instance.toDecimal("MDCCLXVI"));
        assertEquals(1767, instance.toDecimal("MDCCLXVII"));
        assertEquals(1768, instance.toDecimal("MDCCLXVIII"));
        assertEquals(1769, instance.toDecimal("MDCCLXIX"));
        assertEquals(1770, instance.toDecimal("MDCCLXX"));

        assertEquals(1771, instance.toDecimal("MDCCLXXI"));
        assertEquals(1772, instance.toDecimal("MDCCLXXII"));
        assertEquals(1773, instance.toDecimal("MDCCLXXIII"));
        assertEquals(1774, instance.toDecimal("MDCCLXXIV"));
        assertEquals(1775, instance.toDecimal("MDCCLXXV"));
        assertEquals(1776, instance.toDecimal("MDCCLXXVI"));
        assertEquals(1777, instance.toDecimal("MDCCLXXVII"));
        assertEquals(1778, instance.toDecimal("MDCCLXXVIII"));
        assertEquals(1779, instance.toDecimal("MDCCLXXIX"));
        assertEquals(1780, instance.toDecimal("MDCCLXXX"));

        assertEquals(1781, instance.toDecimal("MDCCLXXXI"));
        assertEquals(1782, instance.toDecimal("MDCCLXXXII"));
        assertEquals(1783, instance.toDecimal("MDCCLXXXIII"));
        assertEquals(1784, instance.toDecimal("MDCCLXXXIV"));
        assertEquals(1785, instance.toDecimal("MDCCLXXXV"));
        assertEquals(1786, instance.toDecimal("MDCCLXXXVI"));
        assertEquals(1787, instance.toDecimal("MDCCLXXXVII"));
        assertEquals(1788, instance.toDecimal("MDCCLXXXVIII"));
        assertEquals(1789, instance.toDecimal("MDCCLXXXIX"));
        assertEquals(1790, instance.toDecimal("MDCCXC"));

        assertEquals(1791, instance.toDecimal("MDCCXCI"));
        assertEquals(1792, instance.toDecimal("MDCCXCII"));
        assertEquals(1793, instance.toDecimal("MDCCXCIII"));
        assertEquals(1794, instance.toDecimal("MDCCXCIV"));
        assertEquals(1795, instance.toDecimal("MDCCXCV"));
        assertEquals(1796, instance.toDecimal("MDCCXCVI"));
        assertEquals(1797, instance.toDecimal("MDCCXCVII"));
        assertEquals(1798, instance.toDecimal("MDCCXCVIII"));
        assertEquals(1799, instance.toDecimal("MDCCXCIX"));
        assertEquals(1800, instance.toDecimal("MDCCC"));

        assertEquals(1801, instance.toDecimal("MDCCCI"));
        assertEquals(1802, instance.toDecimal("MDCCCII"));
        assertEquals(1803, instance.toDecimal("MDCCCIII"));
        assertEquals(1804, instance.toDecimal("MDCCCIV"));
        assertEquals(1805, instance.toDecimal("MDCCCV"));
        assertEquals(1806, instance.toDecimal("MDCCCVI"));
        assertEquals(1807, instance.toDecimal("MDCCCVII"));
        assertEquals(1808, instance.toDecimal("MDCCCVIII"));
        assertEquals(1809, instance.toDecimal("MDCCCIX"));
        assertEquals(1810, instance.toDecimal("MDCCCX"));

        assertEquals(1811, instance.toDecimal("MDCCCXI"));
        assertEquals(1812, instance.toDecimal("MDCCCXII"));
        assertEquals(1813, instance.toDecimal("MDCCCXIII"));
        assertEquals(1814, instance.toDecimal("MDCCCXIV"));
        assertEquals(1815, instance.toDecimal("MDCCCXV"));
        assertEquals(1816, instance.toDecimal("MDCCCXVI"));
        assertEquals(1817, instance.toDecimal("MDCCCXVII"));
        assertEquals(1818, instance.toDecimal("MDCCCXVIII"));
        assertEquals(1819, instance.toDecimal("MDCCCXIX"));
        assertEquals(1820, instance.toDecimal("MDCCCXX"));

        assertEquals(1821, instance.toDecimal("MDCCCXXI"));
        assertEquals(1822, instance.toDecimal("MDCCCXXII"));
        assertEquals(1823, instance.toDecimal("MDCCCXXIII"));
        assertEquals(1824, instance.toDecimal("MDCCCXXIV"));
        assertEquals(1825, instance.toDecimal("MDCCCXXV"));
        assertEquals(1826, instance.toDecimal("MDCCCXXVI"));
        assertEquals(1827, instance.toDecimal("MDCCCXXVII"));
        assertEquals(1828, instance.toDecimal("MDCCCXXVIII"));
        assertEquals(1829, instance.toDecimal("MDCCCXXIX"));
        assertEquals(1830, instance.toDecimal("MDCCCXXX"));

        assertEquals(1831, instance.toDecimal("MDCCCXXXI"));
        assertEquals(1832, instance.toDecimal("MDCCCXXXII"));
        assertEquals(1833, instance.toDecimal("MDCCCXXXIII"));
        assertEquals(1834, instance.toDecimal("MDCCCXXXIV"));
        assertEquals(1835, instance.toDecimal("MDCCCXXXV"));
        assertEquals(1836, instance.toDecimal("MDCCCXXXVI"));
        assertEquals(1837, instance.toDecimal("MDCCCXXXVII"));
        assertEquals(1838, instance.toDecimal("MDCCCXXXVIII"));
        assertEquals(1839, instance.toDecimal("MDCCCXXXIX"));
        assertEquals(1840, instance.toDecimal("MDCCCXL"));

        assertEquals(1841, instance.toDecimal("MDCCCXLI"));
        assertEquals(1842, instance.toDecimal("MDCCCXLII"));
        assertEquals(1843, instance.toDecimal("MDCCCXLIII"));
        assertEquals(1844, instance.toDecimal("MDCCCXLIV"));
        assertEquals(1845, instance.toDecimal("MDCCCXLV"));
        assertEquals(1846, instance.toDecimal("MDCCCXLVI"));
        assertEquals(1847, instance.toDecimal("MDCCCXLVII"));
        assertEquals(1848, instance.toDecimal("MDCCCXLVIII"));
        assertEquals(1849, instance.toDecimal("MDCCCXLIX"));
        assertEquals(1850, instance.toDecimal("MDCCCL"));

        assertEquals(1851, instance.toDecimal("MDCCCLI"));
        assertEquals(1852, instance.toDecimal("MDCCCLII"));
        assertEquals(1853, instance.toDecimal("MDCCCLIII"));
        assertEquals(1854, instance.toDecimal("MDCCCLIV"));
        assertEquals(1855, instance.toDecimal("MDCCCLV"));
        assertEquals(1856, instance.toDecimal("MDCCCLVI"));
        assertEquals(1857, instance.toDecimal("MDCCCLVII"));
        assertEquals(1858, instance.toDecimal("MDCCCLVIII"));
        assertEquals(1859, instance.toDecimal("MDCCCLIX"));
        assertEquals(1860, instance.toDecimal("MDCCCLX"));

        assertEquals(1861, instance.toDecimal("MDCCCLXI"));
        assertEquals(1862, instance.toDecimal("MDCCCLXII"));
        assertEquals(1863, instance.toDecimal("MDCCCLXIII"));
        assertEquals(1864, instance.toDecimal("MDCCCLXIV"));
        assertEquals(1865, instance.toDecimal("MDCCCLXV"));
        assertEquals(1866, instance.toDecimal("MDCCCLXVI"));
        assertEquals(1867, instance.toDecimal("MDCCCLXVII"));
        assertEquals(1868, instance.toDecimal("MDCCCLXVIII"));
        assertEquals(1869, instance.toDecimal("MDCCCLXIX"));
        assertEquals(1870, instance.toDecimal("MDCCCLXX"));

        assertEquals(1871, instance.toDecimal("MDCCCLXXI"));
        assertEquals(1872, instance.toDecimal("MDCCCLXXII"));
        assertEquals(1873, instance.toDecimal("MDCCCLXXIII"));
        assertEquals(1874, instance.toDecimal("MDCCCLXXIV"));
        assertEquals(1875, instance.toDecimal("MDCCCLXXV"));
        assertEquals(1876, instance.toDecimal("MDCCCLXXVI"));
        assertEquals(1877, instance.toDecimal("MDCCCLXXVII"));
        assertEquals(1878, instance.toDecimal("MDCCCLXXVIII"));
        assertEquals(1879, instance.toDecimal("MDCCCLXXIX"));
        assertEquals(1880, instance.toDecimal("MDCCCLXXX"));

        assertEquals(1881, instance.toDecimal("MDCCCLXXXI"));
        assertEquals(1882, instance.toDecimal("MDCCCLXXXII"));
        assertEquals(1883, instance.toDecimal("MDCCCLXXXIII"));
        assertEquals(1884, instance.toDecimal("MDCCCLXXXIV"));
        assertEquals(1885, instance.toDecimal("MDCCCLXXXV"));
        assertEquals(1886, instance.toDecimal("MDCCCLXXXVI"));
        assertEquals(1887, instance.toDecimal("MDCCCLXXXVII"));
        assertEquals(1888, instance.toDecimal("MDCCCLXXXVIII"));
        assertEquals(1889, instance.toDecimal("MDCCCLXXXIX"));
        assertEquals(1890, instance.toDecimal("MDCCCXC"));

        assertEquals(1891, instance.toDecimal("MDCCCXCI"));
        assertEquals(1892, instance.toDecimal("MDCCCXCII"));
        assertEquals(1893, instance.toDecimal("MDCCCXCIII"));
        assertEquals(1894, instance.toDecimal("MDCCCXCIV"));
        assertEquals(1895, instance.toDecimal("MDCCCXCV"));
        assertEquals(1896, instance.toDecimal("MDCCCXCVI"));
        assertEquals(1897, instance.toDecimal("MDCCCXCVII"));
        assertEquals(1898, instance.toDecimal("MDCCCXCVIII"));
        assertEquals(1899, instance.toDecimal("MDCCCXCIX"));
        assertEquals(1900, instance.toDecimal("MCM"));

        assertEquals(1901, instance.toDecimal("MCMI"));
        assertEquals(1902, instance.toDecimal("MCMII"));
        assertEquals(1903, instance.toDecimal("MCMIII"));
        assertEquals(1904, instance.toDecimal("MCMIV"));
        assertEquals(1905, instance.toDecimal("MCMV"));
        assertEquals(1906, instance.toDecimal("MCMVI"));
        assertEquals(1907, instance.toDecimal("MCMVII"));
        assertEquals(1908, instance.toDecimal("MCMVIII"));
        assertEquals(1909, instance.toDecimal("MCMIX"));
        assertEquals(1910, instance.toDecimal("MCMX"));

        assertEquals(1911, instance.toDecimal("MCMXI"));
        assertEquals(1912, instance.toDecimal("MCMXII"));
        assertEquals(1913, instance.toDecimal("MCMXIII"));
        assertEquals(1914, instance.toDecimal("MCMXIV"));
        assertEquals(1915, instance.toDecimal("MCMXV"));
        assertEquals(1916, instance.toDecimal("MCMXVI"));
        assertEquals(1917, instance.toDecimal("MCMXVII"));
        assertEquals(1918, instance.toDecimal("MCMXVIII"));
        assertEquals(1919, instance.toDecimal("MCMXIX"));
        assertEquals(1920, instance.toDecimal("MCMXX"));

        assertEquals(1921, instance.toDecimal("MCMXXI"));
        assertEquals(1922, instance.toDecimal("MCMXXII"));
        assertEquals(1923, instance.toDecimal("MCMXXIII"));
        assertEquals(1924, instance.toDecimal("MCMXXIV"));
        assertEquals(1925, instance.toDecimal("MCMXXV"));
        assertEquals(1926, instance.toDecimal("MCMXXVI"));
        assertEquals(1927, instance.toDecimal("MCMXXVII"));
        assertEquals(1928, instance.toDecimal("MCMXXVIII"));
        assertEquals(1929, instance.toDecimal("MCMXXIX"));
        assertEquals(1930, instance.toDecimal("MCMXXX"));

        assertEquals(1931, instance.toDecimal("MCMXXXI"));
        assertEquals(1932, instance.toDecimal("MCMXXXII"));
        assertEquals(1933, instance.toDecimal("MCMXXXIII"));
        assertEquals(1934, instance.toDecimal("MCMXXXIV"));
        assertEquals(1935, instance.toDecimal("MCMXXXV"));
        assertEquals(1936, instance.toDecimal("MCMXXXVI"));
        assertEquals(1937, instance.toDecimal("MCMXXXVII"));
        assertEquals(1938, instance.toDecimal("MCMXXXVIII"));
        assertEquals(1939, instance.toDecimal("MCMXXXIX"));
        assertEquals(1940, instance.toDecimal("MCMXL"));

        assertEquals(1941, instance.toDecimal("MCMXLI"));
        assertEquals(1942, instance.toDecimal("MCMXLII"));
        assertEquals(1943, instance.toDecimal("MCMXLIII"));
        assertEquals(1944, instance.toDecimal("MCMXLIV"));
        assertEquals(1945, instance.toDecimal("MCMXLV"));
        assertEquals(1946, instance.toDecimal("MCMXLVI"));
        assertEquals(1947, instance.toDecimal("MCMXLVII"));
        assertEquals(1948, instance.toDecimal("MCMXLVIII"));
        assertEquals(1949, instance.toDecimal("MCMXLIX"));
        assertEquals(1950, instance.toDecimal("MCML"));

        assertEquals(1951, instance.toDecimal("MCMLI"));
        assertEquals(1952, instance.toDecimal("MCMLII"));
        assertEquals(1953, instance.toDecimal("MCMLIII"));
        assertEquals(1954, instance.toDecimal("MCMLIV"));
        assertEquals(1955, instance.toDecimal("MCMLV"));
        assertEquals(1956, instance.toDecimal("MCMLVI"));
        assertEquals(1957, instance.toDecimal("MCMLVII"));
        assertEquals(1958, instance.toDecimal("MCMLVIII"));
        assertEquals(1959, instance.toDecimal("MCMLIX"));
        assertEquals(1960, instance.toDecimal("MCMLX"));

        assertEquals(1961, instance.toDecimal("MCMLXI"));
        assertEquals(1962, instance.toDecimal("MCMLXII"));
        assertEquals(1963, instance.toDecimal("MCMLXIII"));
        assertEquals(1964, instance.toDecimal("MCMLXIV"));
        assertEquals(1965, instance.toDecimal("MCMLXV"));
        assertEquals(1966, instance.toDecimal("MCMLXVI"));
        assertEquals(1967, instance.toDecimal("MCMLXVII"));
        assertEquals(1968, instance.toDecimal("MCMLXVIII"));
        assertEquals(1969, instance.toDecimal("MCMLXIX"));
        assertEquals(1970, instance.toDecimal("MCMLXX"));

        assertEquals(1971, instance.toDecimal("MCMLXXI"));
        assertEquals(1972, instance.toDecimal("MCMLXXII"));
        assertEquals(1973, instance.toDecimal("MCMLXXIII"));
        assertEquals(1974, instance.toDecimal("MCMLXXIV"));
        assertEquals(1975, instance.toDecimal("MCMLXXV"));
        assertEquals(1976, instance.toDecimal("MCMLXXVI"));
        assertEquals(1977, instance.toDecimal("MCMLXXVII"));
        assertEquals(1978, instance.toDecimal("MCMLXXVIII"));
        assertEquals(1979, instance.toDecimal("MCMLXXIX"));
        assertEquals(1980, instance.toDecimal("MCMLXXX"));

        assertEquals(1981, instance.toDecimal("MCMLXXXI"));
        assertEquals(1982, instance.toDecimal("MCMLXXXII"));
        assertEquals(1983, instance.toDecimal("MCMLXXXIII"));
        assertEquals(1984, instance.toDecimal("MCMLXXXIV"));
        assertEquals(1985, instance.toDecimal("MCMLXXXV"));
        assertEquals(1986, instance.toDecimal("MCMLXXXVI"));
        assertEquals(1987, instance.toDecimal("MCMLXXXVII"));
        assertEquals(1988, instance.toDecimal("MCMLXXXVIII"));
        assertEquals(1989, instance.toDecimal("MCMLXXXIX"));
        assertEquals(1990, instance.toDecimal("MCMXC"));

        assertEquals(1991, instance.toDecimal("MCMXCI"));
        assertEquals(1992, instance.toDecimal("MCMXCII"));
        assertEquals(1993, instance.toDecimal("MCMXCIII"));
        assertEquals(1994, instance.toDecimal("MCMXCIV"));
        assertEquals(1995, instance.toDecimal("MCMXCV"));
        assertEquals(1996, instance.toDecimal("MCMXCVI"));
        assertEquals(1997, instance.toDecimal("MCMXCVII"));
        assertEquals(1998, instance.toDecimal("MCMXCVIII"));
        assertEquals(1999, instance.toDecimal("MCMXCIX"));
        assertEquals(2000, instance.toDecimal("MM"));

        assertEquals(2001, instance.toDecimal("MMI"));
        assertEquals(2002, instance.toDecimal("MMII"));
        assertEquals(2003, instance.toDecimal("MMIII"));
        assertEquals(2004, instance.toDecimal("MMIV"));
        assertEquals(2005, instance.toDecimal("MMV"));
        assertEquals(2006, instance.toDecimal("MMVI"));
        assertEquals(2007, instance.toDecimal("MMVII"));
        assertEquals(2008, instance.toDecimal("MMVIII"));
        assertEquals(2009, instance.toDecimal("MMIX"));
        assertEquals(2010, instance.toDecimal("MMX"));

        assertEquals(2011, instance.toDecimal("MMXI"));
        assertEquals(2012, instance.toDecimal("MMXII"));
        assertEquals(2013, instance.toDecimal("MMXIII"));
        assertEquals(2014, instance.toDecimal("MMXIV"));
        assertEquals(2015, instance.toDecimal("MMXV"));
        assertEquals(2016, instance.toDecimal("MMXVI"));
        assertEquals(2017, instance.toDecimal("MMXVII"));
        assertEquals(2018, instance.toDecimal("MMXVIII"));
        assertEquals(2019, instance.toDecimal("MMXIX"));
        assertEquals(2020, instance.toDecimal("MMXX"));

        assertEquals(2021, instance.toDecimal("MMXXI"));
        assertEquals(2022, instance.toDecimal("MMXXII"));
        assertEquals(2023, instance.toDecimal("MMXXIII"));
        assertEquals(2024, instance.toDecimal("MMXXIV"));
        assertEquals(2025, instance.toDecimal("MMXXV"));
        assertEquals(2026, instance.toDecimal("MMXXVI"));
        assertEquals(2027, instance.toDecimal("MMXXVII"));
        assertEquals(2028, instance.toDecimal("MMXXVIII"));
        assertEquals(2029, instance.toDecimal("MMXXIX"));
        assertEquals(2030, instance.toDecimal("MMXXX"));

        assertEquals(2031, instance.toDecimal("MMXXXI"));
        assertEquals(2032, instance.toDecimal("MMXXXII"));
        assertEquals(2033, instance.toDecimal("MMXXXIII"));
        assertEquals(2034, instance.toDecimal("MMXXXIV"));
        assertEquals(2035, instance.toDecimal("MMXXXV"));
        assertEquals(2036, instance.toDecimal("MMXXXVI"));
        assertEquals(2037, instance.toDecimal("MMXXXVII"));
        assertEquals(2038, instance.toDecimal("MMXXXVIII"));
        assertEquals(2039, instance.toDecimal("MMXXXIX"));
        assertEquals(2040, instance.toDecimal("MMXL"));

        assertEquals(2041, instance.toDecimal("MMXLI"));
        assertEquals(2042, instance.toDecimal("MMXLII"));
        assertEquals(2043, instance.toDecimal("MMXLIII"));
        assertEquals(2044, instance.toDecimal("MMXLIV"));
        assertEquals(2045, instance.toDecimal("MMXLV"));
        assertEquals(2046, instance.toDecimal("MMXLVI"));
        assertEquals(2047, instance.toDecimal("MMXLVII"));
        assertEquals(2048, instance.toDecimal("MMXLVIII"));
        assertEquals(2049, instance.toDecimal("MMXLIX"));
        assertEquals(2050, instance.toDecimal("MML"));

        assertEquals(2051, instance.toDecimal("MMLI"));
        assertEquals(2052, instance.toDecimal("MMLII"));
        assertEquals(2053, instance.toDecimal("MMLIII"));
        assertEquals(2054, instance.toDecimal("MMLIV"));
        assertEquals(2055, instance.toDecimal("MMLV"));
        assertEquals(2056, instance.toDecimal("MMLVI"));
        assertEquals(2057, instance.toDecimal("MMLVII"));
        assertEquals(2058, instance.toDecimal("MMLVIII"));
        assertEquals(2059, instance.toDecimal("MMLIX"));
        assertEquals(2060, instance.toDecimal("MMLX"));

        assertEquals(2061, instance.toDecimal("MMLXI"));
        assertEquals(2062, instance.toDecimal("MMLXII"));
        assertEquals(2063, instance.toDecimal("MMLXIII"));
        assertEquals(2064, instance.toDecimal("MMLXIV"));
        assertEquals(2065, instance.toDecimal("MMLXV"));
        assertEquals(2066, instance.toDecimal("MMLXVI"));
        assertEquals(2067, instance.toDecimal("MMLXVII"));
        assertEquals(2068, instance.toDecimal("MMLXVIII"));
        assertEquals(2069, instance.toDecimal("MMLXIX"));
        assertEquals(2070, instance.toDecimal("MMLXX"));

        assertEquals(2071, instance.toDecimal("MMLXXI"));
        assertEquals(2072, instance.toDecimal("MMLXXII"));
        assertEquals(2073, instance.toDecimal("MMLXXIII"));
        assertEquals(2074, instance.toDecimal("MMLXXIV"));
        assertEquals(2075, instance.toDecimal("MMLXXV"));
        assertEquals(2076, instance.toDecimal("MMLXXVI"));
        assertEquals(2077, instance.toDecimal("MMLXXVII"));
        assertEquals(2078, instance.toDecimal("MMLXXVIII"));
        assertEquals(2079, instance.toDecimal("MMLXXIX"));
        assertEquals(2080, instance.toDecimal("MMLXXX"));

        assertEquals(2081, instance.toDecimal("MMLXXXI"));
        assertEquals(2082, instance.toDecimal("MMLXXXII"));
        assertEquals(2083, instance.toDecimal("MMLXXXIII"));
        assertEquals(2084, instance.toDecimal("MMLXXXIV"));
        assertEquals(2085, instance.toDecimal("MMLXXXV"));
        assertEquals(2086, instance.toDecimal("MMLXXXVI"));
        assertEquals(2087, instance.toDecimal("MMLXXXVII"));
        assertEquals(2088, instance.toDecimal("MMLXXXVIII"));
        assertEquals(2089, instance.toDecimal("MMLXXXIX"));
        assertEquals(2090, instance.toDecimal("MMXC"));

        assertEquals(2091, instance.toDecimal("MMXCI"));
        assertEquals(2092, instance.toDecimal("MMXCII"));
        assertEquals(2093, instance.toDecimal("MMXCIII"));
        assertEquals(2094, instance.toDecimal("MMXCIV"));
        assertEquals(2095, instance.toDecimal("MMXCV"));
        assertEquals(2096, instance.toDecimal("MMXCVI"));
        assertEquals(2097, instance.toDecimal("MMXCVII"));
        assertEquals(2098, instance.toDecimal("MMXCVIII"));
        assertEquals(2099, instance.toDecimal("MMXCIX"));
        assertEquals(2100, instance.toDecimal("MMC"));

        assertEquals(2101, instance.toDecimal("MMCI"));
        assertEquals(2102, instance.toDecimal("MMCII"));
        assertEquals(2103, instance.toDecimal("MMCIII"));
        assertEquals(2104, instance.toDecimal("MMCIV"));
        assertEquals(2105, instance.toDecimal("MMCV"));
        assertEquals(2106, instance.toDecimal("MMCVI"));
        assertEquals(2107, instance.toDecimal("MMCVII"));
        assertEquals(2108, instance.toDecimal("MMCVIII"));
        assertEquals(2109, instance.toDecimal("MMCIX"));
        assertEquals(2110, instance.toDecimal("MMCX"));

        assertEquals(2111, instance.toDecimal("MMCXI"));
        assertEquals(2112, instance.toDecimal("MMCXII"));
        assertEquals(2113, instance.toDecimal("MMCXIII"));
        assertEquals(2114, instance.toDecimal("MMCXIV"));
        assertEquals(2115, instance.toDecimal("MMCXV"));
        assertEquals(2116, instance.toDecimal("MMCXVI"));
        assertEquals(2117, instance.toDecimal("MMCXVII"));
        assertEquals(2118, instance.toDecimal("MMCXVIII"));
        assertEquals(2119, instance.toDecimal("MMCXIX"));
        assertEquals(2120, instance.toDecimal("MMCXX"));

        assertEquals(2121, instance.toDecimal("MMCXXI"));
        assertEquals(2122, instance.toDecimal("MMCXXII"));
        assertEquals(2123, instance.toDecimal("MMCXXIII"));
        assertEquals(2124, instance.toDecimal("MMCXXIV"));
        assertEquals(2125, instance.toDecimal("MMCXXV"));
        assertEquals(2126, instance.toDecimal("MMCXXVI"));
        assertEquals(2127, instance.toDecimal("MMCXXVII"));
        assertEquals(2128, instance.toDecimal("MMCXXVIII"));
        assertEquals(2129, instance.toDecimal("MMCXXIX"));
        assertEquals(2130, instance.toDecimal("MMCXXX"));

        assertEquals(2131, instance.toDecimal("MMCXXXI"));
        assertEquals(2132, instance.toDecimal("MMCXXXII"));
        assertEquals(2133, instance.toDecimal("MMCXXXIII"));
        assertEquals(2134, instance.toDecimal("MMCXXXIV"));
        assertEquals(2135, instance.toDecimal("MMCXXXV"));
        assertEquals(2136, instance.toDecimal("MMCXXXVI"));
        assertEquals(2137, instance.toDecimal("MMCXXXVII"));
        assertEquals(2138, instance.toDecimal("MMCXXXVIII"));
        assertEquals(2139, instance.toDecimal("MMCXXXIX"));
        assertEquals(2140, instance.toDecimal("MMCXL"));

        assertEquals(2141, instance.toDecimal("MMCXLI"));
        assertEquals(2142, instance.toDecimal("MMCXLII"));
        assertEquals(2143, instance.toDecimal("MMCXLIII"));
        assertEquals(2144, instance.toDecimal("MMCXLIV"));
        assertEquals(2145, instance.toDecimal("MMCXLV"));
        assertEquals(2146, instance.toDecimal("MMCXLVI"));
        assertEquals(2147, instance.toDecimal("MMCXLVII"));
        assertEquals(2148, instance.toDecimal("MMCXLVIII"));
        assertEquals(2149, instance.toDecimal("MMCXLIX"));
        assertEquals(2150, instance.toDecimal("MMCL"));

        assertEquals(2151, instance.toDecimal("MMCLI"));
        assertEquals(2152, instance.toDecimal("MMCLII"));
        assertEquals(2153, instance.toDecimal("MMCLIII"));
        assertEquals(2154, instance.toDecimal("MMCLIV"));
        assertEquals(2155, instance.toDecimal("MMCLV"));
        assertEquals(2156, instance.toDecimal("MMCLVI"));
        assertEquals(2157, instance.toDecimal("MMCLVII"));
        assertEquals(2158, instance.toDecimal("MMCLVIII"));
        assertEquals(2159, instance.toDecimal("MMCLIX"));
        assertEquals(2160, instance.toDecimal("MMCLX"));

        assertEquals(2161, instance.toDecimal("MMCLXI"));
        assertEquals(2162, instance.toDecimal("MMCLXII"));
        assertEquals(2163, instance.toDecimal("MMCLXIII"));
        assertEquals(2164, instance.toDecimal("MMCLXIV"));
        assertEquals(2165, instance.toDecimal("MMCLXV"));
        assertEquals(2166, instance.toDecimal("MMCLXVI"));
        assertEquals(2167, instance.toDecimal("MMCLXVII"));
        assertEquals(2168, instance.toDecimal("MMCLXVIII"));
        assertEquals(2169, instance.toDecimal("MMCLXIX"));
        assertEquals(2170, instance.toDecimal("MMCLXX"));

        assertEquals(2171, instance.toDecimal("MMCLXXI"));
        assertEquals(2172, instance.toDecimal("MMCLXXII"));
        assertEquals(2173, instance.toDecimal("MMCLXXIII"));
        assertEquals(2174, instance.toDecimal("MMCLXXIV"));
        assertEquals(2175, instance.toDecimal("MMCLXXV"));
        assertEquals(2176, instance.toDecimal("MMCLXXVI"));
        assertEquals(2177, instance.toDecimal("MMCLXXVII"));
        assertEquals(2178, instance.toDecimal("MMCLXXVIII"));
        assertEquals(2179, instance.toDecimal("MMCLXXIX"));
        assertEquals(2180, instance.toDecimal("MMCLXXX"));

        assertEquals(2181, instance.toDecimal("MMCLXXXI"));
        assertEquals(2182, instance.toDecimal("MMCLXXXII"));
        assertEquals(2183, instance.toDecimal("MMCLXXXIII"));
        assertEquals(2184, instance.toDecimal("MMCLXXXIV"));
        assertEquals(2185, instance.toDecimal("MMCLXXXV"));
        assertEquals(2186, instance.toDecimal("MMCLXXXVI"));
        assertEquals(2187, instance.toDecimal("MMCLXXXVII"));
        assertEquals(2188, instance.toDecimal("MMCLXXXVIII"));
        assertEquals(2189, instance.toDecimal("MMCLXXXIX"));
        assertEquals(2190, instance.toDecimal("MMCXC"));

        assertEquals(2191, instance.toDecimal("MMCXCI"));
        assertEquals(2192, instance.toDecimal("MMCXCII"));
        assertEquals(2193, instance.toDecimal("MMCXCIII"));
        assertEquals(2194, instance.toDecimal("MMCXCIV"));
        assertEquals(2195, instance.toDecimal("MMCXCV"));
        assertEquals(2196, instance.toDecimal("MMCXCVI"));
        assertEquals(2197, instance.toDecimal("MMCXCVII"));
        assertEquals(2198, instance.toDecimal("MMCXCVIII"));
        assertEquals(2199, instance.toDecimal("MMCXCIX"));
        assertEquals(2200, instance.toDecimal("MMCC"));

        assertEquals(2201, instance.toDecimal("MMCCI"));
        assertEquals(2202, instance.toDecimal("MMCCII"));
        assertEquals(2203, instance.toDecimal("MMCCIII"));
        assertEquals(2204, instance.toDecimal("MMCCIV"));
        assertEquals(2205, instance.toDecimal("MMCCV"));
        assertEquals(2206, instance.toDecimal("MMCCVI"));
        assertEquals(2207, instance.toDecimal("MMCCVII"));
        assertEquals(2208, instance.toDecimal("MMCCVIII"));
        assertEquals(2209, instance.toDecimal("MMCCIX"));
        assertEquals(2210, instance.toDecimal("MMCCX"));

        assertEquals(2211, instance.toDecimal("MMCCXI"));
        assertEquals(2212, instance.toDecimal("MMCCXII"));
        assertEquals(2213, instance.toDecimal("MMCCXIII"));
        assertEquals(2214, instance.toDecimal("MMCCXIV"));
        assertEquals(2215, instance.toDecimal("MMCCXV"));
        assertEquals(2216, instance.toDecimal("MMCCXVI"));
        assertEquals(2217, instance.toDecimal("MMCCXVII"));
        assertEquals(2218, instance.toDecimal("MMCCXVIII"));
        assertEquals(2219, instance.toDecimal("MMCCXIX"));
        assertEquals(2220, instance.toDecimal("MMCCXX"));

        assertEquals(2221, instance.toDecimal("MMCCXXI"));
        assertEquals(2222, instance.toDecimal("MMCCXXII"));
        assertEquals(2223, instance.toDecimal("MMCCXXIII"));
        assertEquals(2224, instance.toDecimal("MMCCXXIV"));
        assertEquals(2225, instance.toDecimal("MMCCXXV"));
        assertEquals(2226, instance.toDecimal("MMCCXXVI"));
        assertEquals(2227, instance.toDecimal("MMCCXXVII"));
        assertEquals(2228, instance.toDecimal("MMCCXXVIII"));
        assertEquals(2229, instance.toDecimal("MMCCXXIX"));
        assertEquals(2230, instance.toDecimal("MMCCXXX"));

        assertEquals(2231, instance.toDecimal("MMCCXXXI"));
        assertEquals(2232, instance.toDecimal("MMCCXXXII"));
        assertEquals(2233, instance.toDecimal("MMCCXXXIII"));
        assertEquals(2234, instance.toDecimal("MMCCXXXIV"));
        assertEquals(2235, instance.toDecimal("MMCCXXXV"));
        assertEquals(2236, instance.toDecimal("MMCCXXXVI"));
        assertEquals(2237, instance.toDecimal("MMCCXXXVII"));
        assertEquals(2238, instance.toDecimal("MMCCXXXVIII"));
        assertEquals(2239, instance.toDecimal("MMCCXXXIX"));
        assertEquals(2240, instance.toDecimal("MMCCXL"));

        assertEquals(2241, instance.toDecimal("MMCCXLI"));
        assertEquals(2242, instance.toDecimal("MMCCXLII"));
        assertEquals(2243, instance.toDecimal("MMCCXLIII"));
        assertEquals(2244, instance.toDecimal("MMCCXLIV"));
        assertEquals(2245, instance.toDecimal("MMCCXLV"));
        assertEquals(2246, instance.toDecimal("MMCCXLVI"));
        assertEquals(2247, instance.toDecimal("MMCCXLVII"));
        assertEquals(2248, instance.toDecimal("MMCCXLVIII"));
        assertEquals(2249, instance.toDecimal("MMCCXLIX"));
        assertEquals(2250, instance.toDecimal("MMCCL"));

        assertEquals(2251, instance.toDecimal("MMCCLI"));
        assertEquals(2252, instance.toDecimal("MMCCLII"));
        assertEquals(2253, instance.toDecimal("MMCCLIII"));
        assertEquals(2254, instance.toDecimal("MMCCLIV"));
        assertEquals(2255, instance.toDecimal("MMCCLV"));
        assertEquals(2256, instance.toDecimal("MMCCLVI"));
        assertEquals(2257, instance.toDecimal("MMCCLVII"));
        assertEquals(2258, instance.toDecimal("MMCCLVIII"));
        assertEquals(2259, instance.toDecimal("MMCCLIX"));
        assertEquals(2260, instance.toDecimal("MMCCLX"));

        assertEquals(2261, instance.toDecimal("MMCCLXI"));
        assertEquals(2262, instance.toDecimal("MMCCLXII"));
        assertEquals(2263, instance.toDecimal("MMCCLXIII"));
        assertEquals(2264, instance.toDecimal("MMCCLXIV"));
        assertEquals(2265, instance.toDecimal("MMCCLXV"));
        assertEquals(2266, instance.toDecimal("MMCCLXVI"));
        assertEquals(2267, instance.toDecimal("MMCCLXVII"));
        assertEquals(2268, instance.toDecimal("MMCCLXVIII"));
        assertEquals(2269, instance.toDecimal("MMCCLXIX"));
        assertEquals(2270, instance.toDecimal("MMCCLXX"));

        assertEquals(2271, instance.toDecimal("MMCCLXXI"));
        assertEquals(2272, instance.toDecimal("MMCCLXXII"));
        assertEquals(2273, instance.toDecimal("MMCCLXXIII"));
        assertEquals(2274, instance.toDecimal("MMCCLXXIV"));
        assertEquals(2275, instance.toDecimal("MMCCLXXV"));
        assertEquals(2276, instance.toDecimal("MMCCLXXVI"));
        assertEquals(2277, instance.toDecimal("MMCCLXXVII"));
        assertEquals(2278, instance.toDecimal("MMCCLXXVIII"));
        assertEquals(2279, instance.toDecimal("MMCCLXXIX"));
        assertEquals(2280, instance.toDecimal("MMCCLXXX"));

        assertEquals(2281, instance.toDecimal("MMCCLXXXI"));
        assertEquals(2282, instance.toDecimal("MMCCLXXXII"));
        assertEquals(2283, instance.toDecimal("MMCCLXXXIII"));
        assertEquals(2284, instance.toDecimal("MMCCLXXXIV"));
        assertEquals(2285, instance.toDecimal("MMCCLXXXV"));
        assertEquals(2286, instance.toDecimal("MMCCLXXXVI"));
        assertEquals(2287, instance.toDecimal("MMCCLXXXVII"));
        assertEquals(2288, instance.toDecimal("MMCCLXXXVIII"));
        assertEquals(2289, instance.toDecimal("MMCCLXXXIX"));
        assertEquals(2290, instance.toDecimal("MMCCXC"));

        assertEquals(2291, instance.toDecimal("MMCCXCI"));
        assertEquals(2292, instance.toDecimal("MMCCXCII"));
        assertEquals(2293, instance.toDecimal("MMCCXCIII"));
        assertEquals(2294, instance.toDecimal("MMCCXCIV"));
        assertEquals(2295, instance.toDecimal("MMCCXCV"));
        assertEquals(2296, instance.toDecimal("MMCCXCVI"));
        assertEquals(2297, instance.toDecimal("MMCCXCVII"));
        assertEquals(2298, instance.toDecimal("MMCCXCVIII"));
        assertEquals(2299, instance.toDecimal("MMCCXCIX"));
        assertEquals(2300, instance.toDecimal("MMCCC"));

        assertEquals(2301, instance.toDecimal("MMCCCI"));
        assertEquals(2302, instance.toDecimal("MMCCCII"));
        assertEquals(2303, instance.toDecimal("MMCCCIII"));
        assertEquals(2304, instance.toDecimal("MMCCCIV"));
        assertEquals(2305, instance.toDecimal("MMCCCV"));
        assertEquals(2306, instance.toDecimal("MMCCCVI"));
        assertEquals(2307, instance.toDecimal("MMCCCVII"));
        assertEquals(2308, instance.toDecimal("MMCCCVIII"));
        assertEquals(2309, instance.toDecimal("MMCCCIX"));
        assertEquals(2310, instance.toDecimal("MMCCCX"));

        assertEquals(2311, instance.toDecimal("MMCCCXI"));
        assertEquals(2312, instance.toDecimal("MMCCCXII"));
        assertEquals(2313, instance.toDecimal("MMCCCXIII"));
        assertEquals(2314, instance.toDecimal("MMCCCXIV"));
        assertEquals(2315, instance.toDecimal("MMCCCXV"));
        assertEquals(2316, instance.toDecimal("MMCCCXVI"));
        assertEquals(2317, instance.toDecimal("MMCCCXVII"));
        assertEquals(2318, instance.toDecimal("MMCCCXVIII"));
        assertEquals(2319, instance.toDecimal("MMCCCXIX"));
        assertEquals(2320, instance.toDecimal("MMCCCXX"));

        assertEquals(2321, instance.toDecimal("MMCCCXXI"));
        assertEquals(2322, instance.toDecimal("MMCCCXXII"));
        assertEquals(2323, instance.toDecimal("MMCCCXXIII"));
        assertEquals(2324, instance.toDecimal("MMCCCXXIV"));
        assertEquals(2325, instance.toDecimal("MMCCCXXV"));
        assertEquals(2326, instance.toDecimal("MMCCCXXVI"));
        assertEquals(2327, instance.toDecimal("MMCCCXXVII"));
        assertEquals(2328, instance.toDecimal("MMCCCXXVIII"));
        assertEquals(2329, instance.toDecimal("MMCCCXXIX"));
        assertEquals(2330, instance.toDecimal("MMCCCXXX"));

        assertEquals(2331, instance.toDecimal("MMCCCXXXI"));
        assertEquals(2332, instance.toDecimal("MMCCCXXXII"));
        assertEquals(2333, instance.toDecimal("MMCCCXXXIII"));
        assertEquals(2334, instance.toDecimal("MMCCCXXXIV"));
        assertEquals(2335, instance.toDecimal("MMCCCXXXV"));
        assertEquals(2336, instance.toDecimal("MMCCCXXXVI"));
        assertEquals(2337, instance.toDecimal("MMCCCXXXVII"));
        assertEquals(2338, instance.toDecimal("MMCCCXXXVIII"));
        assertEquals(2339, instance.toDecimal("MMCCCXXXIX"));
        assertEquals(2340, instance.toDecimal("MMCCCXL"));

        assertEquals(2341, instance.toDecimal("MMCCCXLI"));
        assertEquals(2342, instance.toDecimal("MMCCCXLII"));
        assertEquals(2343, instance.toDecimal("MMCCCXLIII"));
        assertEquals(2344, instance.toDecimal("MMCCCXLIV"));
        assertEquals(2345, instance.toDecimal("MMCCCXLV"));
        assertEquals(2346, instance.toDecimal("MMCCCXLVI"));
        assertEquals(2347, instance.toDecimal("MMCCCXLVII"));
        assertEquals(2348, instance.toDecimal("MMCCCXLVIII"));
        assertEquals(2349, instance.toDecimal("MMCCCXLIX"));
        assertEquals(2350, instance.toDecimal("MMCCCL"));

        assertEquals(2351, instance.toDecimal("MMCCCLI"));
        assertEquals(2352, instance.toDecimal("MMCCCLII"));
        assertEquals(2353, instance.toDecimal("MMCCCLIII"));
        assertEquals(2354, instance.toDecimal("MMCCCLIV"));
        assertEquals(2355, instance.toDecimal("MMCCCLV"));
        assertEquals(2356, instance.toDecimal("MMCCCLVI"));
        assertEquals(2357, instance.toDecimal("MMCCCLVII"));
        assertEquals(2358, instance.toDecimal("MMCCCLVIII"));
        assertEquals(2359, instance.toDecimal("MMCCCLIX"));
        assertEquals(2360, instance.toDecimal("MMCCCLX"));

        assertEquals(2361, instance.toDecimal("MMCCCLXI"));
        assertEquals(2362, instance.toDecimal("MMCCCLXII"));
        assertEquals(2363, instance.toDecimal("MMCCCLXIII"));
        assertEquals(2364, instance.toDecimal("MMCCCLXIV"));
        assertEquals(2365, instance.toDecimal("MMCCCLXV"));
        assertEquals(2366, instance.toDecimal("MMCCCLXVI"));
        assertEquals(2367, instance.toDecimal("MMCCCLXVII"));
        assertEquals(2368, instance.toDecimal("MMCCCLXVIII"));
        assertEquals(2369, instance.toDecimal("MMCCCLXIX"));
        assertEquals(2370, instance.toDecimal("MMCCCLXX"));

        assertEquals(2371, instance.toDecimal("MMCCCLXXI"));
        assertEquals(2372, instance.toDecimal("MMCCCLXXII"));
        assertEquals(2373, instance.toDecimal("MMCCCLXXIII"));
        assertEquals(2374, instance.toDecimal("MMCCCLXXIV"));
        assertEquals(2375, instance.toDecimal("MMCCCLXXV"));
        assertEquals(2376, instance.toDecimal("MMCCCLXXVI"));
        assertEquals(2377, instance.toDecimal("MMCCCLXXVII"));
        assertEquals(2378, instance.toDecimal("MMCCCLXXVIII"));
        assertEquals(2379, instance.toDecimal("MMCCCLXXIX"));
        assertEquals(2380, instance.toDecimal("MMCCCLXXX"));

        assertEquals(2381, instance.toDecimal("MMCCCLXXXI"));
        assertEquals(2382, instance.toDecimal("MMCCCLXXXII"));
        assertEquals(2383, instance.toDecimal("MMCCCLXXXIII"));
        assertEquals(2384, instance.toDecimal("MMCCCLXXXIV"));
        assertEquals(2385, instance.toDecimal("MMCCCLXXXV"));
        assertEquals(2386, instance.toDecimal("MMCCCLXXXVI"));
        assertEquals(2387, instance.toDecimal("MMCCCLXXXVII"));
        assertEquals(2388, instance.toDecimal("MMCCCLXXXVIII"));
        assertEquals(2389, instance.toDecimal("MMCCCLXXXIX"));
        assertEquals(2390, instance.toDecimal("MMCCCXC"));

        assertEquals(2391, instance.toDecimal("MMCCCXCI"));
        assertEquals(2392, instance.toDecimal("MMCCCXCII"));
        assertEquals(2393, instance.toDecimal("MMCCCXCIII"));
        assertEquals(2394, instance.toDecimal("MMCCCXCIV"));
        assertEquals(2395, instance.toDecimal("MMCCCXCV"));
        assertEquals(2396, instance.toDecimal("MMCCCXCVI"));
        assertEquals(2397, instance.toDecimal("MMCCCXCVII"));
        assertEquals(2398, instance.toDecimal("MMCCCXCVIII"));
        assertEquals(2399, instance.toDecimal("MMCCCXCIX"));
        assertEquals(2400, instance.toDecimal("MMCD"));

        assertEquals(2401, instance.toDecimal("MMCDI"));
        assertEquals(2402, instance.toDecimal("MMCDII"));
        assertEquals(2403, instance.toDecimal("MMCDIII"));
        assertEquals(2404, instance.toDecimal("MMCDIV"));
        assertEquals(2405, instance.toDecimal("MMCDV"));
        assertEquals(2406, instance.toDecimal("MMCDVI"));
        assertEquals(2407, instance.toDecimal("MMCDVII"));
        assertEquals(2408, instance.toDecimal("MMCDVIII"));
        assertEquals(2409, instance.toDecimal("MMCDIX"));
        assertEquals(2410, instance.toDecimal("MMCDX"));

        assertEquals(2411, instance.toDecimal("MMCDXI"));
        assertEquals(2412, instance.toDecimal("MMCDXII"));
        assertEquals(2413, instance.toDecimal("MMCDXIII"));
        assertEquals(2414, instance.toDecimal("MMCDXIV"));
        assertEquals(2415, instance.toDecimal("MMCDXV"));
        assertEquals(2416, instance.toDecimal("MMCDXVI"));
        assertEquals(2417, instance.toDecimal("MMCDXVII"));
        assertEquals(2418, instance.toDecimal("MMCDXVIII"));
        assertEquals(2419, instance.toDecimal("MMCDXIX"));
        assertEquals(2420, instance.toDecimal("MMCDXX"));

        assertEquals(2421, instance.toDecimal("MMCDXXI"));
        assertEquals(2422, instance.toDecimal("MMCDXXII"));
        assertEquals(2423, instance.toDecimal("MMCDXXIII"));
        assertEquals(2424, instance.toDecimal("MMCDXXIV"));
        assertEquals(2425, instance.toDecimal("MMCDXXV"));
        assertEquals(2426, instance.toDecimal("MMCDXXVI"));
        assertEquals(2427, instance.toDecimal("MMCDXXVII"));
        assertEquals(2428, instance.toDecimal("MMCDXXVIII"));
        assertEquals(2429, instance.toDecimal("MMCDXXIX"));
        assertEquals(2430, instance.toDecimal("MMCDXXX"));

        assertEquals(2431, instance.toDecimal("MMCDXXXI"));
        assertEquals(2432, instance.toDecimal("MMCDXXXII"));
        assertEquals(2433, instance.toDecimal("MMCDXXXIII"));
        assertEquals(2434, instance.toDecimal("MMCDXXXIV"));
        assertEquals(2435, instance.toDecimal("MMCDXXXV"));
        assertEquals(2436, instance.toDecimal("MMCDXXXVI"));
        assertEquals(2437, instance.toDecimal("MMCDXXXVII"));
        assertEquals(2438, instance.toDecimal("MMCDXXXVIII"));
        assertEquals(2439, instance.toDecimal("MMCDXXXIX"));
        assertEquals(2440, instance.toDecimal("MMCDXL"));

        assertEquals(2441, instance.toDecimal("MMCDXLI"));
        assertEquals(2442, instance.toDecimal("MMCDXLII"));
        assertEquals(2443, instance.toDecimal("MMCDXLIII"));
        assertEquals(2444, instance.toDecimal("MMCDXLIV"));
        assertEquals(2445, instance.toDecimal("MMCDXLV"));
        assertEquals(2446, instance.toDecimal("MMCDXLVI"));
        assertEquals(2447, instance.toDecimal("MMCDXLVII"));
        assertEquals(2448, instance.toDecimal("MMCDXLVIII"));
        assertEquals(2449, instance.toDecimal("MMCDXLIX"));
        assertEquals(2450, instance.toDecimal("MMCDL"));

        assertEquals(2451, instance.toDecimal("MMCDLI"));
        assertEquals(2452, instance.toDecimal("MMCDLII"));
        assertEquals(2453, instance.toDecimal("MMCDLIII"));
        assertEquals(2454, instance.toDecimal("MMCDLIV"));
        assertEquals(2455, instance.toDecimal("MMCDLV"));
        assertEquals(2456, instance.toDecimal("MMCDLVI"));
        assertEquals(2457, instance.toDecimal("MMCDLVII"));
        assertEquals(2458, instance.toDecimal("MMCDLVIII"));
        assertEquals(2459, instance.toDecimal("MMCDLIX"));
        assertEquals(2460, instance.toDecimal("MMCDLX"));

        assertEquals(2461, instance.toDecimal("MMCDLXI"));
        assertEquals(2462, instance.toDecimal("MMCDLXII"));
        assertEquals(2463, instance.toDecimal("MMCDLXIII"));
        assertEquals(2464, instance.toDecimal("MMCDLXIV"));
        assertEquals(2465, instance.toDecimal("MMCDLXV"));
        assertEquals(2466, instance.toDecimal("MMCDLXVI"));
        assertEquals(2467, instance.toDecimal("MMCDLXVII"));
        assertEquals(2468, instance.toDecimal("MMCDLXVIII"));
        assertEquals(2469, instance.toDecimal("MMCDLXIX"));
        assertEquals(2470, instance.toDecimal("MMCDLXX"));

        assertEquals(2471, instance.toDecimal("MMCDLXXI"));
        assertEquals(2472, instance.toDecimal("MMCDLXXII"));
        assertEquals(2473, instance.toDecimal("MMCDLXXIII"));
        assertEquals(2474, instance.toDecimal("MMCDLXXIV"));
        assertEquals(2475, instance.toDecimal("MMCDLXXV"));
        assertEquals(2476, instance.toDecimal("MMCDLXXVI"));
        assertEquals(2477, instance.toDecimal("MMCDLXXVII"));
        assertEquals(2478, instance.toDecimal("MMCDLXXVIII"));
        assertEquals(2479, instance.toDecimal("MMCDLXXIX"));
        assertEquals(2480, instance.toDecimal("MMCDLXXX"));

        assertEquals(2481, instance.toDecimal("MMCDLXXXI"));
        assertEquals(2482, instance.toDecimal("MMCDLXXXII"));
        assertEquals(2483, instance.toDecimal("MMCDLXXXIII"));
        assertEquals(2484, instance.toDecimal("MMCDLXXXIV"));
        assertEquals(2485, instance.toDecimal("MMCDLXXXV"));
        assertEquals(2486, instance.toDecimal("MMCDLXXXVI"));
        assertEquals(2487, instance.toDecimal("MMCDLXXXVII"));
        assertEquals(2488, instance.toDecimal("MMCDLXXXVIII"));
        assertEquals(2489, instance.toDecimal("MMCDLXXXIX"));
        assertEquals(2490, instance.toDecimal("MMCDXC"));

        assertEquals(2491, instance.toDecimal("MMCDXCI"));
        assertEquals(2492, instance.toDecimal("MMCDXCII"));
        assertEquals(2493, instance.toDecimal("MMCDXCIII"));
        assertEquals(2494, instance.toDecimal("MMCDXCIV"));
        assertEquals(2495, instance.toDecimal("MMCDXCV"));
        assertEquals(2496, instance.toDecimal("MMCDXCVI"));
        assertEquals(2497, instance.toDecimal("MMCDXCVII"));
        assertEquals(2498, instance.toDecimal("MMCDXCVIII"));
        assertEquals(2499, instance.toDecimal("MMCDXCIX"));
        assertEquals(2500, instance.toDecimal("MMD"));

        assertEquals(2501, instance.toDecimal("MMDI"));
        assertEquals(2502, instance.toDecimal("MMDII"));
        assertEquals(2503, instance.toDecimal("MMDIII"));
        assertEquals(2504, instance.toDecimal("MMDIV"));
        assertEquals(2505, instance.toDecimal("MMDV"));
        assertEquals(2506, instance.toDecimal("MMDVI"));
        assertEquals(2507, instance.toDecimal("MMDVII"));
        assertEquals(2508, instance.toDecimal("MMDVIII"));
        assertEquals(2509, instance.toDecimal("MMDIX"));
        assertEquals(2510, instance.toDecimal("MMDX"));

        assertEquals(2511, instance.toDecimal("MMDXI"));
        assertEquals(2512, instance.toDecimal("MMDXII"));
        assertEquals(2513, instance.toDecimal("MMDXIII"));
        assertEquals(2514, instance.toDecimal("MMDXIV"));
        assertEquals(2515, instance.toDecimal("MMDXV"));
        assertEquals(2516, instance.toDecimal("MMDXVI"));
        assertEquals(2517, instance.toDecimal("MMDXVII"));
        assertEquals(2518, instance.toDecimal("MMDXVIII"));
        assertEquals(2519, instance.toDecimal("MMDXIX"));
        assertEquals(2520, instance.toDecimal("MMDXX"));

        assertEquals(2521, instance.toDecimal("MMDXXI"));
        assertEquals(2522, instance.toDecimal("MMDXXII"));
        assertEquals(2523, instance.toDecimal("MMDXXIII"));
        assertEquals(2524, instance.toDecimal("MMDXXIV"));
        assertEquals(2525, instance.toDecimal("MMDXXV"));
        assertEquals(2526, instance.toDecimal("MMDXXVI"));
        assertEquals(2527, instance.toDecimal("MMDXXVII"));
        assertEquals(2528, instance.toDecimal("MMDXXVIII"));
        assertEquals(2529, instance.toDecimal("MMDXXIX"));
        assertEquals(2530, instance.toDecimal("MMDXXX"));

        assertEquals(2531, instance.toDecimal("MMDXXXI"));
        assertEquals(2532, instance.toDecimal("MMDXXXII"));
        assertEquals(2533, instance.toDecimal("MMDXXXIII"));
        assertEquals(2534, instance.toDecimal("MMDXXXIV"));
        assertEquals(2535, instance.toDecimal("MMDXXXV"));
        assertEquals(2536, instance.toDecimal("MMDXXXVI"));
        assertEquals(2537, instance.toDecimal("MMDXXXVII"));
        assertEquals(2538, instance.toDecimal("MMDXXXVIII"));
        assertEquals(2539, instance.toDecimal("MMDXXXIX"));
        assertEquals(2540, instance.toDecimal("MMDXL"));

        assertEquals(2541, instance.toDecimal("MMDXLI"));
        assertEquals(2542, instance.toDecimal("MMDXLII"));
        assertEquals(2543, instance.toDecimal("MMDXLIII"));
        assertEquals(2544, instance.toDecimal("MMDXLIV"));
        assertEquals(2545, instance.toDecimal("MMDXLV"));
        assertEquals(2546, instance.toDecimal("MMDXLVI"));
        assertEquals(2547, instance.toDecimal("MMDXLVII"));
        assertEquals(2548, instance.toDecimal("MMDXLVIII"));
        assertEquals(2549, instance.toDecimal("MMDXLIX"));
        assertEquals(2550, instance.toDecimal("MMDL"));

        assertEquals(2551, instance.toDecimal("MMDLI"));
        assertEquals(2552, instance.toDecimal("MMDLII"));
        assertEquals(2553, instance.toDecimal("MMDLIII"));
        assertEquals(2554, instance.toDecimal("MMDLIV"));
        assertEquals(2555, instance.toDecimal("MMDLV"));
        assertEquals(2556, instance.toDecimal("MMDLVI"));
        assertEquals(2557, instance.toDecimal("MMDLVII"));
        assertEquals(2558, instance.toDecimal("MMDLVIII"));
        assertEquals(2559, instance.toDecimal("MMDLIX"));
        assertEquals(2560, instance.toDecimal("MMDLX"));

        assertEquals(2561, instance.toDecimal("MMDLXI"));
        assertEquals(2562, instance.toDecimal("MMDLXII"));
        assertEquals(2563, instance.toDecimal("MMDLXIII"));
        assertEquals(2564, instance.toDecimal("MMDLXIV"));
        assertEquals(2565, instance.toDecimal("MMDLXV"));
        assertEquals(2566, instance.toDecimal("MMDLXVI"));
        assertEquals(2567, instance.toDecimal("MMDLXVII"));
        assertEquals(2568, instance.toDecimal("MMDLXVIII"));
        assertEquals(2569, instance.toDecimal("MMDLXIX"));
        assertEquals(2570, instance.toDecimal("MMDLXX"));

        assertEquals(2571, instance.toDecimal("MMDLXXI"));
        assertEquals(2572, instance.toDecimal("MMDLXXII"));
        assertEquals(2573, instance.toDecimal("MMDLXXIII"));
        assertEquals(2574, instance.toDecimal("MMDLXXIV"));
        assertEquals(2575, instance.toDecimal("MMDLXXV"));
        assertEquals(2576, instance.toDecimal("MMDLXXVI"));
        assertEquals(2577, instance.toDecimal("MMDLXXVII"));
        assertEquals(2578, instance.toDecimal("MMDLXXVIII"));
        assertEquals(2579, instance.toDecimal("MMDLXXIX"));
        assertEquals(2580, instance.toDecimal("MMDLXXX"));

        assertEquals(2581, instance.toDecimal("MMDLXXXI"));
        assertEquals(2582, instance.toDecimal("MMDLXXXII"));
        assertEquals(2583, instance.toDecimal("MMDLXXXIII"));
        assertEquals(2584, instance.toDecimal("MMDLXXXIV"));
        assertEquals(2585, instance.toDecimal("MMDLXXXV"));
        assertEquals(2586, instance.toDecimal("MMDLXXXVI"));
        assertEquals(2587, instance.toDecimal("MMDLXXXVII"));
        assertEquals(2588, instance.toDecimal("MMDLXXXVIII"));
        assertEquals(2589, instance.toDecimal("MMDLXXXIX"));
        assertEquals(2590, instance.toDecimal("MMDXC"));

        assertEquals(2591, instance.toDecimal("MMDXCI"));
        assertEquals(2592, instance.toDecimal("MMDXCII"));
        assertEquals(2593, instance.toDecimal("MMDXCIII"));
        assertEquals(2594, instance.toDecimal("MMDXCIV"));
        assertEquals(2595, instance.toDecimal("MMDXCV"));
        assertEquals(2596, instance.toDecimal("MMDXCVI"));
        assertEquals(2597, instance.toDecimal("MMDXCVII"));
        assertEquals(2598, instance.toDecimal("MMDXCVIII"));
        assertEquals(2599, instance.toDecimal("MMDXCIX"));
        assertEquals(2600, instance.toDecimal("MMDC"));

        assertEquals(2601, instance.toDecimal("MMDCI"));
        assertEquals(2602, instance.toDecimal("MMDCII"));
        assertEquals(2603, instance.toDecimal("MMDCIII"));
        assertEquals(2604, instance.toDecimal("MMDCIV"));
        assertEquals(2605, instance.toDecimal("MMDCV"));
        assertEquals(2606, instance.toDecimal("MMDCVI"));
        assertEquals(2607, instance.toDecimal("MMDCVII"));
        assertEquals(2608, instance.toDecimal("MMDCVIII"));
        assertEquals(2609, instance.toDecimal("MMDCIX"));
        assertEquals(2610, instance.toDecimal("MMDCX"));

        assertEquals(2611, instance.toDecimal("MMDCXI"));
        assertEquals(2612, instance.toDecimal("MMDCXII"));
        assertEquals(2613, instance.toDecimal("MMDCXIII"));
        assertEquals(2614, instance.toDecimal("MMDCXIV"));
        assertEquals(2615, instance.toDecimal("MMDCXV"));
        assertEquals(2616, instance.toDecimal("MMDCXVI"));
        assertEquals(2617, instance.toDecimal("MMDCXVII"));
        assertEquals(2618, instance.toDecimal("MMDCXVIII"));
        assertEquals(2619, instance.toDecimal("MMDCXIX"));
        assertEquals(2620, instance.toDecimal("MMDCXX"));

        assertEquals(2621, instance.toDecimal("MMDCXXI"));
        assertEquals(2622, instance.toDecimal("MMDCXXII"));
        assertEquals(2623, instance.toDecimal("MMDCXXIII"));
        assertEquals(2624, instance.toDecimal("MMDCXXIV"));
        assertEquals(2625, instance.toDecimal("MMDCXXV"));
        assertEquals(2626, instance.toDecimal("MMDCXXVI"));
        assertEquals(2627, instance.toDecimal("MMDCXXVII"));
        assertEquals(2628, instance.toDecimal("MMDCXXVIII"));
        assertEquals(2629, instance.toDecimal("MMDCXXIX"));
        assertEquals(2630, instance.toDecimal("MMDCXXX"));

        assertEquals(2631, instance.toDecimal("MMDCXXXI"));
        assertEquals(2632, instance.toDecimal("MMDCXXXII"));
        assertEquals(2633, instance.toDecimal("MMDCXXXIII"));
        assertEquals(2634, instance.toDecimal("MMDCXXXIV"));
        assertEquals(2635, instance.toDecimal("MMDCXXXV"));
        assertEquals(2636, instance.toDecimal("MMDCXXXVI"));
        assertEquals(2637, instance.toDecimal("MMDCXXXVII"));
        assertEquals(2638, instance.toDecimal("MMDCXXXVIII"));
        assertEquals(2639, instance.toDecimal("MMDCXXXIX"));
        assertEquals(2640, instance.toDecimal("MMDCXL"));

        assertEquals(2641, instance.toDecimal("MMDCXLI"));
        assertEquals(2642, instance.toDecimal("MMDCXLII"));
        assertEquals(2643, instance.toDecimal("MMDCXLIII"));
        assertEquals(2644, instance.toDecimal("MMDCXLIV"));
        assertEquals(2645, instance.toDecimal("MMDCXLV"));
        assertEquals(2646, instance.toDecimal("MMDCXLVI"));
        assertEquals(2647, instance.toDecimal("MMDCXLVII"));
        assertEquals(2648, instance.toDecimal("MMDCXLVIII"));
        assertEquals(2649, instance.toDecimal("MMDCXLIX"));
        assertEquals(2650, instance.toDecimal("MMDCL"));

        assertEquals(2651, instance.toDecimal("MMDCLI"));
        assertEquals(2652, instance.toDecimal("MMDCLII"));
        assertEquals(2653, instance.toDecimal("MMDCLIII"));
        assertEquals(2654, instance.toDecimal("MMDCLIV"));
        assertEquals(2655, instance.toDecimal("MMDCLV"));
        assertEquals(2656, instance.toDecimal("MMDCLVI"));
        assertEquals(2657, instance.toDecimal("MMDCLVII"));
        assertEquals(2658, instance.toDecimal("MMDCLVIII"));
        assertEquals(2659, instance.toDecimal("MMDCLIX"));
        assertEquals(2660, instance.toDecimal("MMDCLX"));

        assertEquals(2661, instance.toDecimal("MMDCLXI"));
        assertEquals(2662, instance.toDecimal("MMDCLXII"));
        assertEquals(2663, instance.toDecimal("MMDCLXIII"));
        assertEquals(2664, instance.toDecimal("MMDCLXIV"));
        assertEquals(2665, instance.toDecimal("MMDCLXV"));
        assertEquals(2666, instance.toDecimal("MMDCLXVI"));
        assertEquals(2667, instance.toDecimal("MMDCLXVII"));
        assertEquals(2668, instance.toDecimal("MMDCLXVIII"));
        assertEquals(2669, instance.toDecimal("MMDCLXIX"));
        assertEquals(2670, instance.toDecimal("MMDCLXX"));

        assertEquals(2671, instance.toDecimal("MMDCLXXI"));
        assertEquals(2672, instance.toDecimal("MMDCLXXII"));
        assertEquals(2673, instance.toDecimal("MMDCLXXIII"));
        assertEquals(2674, instance.toDecimal("MMDCLXXIV"));
        assertEquals(2675, instance.toDecimal("MMDCLXXV"));
        assertEquals(2676, instance.toDecimal("MMDCLXXVI"));
        assertEquals(2677, instance.toDecimal("MMDCLXXVII"));
        assertEquals(2678, instance.toDecimal("MMDCLXXVIII"));
        assertEquals(2679, instance.toDecimal("MMDCLXXIX"));
        assertEquals(2680, instance.toDecimal("MMDCLXXX"));

        assertEquals(2681, instance.toDecimal("MMDCLXXXI"));
        assertEquals(2682, instance.toDecimal("MMDCLXXXII"));
        assertEquals(2683, instance.toDecimal("MMDCLXXXIII"));
        assertEquals(2684, instance.toDecimal("MMDCLXXXIV"));
        assertEquals(2685, instance.toDecimal("MMDCLXXXV"));
        assertEquals(2686, instance.toDecimal("MMDCLXXXVI"));
        assertEquals(2687, instance.toDecimal("MMDCLXXXVII"));
        assertEquals(2688, instance.toDecimal("MMDCLXXXVIII"));
        assertEquals(2689, instance.toDecimal("MMDCLXXXIX"));
        assertEquals(2690, instance.toDecimal("MMDCXC"));

        assertEquals(2691, instance.toDecimal("MMDCXCI"));
        assertEquals(2692, instance.toDecimal("MMDCXCII"));
        assertEquals(2693, instance.toDecimal("MMDCXCIII"));
        assertEquals(2694, instance.toDecimal("MMDCXCIV"));
        assertEquals(2695, instance.toDecimal("MMDCXCV"));
        assertEquals(2696, instance.toDecimal("MMDCXCVI"));
        assertEquals(2697, instance.toDecimal("MMDCXCVII"));
        assertEquals(2698, instance.toDecimal("MMDCXCVIII"));
        assertEquals(2699, instance.toDecimal("MMDCXCIX"));
        assertEquals(2700, instance.toDecimal("MMDCC"));

        assertEquals(2701, instance.toDecimal("MMDCCI"));
        assertEquals(2702, instance.toDecimal("MMDCCII"));
        assertEquals(2703, instance.toDecimal("MMDCCIII"));
        assertEquals(2704, instance.toDecimal("MMDCCIV"));
        assertEquals(2705, instance.toDecimal("MMDCCV"));
        assertEquals(2706, instance.toDecimal("MMDCCVI"));
        assertEquals(2707, instance.toDecimal("MMDCCVII"));
        assertEquals(2708, instance.toDecimal("MMDCCVIII"));
        assertEquals(2709, instance.toDecimal("MMDCCIX"));
        assertEquals(2710, instance.toDecimal("MMDCCX"));

        assertEquals(2711, instance.toDecimal("MMDCCXI"));
        assertEquals(2712, instance.toDecimal("MMDCCXII"));
        assertEquals(2713, instance.toDecimal("MMDCCXIII"));
        assertEquals(2714, instance.toDecimal("MMDCCXIV"));
        assertEquals(2715, instance.toDecimal("MMDCCXV"));
        assertEquals(2716, instance.toDecimal("MMDCCXVI"));
        assertEquals(2717, instance.toDecimal("MMDCCXVII"));
        assertEquals(2718, instance.toDecimal("MMDCCXVIII"));
        assertEquals(2719, instance.toDecimal("MMDCCXIX"));
        assertEquals(2720, instance.toDecimal("MMDCCXX"));

        assertEquals(2721, instance.toDecimal("MMDCCXXI"));
        assertEquals(2722, instance.toDecimal("MMDCCXXII"));
        assertEquals(2723, instance.toDecimal("MMDCCXXIII"));
        assertEquals(2724, instance.toDecimal("MMDCCXXIV"));
        assertEquals(2725, instance.toDecimal("MMDCCXXV"));
        assertEquals(2726, instance.toDecimal("MMDCCXXVI"));
        assertEquals(2727, instance.toDecimal("MMDCCXXVII"));
        assertEquals(2728, instance.toDecimal("MMDCCXXVIII"));
        assertEquals(2729, instance.toDecimal("MMDCCXXIX"));
        assertEquals(2730, instance.toDecimal("MMDCCXXX"));

        assertEquals(2731, instance.toDecimal("MMDCCXXXI"));
        assertEquals(2732, instance.toDecimal("MMDCCXXXII"));
        assertEquals(2733, instance.toDecimal("MMDCCXXXIII"));
        assertEquals(2734, instance.toDecimal("MMDCCXXXIV"));
        assertEquals(2735, instance.toDecimal("MMDCCXXXV"));
        assertEquals(2736, instance.toDecimal("MMDCCXXXVI"));
        assertEquals(2737, instance.toDecimal("MMDCCXXXVII"));
        assertEquals(2738, instance.toDecimal("MMDCCXXXVIII"));
        assertEquals(2739, instance.toDecimal("MMDCCXXXIX"));
        assertEquals(2740, instance.toDecimal("MMDCCXL"));

        assertEquals(2741, instance.toDecimal("MMDCCXLI"));
        assertEquals(2742, instance.toDecimal("MMDCCXLII"));
        assertEquals(2743, instance.toDecimal("MMDCCXLIII"));
        assertEquals(2744, instance.toDecimal("MMDCCXLIV"));
        assertEquals(2745, instance.toDecimal("MMDCCXLV"));
        assertEquals(2746, instance.toDecimal("MMDCCXLVI"));
        assertEquals(2747, instance.toDecimal("MMDCCXLVII"));
        assertEquals(2748, instance.toDecimal("MMDCCXLVIII"));
        assertEquals(2749, instance.toDecimal("MMDCCXLIX"));
        assertEquals(2750, instance.toDecimal("MMDCCL"));

        assertEquals(2751, instance.toDecimal("MMDCCLI"));
        assertEquals(2752, instance.toDecimal("MMDCCLII"));
        assertEquals(2753, instance.toDecimal("MMDCCLIII"));
        assertEquals(2754, instance.toDecimal("MMDCCLIV"));
        assertEquals(2755, instance.toDecimal("MMDCCLV"));
        assertEquals(2756, instance.toDecimal("MMDCCLVI"));
        assertEquals(2757, instance.toDecimal("MMDCCLVII"));
        assertEquals(2758, instance.toDecimal("MMDCCLVIII"));
        assertEquals(2759, instance.toDecimal("MMDCCLIX"));
        assertEquals(2760, instance.toDecimal("MMDCCLX"));

        assertEquals(2761, instance.toDecimal("MMDCCLXI"));
        assertEquals(2762, instance.toDecimal("MMDCCLXII"));
        assertEquals(2763, instance.toDecimal("MMDCCLXIII"));
        assertEquals(2764, instance.toDecimal("MMDCCLXIV"));
        assertEquals(2765, instance.toDecimal("MMDCCLXV"));
        assertEquals(2766, instance.toDecimal("MMDCCLXVI"));
        assertEquals(2767, instance.toDecimal("MMDCCLXVII"));
        assertEquals(2768, instance.toDecimal("MMDCCLXVIII"));
        assertEquals(2769, instance.toDecimal("MMDCCLXIX"));
        assertEquals(2770, instance.toDecimal("MMDCCLXX"));

        assertEquals(2771, instance.toDecimal("MMDCCLXXI"));
        assertEquals(2772, instance.toDecimal("MMDCCLXXII"));
        assertEquals(2773, instance.toDecimal("MMDCCLXXIII"));
        assertEquals(2774, instance.toDecimal("MMDCCLXXIV"));
        assertEquals(2775, instance.toDecimal("MMDCCLXXV"));
        assertEquals(2776, instance.toDecimal("MMDCCLXXVI"));
        assertEquals(2777, instance.toDecimal("MMDCCLXXVII"));
        assertEquals(2778, instance.toDecimal("MMDCCLXXVIII"));
        assertEquals(2779, instance.toDecimal("MMDCCLXXIX"));
        assertEquals(2780, instance.toDecimal("MMDCCLXXX"));

        assertEquals(2781, instance.toDecimal("MMDCCLXXXI"));
        assertEquals(2782, instance.toDecimal("MMDCCLXXXII"));
        assertEquals(2783, instance.toDecimal("MMDCCLXXXIII"));
        assertEquals(2784, instance.toDecimal("MMDCCLXXXIV"));
        assertEquals(2785, instance.toDecimal("MMDCCLXXXV"));
        assertEquals(2786, instance.toDecimal("MMDCCLXXXVI"));
        assertEquals(2787, instance.toDecimal("MMDCCLXXXVII"));
        assertEquals(2788, instance.toDecimal("MMDCCLXXXVIII"));
        assertEquals(2789, instance.toDecimal("MMDCCLXXXIX"));
        assertEquals(2790, instance.toDecimal("MMDCCXC"));

        assertEquals(2791, instance.toDecimal("MMDCCXCI"));
        assertEquals(2792, instance.toDecimal("MMDCCXCII"));
        assertEquals(2793, instance.toDecimal("MMDCCXCIII"));
        assertEquals(2794, instance.toDecimal("MMDCCXCIV"));
        assertEquals(2795, instance.toDecimal("MMDCCXCV"));
        assertEquals(2796, instance.toDecimal("MMDCCXCVI"));
        assertEquals(2797, instance.toDecimal("MMDCCXCVII"));
        assertEquals(2798, instance.toDecimal("MMDCCXCVIII"));
        assertEquals(2799, instance.toDecimal("MMDCCXCIX"));
        assertEquals(2800, instance.toDecimal("MMDCCC"));

        assertEquals(2801, instance.toDecimal("MMDCCCI"));
        assertEquals(2802, instance.toDecimal("MMDCCCII"));
        assertEquals(2803, instance.toDecimal("MMDCCCIII"));
        assertEquals(2804, instance.toDecimal("MMDCCCIV"));
        assertEquals(2805, instance.toDecimal("MMDCCCV"));
        assertEquals(2806, instance.toDecimal("MMDCCCVI"));
        assertEquals(2807, instance.toDecimal("MMDCCCVII"));
        assertEquals(2808, instance.toDecimal("MMDCCCVIII"));
        assertEquals(2809, instance.toDecimal("MMDCCCIX"));
        assertEquals(2810, instance.toDecimal("MMDCCCX"));

        assertEquals(2811, instance.toDecimal("MMDCCCXI"));
        assertEquals(2812, instance.toDecimal("MMDCCCXII"));
        assertEquals(2813, instance.toDecimal("MMDCCCXIII"));
        assertEquals(2814, instance.toDecimal("MMDCCCXIV"));
        assertEquals(2815, instance.toDecimal("MMDCCCXV"));
        assertEquals(2816, instance.toDecimal("MMDCCCXVI"));
        assertEquals(2817, instance.toDecimal("MMDCCCXVII"));
        assertEquals(2818, instance.toDecimal("MMDCCCXVIII"));
        assertEquals(2819, instance.toDecimal("MMDCCCXIX"));
        assertEquals(2820, instance.toDecimal("MMDCCCXX"));

        assertEquals(2821, instance.toDecimal("MMDCCCXXI"));
        assertEquals(2822, instance.toDecimal("MMDCCCXXII"));
        assertEquals(2823, instance.toDecimal("MMDCCCXXIII"));
        assertEquals(2824, instance.toDecimal("MMDCCCXXIV"));
        assertEquals(2825, instance.toDecimal("MMDCCCXXV"));
        assertEquals(2826, instance.toDecimal("MMDCCCXXVI"));
        assertEquals(2827, instance.toDecimal("MMDCCCXXVII"));
        assertEquals(2828, instance.toDecimal("MMDCCCXXVIII"));
        assertEquals(2829, instance.toDecimal("MMDCCCXXIX"));
        assertEquals(2830, instance.toDecimal("MMDCCCXXX"));

        assertEquals(2831, instance.toDecimal("MMDCCCXXXI"));
        assertEquals(2832, instance.toDecimal("MMDCCCXXXII"));
        assertEquals(2833, instance.toDecimal("MMDCCCXXXIII"));
        assertEquals(2834, instance.toDecimal("MMDCCCXXXIV"));
        assertEquals(2835, instance.toDecimal("MMDCCCXXXV"));
        assertEquals(2836, instance.toDecimal("MMDCCCXXXVI"));
        assertEquals(2837, instance.toDecimal("MMDCCCXXXVII"));
        assertEquals(2838, instance.toDecimal("MMDCCCXXXVIII"));
        assertEquals(2839, instance.toDecimal("MMDCCCXXXIX"));
        assertEquals(2840, instance.toDecimal("MMDCCCXL"));

        assertEquals(2841, instance.toDecimal("MMDCCCXLI"));
        assertEquals(2842, instance.toDecimal("MMDCCCXLII"));
        assertEquals(2843, instance.toDecimal("MMDCCCXLIII"));
        assertEquals(2844, instance.toDecimal("MMDCCCXLIV"));
        assertEquals(2845, instance.toDecimal("MMDCCCXLV"));
        assertEquals(2846, instance.toDecimal("MMDCCCXLVI"));
        assertEquals(2847, instance.toDecimal("MMDCCCXLVII"));
        assertEquals(2848, instance.toDecimal("MMDCCCXLVIII"));
        assertEquals(2849, instance.toDecimal("MMDCCCXLIX"));
        assertEquals(2850, instance.toDecimal("MMDCCCL"));

        assertEquals(2851, instance.toDecimal("MMDCCCLI"));
        assertEquals(2852, instance.toDecimal("MMDCCCLII"));
        assertEquals(2853, instance.toDecimal("MMDCCCLIII"));
        assertEquals(2854, instance.toDecimal("MMDCCCLIV"));
        assertEquals(2855, instance.toDecimal("MMDCCCLV"));
        assertEquals(2856, instance.toDecimal("MMDCCCLVI"));
        assertEquals(2857, instance.toDecimal("MMDCCCLVII"));
        assertEquals(2858, instance.toDecimal("MMDCCCLVIII"));
        assertEquals(2859, instance.toDecimal("MMDCCCLIX"));
        assertEquals(2860, instance.toDecimal("MMDCCCLX"));

        assertEquals(2861, instance.toDecimal("MMDCCCLXI"));
        assertEquals(2862, instance.toDecimal("MMDCCCLXII"));
        assertEquals(2863, instance.toDecimal("MMDCCCLXIII"));
        assertEquals(2864, instance.toDecimal("MMDCCCLXIV"));
        assertEquals(2865, instance.toDecimal("MMDCCCLXV"));
        assertEquals(2866, instance.toDecimal("MMDCCCLXVI"));
        assertEquals(2867, instance.toDecimal("MMDCCCLXVII"));
        assertEquals(2868, instance.toDecimal("MMDCCCLXVIII"));
        assertEquals(2869, instance.toDecimal("MMDCCCLXIX"));
        assertEquals(2870, instance.toDecimal("MMDCCCLXX"));

        assertEquals(2871, instance.toDecimal("MMDCCCLXXI"));
        assertEquals(2872, instance.toDecimal("MMDCCCLXXII"));
        assertEquals(2873, instance.toDecimal("MMDCCCLXXIII"));
        assertEquals(2874, instance.toDecimal("MMDCCCLXXIV"));
        assertEquals(2875, instance.toDecimal("MMDCCCLXXV"));
        assertEquals(2876, instance.toDecimal("MMDCCCLXXVI"));
        assertEquals(2877, instance.toDecimal("MMDCCCLXXVII"));
        assertEquals(2878, instance.toDecimal("MMDCCCLXXVIII"));
        assertEquals(2879, instance.toDecimal("MMDCCCLXXIX"));
        assertEquals(2880, instance.toDecimal("MMDCCCLXXX"));

        assertEquals(2881, instance.toDecimal("MMDCCCLXXXI"));
        assertEquals(2882, instance.toDecimal("MMDCCCLXXXII"));
        assertEquals(2883, instance.toDecimal("MMDCCCLXXXIII"));
        assertEquals(2884, instance.toDecimal("MMDCCCLXXXIV"));
        assertEquals(2885, instance.toDecimal("MMDCCCLXXXV"));
        assertEquals(2886, instance.toDecimal("MMDCCCLXXXVI"));
        assertEquals(2887, instance.toDecimal("MMDCCCLXXXVII"));
        assertEquals(2888, instance.toDecimal("MMDCCCLXXXVIII"));
        assertEquals(2889, instance.toDecimal("MMDCCCLXXXIX"));
        assertEquals(2890, instance.toDecimal("MMDCCCXC"));

        assertEquals(2891, instance.toDecimal("MMDCCCXCI"));
        assertEquals(2892, instance.toDecimal("MMDCCCXCII"));
        assertEquals(2893, instance.toDecimal("MMDCCCXCIII"));
        assertEquals(2894, instance.toDecimal("MMDCCCXCIV"));
        assertEquals(2895, instance.toDecimal("MMDCCCXCV"));
        assertEquals(2896, instance.toDecimal("MMDCCCXCVI"));
        assertEquals(2897, instance.toDecimal("MMDCCCXCVII"));
        assertEquals(2898, instance.toDecimal("MMDCCCXCVIII"));
        assertEquals(2899, instance.toDecimal("MMDCCCXCIX"));
        assertEquals(2900, instance.toDecimal("MMCM"));

        assertEquals(2901, instance.toDecimal("MMCMI"));
        assertEquals(2902, instance.toDecimal("MMCMII"));
        assertEquals(2903, instance.toDecimal("MMCMIII"));
        assertEquals(2904, instance.toDecimal("MMCMIV"));
        assertEquals(2905, instance.toDecimal("MMCMV"));
        assertEquals(2906, instance.toDecimal("MMCMVI"));
        assertEquals(2907, instance.toDecimal("MMCMVII"));
        assertEquals(2908, instance.toDecimal("MMCMVIII"));
        assertEquals(2909, instance.toDecimal("MMCMIX"));
        assertEquals(2910, instance.toDecimal("MMCMX"));

        assertEquals(2911, instance.toDecimal("MMCMXI"));
        assertEquals(2912, instance.toDecimal("MMCMXII"));
        assertEquals(2913, instance.toDecimal("MMCMXIII"));
        assertEquals(2914, instance.toDecimal("MMCMXIV"));
        assertEquals(2915, instance.toDecimal("MMCMXV"));
        assertEquals(2916, instance.toDecimal("MMCMXVI"));
        assertEquals(2917, instance.toDecimal("MMCMXVII"));
        assertEquals(2918, instance.toDecimal("MMCMXVIII"));
        assertEquals(2919, instance.toDecimal("MMCMXIX"));
        assertEquals(2920, instance.toDecimal("MMCMXX"));

        assertEquals(2921, instance.toDecimal("MMCMXXI"));
        assertEquals(2922, instance.toDecimal("MMCMXXII"));
        assertEquals(2923, instance.toDecimal("MMCMXXIII"));
        assertEquals(2924, instance.toDecimal("MMCMXXIV"));
        assertEquals(2925, instance.toDecimal("MMCMXXV"));
        assertEquals(2926, instance.toDecimal("MMCMXXVI"));
        assertEquals(2927, instance.toDecimal("MMCMXXVII"));
        assertEquals(2928, instance.toDecimal("MMCMXXVIII"));
        assertEquals(2929, instance.toDecimal("MMCMXXIX"));
        assertEquals(2930, instance.toDecimal("MMCMXXX"));

        assertEquals(2931, instance.toDecimal("MMCMXXXI"));
        assertEquals(2932, instance.toDecimal("MMCMXXXII"));
        assertEquals(2933, instance.toDecimal("MMCMXXXIII"));
        assertEquals(2934, instance.toDecimal("MMCMXXXIV"));
        assertEquals(2935, instance.toDecimal("MMCMXXXV"));
        assertEquals(2936, instance.toDecimal("MMCMXXXVI"));
        assertEquals(2937, instance.toDecimal("MMCMXXXVII"));
        assertEquals(2938, instance.toDecimal("MMCMXXXVIII"));
        assertEquals(2939, instance.toDecimal("MMCMXXXIX"));
        assertEquals(2940, instance.toDecimal("MMCMXL"));

        assertEquals(2941, instance.toDecimal("MMCMXLI"));
        assertEquals(2942, instance.toDecimal("MMCMXLII"));
        assertEquals(2943, instance.toDecimal("MMCMXLIII"));
        assertEquals(2944, instance.toDecimal("MMCMXLIV"));
        assertEquals(2945, instance.toDecimal("MMCMXLV"));
        assertEquals(2946, instance.toDecimal("MMCMXLVI"));
        assertEquals(2947, instance.toDecimal("MMCMXLVII"));
        assertEquals(2948, instance.toDecimal("MMCMXLVIII"));
        assertEquals(2949, instance.toDecimal("MMCMXLIX"));
        assertEquals(2950, instance.toDecimal("MMCML"));

        assertEquals(2951, instance.toDecimal("MMCMLI"));
        assertEquals(2952, instance.toDecimal("MMCMLII"));
        assertEquals(2953, instance.toDecimal("MMCMLIII"));
        assertEquals(2954, instance.toDecimal("MMCMLIV"));
        assertEquals(2955, instance.toDecimal("MMCMLV"));
        assertEquals(2956, instance.toDecimal("MMCMLVI"));
        assertEquals(2957, instance.toDecimal("MMCMLVII"));
        assertEquals(2958, instance.toDecimal("MMCMLVIII"));
        assertEquals(2959, instance.toDecimal("MMCMLIX"));
        assertEquals(2960, instance.toDecimal("MMCMLX"));

        assertEquals(2961, instance.toDecimal("MMCMLXI"));
        assertEquals(2962, instance.toDecimal("MMCMLXII"));
        assertEquals(2963, instance.toDecimal("MMCMLXIII"));
        assertEquals(2964, instance.toDecimal("MMCMLXIV"));
        assertEquals(2965, instance.toDecimal("MMCMLXV"));
        assertEquals(2966, instance.toDecimal("MMCMLXVI"));
        assertEquals(2967, instance.toDecimal("MMCMLXVII"));
        assertEquals(2968, instance.toDecimal("MMCMLXVIII"));
        assertEquals(2969, instance.toDecimal("MMCMLXIX"));
        assertEquals(2970, instance.toDecimal("MMCMLXX"));

        assertEquals(2971, instance.toDecimal("MMCMLXXI"));
        assertEquals(2972, instance.toDecimal("MMCMLXXII"));
        assertEquals(2973, instance.toDecimal("MMCMLXXIII"));
        assertEquals(2974, instance.toDecimal("MMCMLXXIV"));
        assertEquals(2975, instance.toDecimal("MMCMLXXV"));
        assertEquals(2976, instance.toDecimal("MMCMLXXVI"));
        assertEquals(2977, instance.toDecimal("MMCMLXXVII"));
        assertEquals(2978, instance.toDecimal("MMCMLXXVIII"));
        assertEquals(2979, instance.toDecimal("MMCMLXXIX"));
        assertEquals(2980, instance.toDecimal("MMCMLXXX"));

        assertEquals(2981, instance.toDecimal("MMCMLXXXI"));
        assertEquals(2982, instance.toDecimal("MMCMLXXXII"));
        assertEquals(2983, instance.toDecimal("MMCMLXXXIII"));
        assertEquals(2984, instance.toDecimal("MMCMLXXXIV"));
        assertEquals(2985, instance.toDecimal("MMCMLXXXV"));
        assertEquals(2986, instance.toDecimal("MMCMLXXXVI"));
        assertEquals(2987, instance.toDecimal("MMCMLXXXVII"));
        assertEquals(2988, instance.toDecimal("MMCMLXXXVIII"));
        assertEquals(2989, instance.toDecimal("MMCMLXXXIX"));
        assertEquals(2990, instance.toDecimal("MMCMXC"));

        assertEquals(2991, instance.toDecimal("MMCMXCI"));
        assertEquals(2992, instance.toDecimal("MMCMXCII"));
        assertEquals(2993, instance.toDecimal("MMCMXCIII"));
        assertEquals(2994, instance.toDecimal("MMCMXCIV"));
        assertEquals(2995, instance.toDecimal("MMCMXCV"));
        assertEquals(2996, instance.toDecimal("MMCMXCVI"));
        assertEquals(2997, instance.toDecimal("MMCMXCVII"));
        assertEquals(2998, instance.toDecimal("MMCMXCVIII"));
        assertEquals(2999, instance.toDecimal("MMCMXCIX"));
        assertEquals(3000, instance.toDecimal("MMM"));
        assertEquals(3999, instance.toDecimal("MMMCMXCIX"));
        assertEquals(4000, instance.toDecimal("MMMM"));
    }

    /**
     * Test of esValido method, of class NumeroRomano.
     */
    @Test
    public void testEsValido() {
        System.out.println("esValido");
        NumeroRomano instance = new NumeroRomano();
        assertTrue(instance.esValido("MCMXCIX"));
        assertFalse(instance.esValido("IIII"));
        assertFalse(instance.esValido("LL"));
    }
}