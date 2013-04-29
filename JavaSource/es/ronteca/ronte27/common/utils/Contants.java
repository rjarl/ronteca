  /** ENUM OPERACIONES ACTIONS SEA*/
		public static enum OPERACIONES{
									PAGINAR,
									ACEPTAR,
									VOLVER,
									GUARDAR,
									EXPORTAR,
									MODA,
									FORMULA,
									POLIZA,
									USUARIO;
			/**
			 * Comprueba si el valor pasado es no de los enums definidos							
			 * @param val
			 * @return
			 */
			public static boolean contains(String val){
				OPERACIONES a;
				try{
					a = OPERACIONES.valueOf(val);
					return true;
				}catch(IllegalArgumentException e){
					return false;	
				}
			}
		}

    /**
		 * PLANTILLA DE ORDEN DE LOS CAMPOS
		 * @author E006724
		 *
		 */
		public enum CAMPOS_FORMULA{ // 
			WPOLIZA(1),		WMODA(2), 		METODO(3),
			WASEGURADO(4),	WNGARANTIA(5),	OPCIO2(6),		
			WGRUPO(7),		WGARANT(8),		WEDADTAR(9),
			WAPENDICE(10),	ESTADO(11),		WEDAD_RK(12),//WEDAD-RK pero JAVA no permite usar GUION..
			WRAMO(13),		WORIGEN(14),	WDUPPLAZO(15),
			
			WEFECTO(16),	WFNAC1(17),		WPCREC1(18),
			WDUGAR(19),		WSEXO1(20),		WTCREC1(21),
			WDURMES(22),	WFECHA2(23),	WFCREC1(24),
			WDURDIA(25),	WSEXO2(26),		WFECHA1(27),
			WDUPPR(28),		WCOREDAD(29),	WSECPRO(30),
			
			WIMPORT(31),	WDIFER(32),		WCAPRED(33),
			WTIPOIMP(34),	WDUREN(35),		WFERED(36),
			WMENOSGE(37),	WFORPA(38),		WCOMIS(39),
			WDESCUENTO(40),	WDUPAGOS(41),	WPSOBREP(42),
			WPORAUX1(43),	WGRIES(44),		WCSOBREP(45),
			
			WCTRSEG(46),	WPRIMA(47),		WFACTOR2(48),
			WCAPCIONP(49),	WCAPITAL1(50),	WFECHA3(51),
			WTIPOPRI(52),	WCAPITAL2(53),	WFECVTO(54),
			WTIPOSUC(55),	WFACTOR1(56),	/** INVENTADO */FFTARIF(57),
			WTIPPRO(58),	/* VACIO */		CODRET(60);
		    
		    private final short order;
		    private CAMPOS_FORMULA(int order){
		        this.order = Integer.valueOf(order).shortValue();
		    }
		    public static short getOrder(String val){
		    	CAMPOS_FORMULA a;
				try{
					a = CAMPOS_FORMULA.valueOf(val.replace("-", "_"));
					return a.order;
				}catch(IllegalArgumentException e){
					return 0;	
				}
		    }
		    
		}
