
public class Matrix5x7ROM {
//	
//	5 x 7 Matrix
//	Bitnummerierung:
//	
//	01234
//	   *  0x08
//	  **  0x0c
//	 * *  0x0a
//	*  *  0x09
//	***** 0x1F
//	   *  0x08
//	   *  0x08
//	
	public static final byte[][] M5x7 = { //
			{ 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 }, //
			{ 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x04 }, // !
			{ 0x0A, 0x0A, 0x0a, 0x00, 0x00, 0x00, 0x00 }, // "
			{ 0x0A, 0x0A, 0x1F, 0x0A, 0x1f, 0x0A, 0x0A }, // #
			{ 0x04, 0x1e, 0x05, 0x0e, 0x14, 0x0F, 0x04 }, // $
			{ 0x03, 0x13, 0x08, 0x04, 0x02, 0x19, 0x18 }, // %
			{ 0x06, 0x09, 0x05, 0x02, 0x15, 0x09, 0x16 }, // &
			{ 0x06, 0x04, 0x02, 0x00, 0x00, 0x00, 0x00 }, // '
			{ 0x08, 0x04, 0x02, 0x02, 0x02, 0x04, 0x08 }, // (
			{ 0x02, 0x04, 0x08, 0x08, 0x08, 0x04, 0x02 }, // )
			{ 0x00, 0x04, 0x15, 0x0e, 0x15, 0x04, 0x00 }, // *
			{ 0x00, 0x04, 0x04, 0x1f, 0x04, 0x04, 0x00 }, // +
			{ 0x00, 0x00, 0x00, 0x00, 0x06, 0x04, 0x02 }, // ,
			{ 0x00, 0x00, 0x00, 0x1f, 0x00, 0x00, 0x00 }, // -
			{ 0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x06 }, // .
			{ 0x00, 0x10, 0x08, 0x04, 0x02, 0x01, 0x00 }, // /
			{ 0x0e, 0x11, 0x11, 0x11, 0x11, 0x11, 0x0e }, // 0
			{ 0x04, 0x06, 0x04, 0x04, 0x04, 0x04, 0x0e }, // 1
			{ 0x0e, 0x11, 0x10, 0x08, 0x04, 0x02, 0x1f }, // 2
			{ 0x1f, 0x08, 0x04, 0x08, 0x10, 0x11, 0x0e }, // 3
			{ 0x08, 0x0c, 0x0a, 0x09, 0x1f, 0x08, 0x08 }, // 4
			{ 0x1f, 0x01, 0x0f, 0x10, 0x10, 0x11, 0x0e }, // 5
			{ 0x0c, 0x02, 0x01, 0x0f, 0x11, 0x11, 0x0e }, // 6
			{ 0x1f, 0x10, 0x08, 0x04, 0x02, 0x02, 0x02 }, // 7
			{ 0x0e, 0x11, 0x11, 0x0e, 0x11, 0x11, 0x0e }, // 8
			{ 0x0E, 0x11, 0x11, 0x1e, 0x10, 0x08, 0x06 }, // 9
			{ 0x00, 0x06, 0x06, 0x00, 0x06, 0x06, 0x00 }, // :
			{ 0x00, 0x06, 0x06, 0x00, 0x06, 0x04, 0x02 }, // ;
			{ 0x08, 0x04, 0x02, 0x01, 0x02, 0x04, 0x08 }, // <
			{ 0x00, 0x00, 0x1f, 0x00, 0x1f, 0x00, 0x00 }, // =
			{ 0x02, 0x04, 0x08, 0x10, 0x08, 0x04, 0x02 }, // >
			{ 0x0e, 0x11, 0x10, 0x08, 0x04, 0x00, 0x04 }, // ?
			{ 0x0e, 0x11, 0x10, 0x16, 0x15, 0x15, 0x0e }, // @
			{ 0x0e, 0x11, 0x11, 0x11, 0x1f, 0x11, 0x11 }, // A
			{ 0x0f, 0x11, 0x11, 0x0e, 0x11, 0x11, 0x0f }, // B
			{ 0x0e, 0x11, 0x01, 0x01, 0x01, 0x11, 0x0e }, // C
			{ 0x07, 0x09, 0x11, 0x11, 0x11, 0x09, 0x07 }, // D
			{ 0x1f, 0x01, 0x01, 0x0f, 0x01, 0x01, 0x1f }, // E
			{ 0x1f, 0x01, 0x01, 0x0f, 0x01, 0x01, 0x01 }, // F
			{ 0x0e, 0x01, 0x01, 0x1d, 0x11, 0x11, 0x1e }, // G
			{ 0x11, 0x11, 0x11, 0x1f, 0x11, 0x11, 0x11 }, // H
			{ 0x0e, 0x04, 0x04, 0x04, 0x04, 0x04, 0x0e }, // I
			{ 0x1c, 0x08, 0x08, 0x08, 0x08, 0x09, 0x06 }, // J
			{ 0x11, 0x09, 0x05, 0x03, 0x03, 0x09, 0x11 }, // K
			{ 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x1f }, // L
			{ 0x11, 0x1b, 0x15, 0x11, 0x11, 0x11, 0x11 }, // M
			{ 0x11, 0x11, 0x13, 0x15, 0x19, 0x11, 0x11 }, // N
			{ 0x0e, 0x11, 0x11, 0x11, 0x11, 0x11, 0x0e }, // O
			{ 0x0f, 0x11, 0x11, 0x0f, 0x01, 0x01, 0x01 }, // P
			{ 0x0e, 0x11, 0x11, 0x11, 0x15, 0x09, 0x16 }, // Q
			{ 0x0f, 0x11, 0x11, 0x0f, 0x05, 0x09, 0x11 }, // R
			{ 0x1e, 0x01, 0x01, 0x0e, 0x10, 0x10, 0x0f }, // S
			{ 0x1f, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04 }, // T
			{ 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x0e }, // U
			{ 0x11, 0x11, 0x11, 0x11, 0x11, 0x0a, 0x04 }, // V
			{ 0x11, 0x11, 0x11, 0x15, 0x15, 0x15, 0x0a }, // W
			{ 0x11, 0x11, 0x0a, 0x04, 0x0a, 0x11, 0x11 }, // X
			{ 0x11, 0x11, 0x11, 0x0a, 0x04, 0x04, 0x04 }, // Y
			{ 0x1f, 0x10, 0x08, 0x04, 0x02, 0x01, 0x1f }, // Z
			{ 0x0e, 0x02, 0x02, 0x02, 0x02, 0x02, 0x0e }, // [
			{ 0x11, 0x0a, 0x1f, 0x04, 0x1f, 0x04, 0x04 }, // ¥ Sonderbehandlung
			{ 0x0e, 0x08, 0x08, 0x08, 0x08, 0x08, 0x0e }, // ]
			{ 0x04, 0x0a, 0x11, 0x00, 0x00, 0x00, 0x00 }, // ^
			{ 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x1f }, // _
			{ 0x02, 0x04, 0x08, 0x00, 0x00, 0x00, 0x00 }, // `
			{ 0x00, 0x00, 0x0e, 0x10, 0x1e, 0x11, 0x1e }, // a
			{ 0x01, 0x01, 0x0d, 0x13, 0x11, 0x11, 0x0f }, // b
			{ 0x00, 0x00, 0x0e, 0x01, 0x01, 0x11, 0x0e }, // c
			{ 0x10, 0x10, 0x16, 0x19, 0x11, 0x11, 0x1e }, // d
			{ 0x00, 0x00, 0x0e, 0x11, 0x1f, 0x01, 0x0e }, // e
			{ 0x0c, 0x12, 0x02, 0x07, 0x02, 0x02, 0x02 }, // f
			{ 0x00, 0x1e, 0x11, 0x11, 0x1e, 0x10, 0x0e }, // g
			{ 0x01, 0x01, 0x0d, 0x13, 0x11, 0x11, 0x11 }, // h
			{ 0x04, 0x00, 0x06, 0x04, 0x04, 0x04, 0x0e }, // i
			{ 0x08, 0x00, 0x0c, 0x08, 0x08, 0x09, 0x06 }, // j
			{ 0x01, 0x01, 0x09, 0x05, 0x03, 0x05, 0x09 }, // k
			{ 0x06, 0x04, 0x04, 0x04, 0x04, 0x04, 0x0e }, // l
			{ 0x00, 0x00, 0x0b, 0x15, 0x15, 0x11, 0x11 }, // m
			{ 0x00, 0x00, 0x0d, 0x13, 0x11, 0x11, 0x11 }, // n
			{ 0x00, 0x00, 0x0e, 0x11, 0x11, 0x11, 0x0e }, // o
			{ 0x00, 0x00, 0x0f, 0x11, 0x0f, 0x01, 0x01 }, // p
			{ 0x00, 0x00, 0x16, 0x19, 0x1e, 0x10, 0x10 }, // q
			{ 0x00, 0x00, 0x0d, 0x13, 0x01, 0x01, 0x01 }, // r
			{ 0x00, 0x00, 0x0e, 0x01, 0x0e, 0x10, 0x0f }, // s
			{ 0x02, 0x02, 0x07, 0x02, 0x02, 0x12, 0x0c }, // t
			{ 0x00, 0x00, 0x11, 0x11, 0x11, 0x19, 0x16 }, // u
			{ 0x00, 0x00, 0x11, 0x11, 0x11, 0x0a, 0x04 }, // v
			{ 0x00, 0x00, 0x11, 0x11, 0x15, 0x15, 0x0a }, // w
			{ 0x00, 0x00, 0x11, 0x0a, 0x04, 0x0a, 0x11 }, // x
			{ 0x00, 0x00, 0x11, 0x11, 0x1e, 0x10, 0x0e }, // y
			{ 0x00, 0x00, 0x1f, 0x08, 0x04, 0x02, 0x1f } // z
	};
}
