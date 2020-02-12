package com.test.usuario;

import com.test.usuario.encapsulacion.Inspeccion;
import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.encapsulacion.Usuario;
import com.test.usuario.enums.TipoUsuario;
import com.test.usuario.servicios.InspeccionService;
import com.test.usuario.servicios.ParadaService;
import com.test.usuario.servicios.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;

@SpringBootApplication
public class UsuarioApplication {

    public static void main(String[] args) {
        // SpringApplication.run(UsuarioApplication.class, args);
        ApplicationContext context = SpringApplication.run(UsuarioApplication.class, args);

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ParadaService paradaService = (ParadaService) context.getBean("paradaService");
        InspeccionService inspeccionService = (InspeccionService) context.getBean("inspeccionService");

        Usuario usuario = new Usuario(1234, 1234, TipoUsuario.OPERARIO, "Merlin");
        Usuario usuario1 = new Usuario(1111, 1111, TipoUsuario.CALIDAD, "Felix Alejandro Guzman Garcia");
        Usuario usuario2 = new Usuario(2222, 2222, TipoUsuario.MECANICO, "Alma Ramona Rosa Perez ");
        Usuario usuario3 = new Usuario(321, 321, TipoUsuario.FLOORHELPER, "Jose");
        Usuario usuario4 = new Usuario(123, 123, TipoUsuario.CALIDAD, "Perez");

        usuarioService.crear(usuario);
        usuarioService.crear(usuario1);
        usuarioService.crear(usuario2);
        usuarioService.crear(usuario3);
        usuarioService.crear(usuario4);

        Parada parada0 = new Parada(1132, "Finger Cigar");
        Parada parada1 = new Parada(1131, "Transfer Cigar");
        Parada parada2 = new Parada(1216, "Piñon de Transfer Cigar");
        Parada parada3 = new Parada(1133, "Head Disc");
        Parada parada4 = new Parada(1273, "Tranque del eje del transfer bunch");
        Parada parada5 = new Parada(1219, "Pin de transfer cigar");
        Parada parada6 = new Parada(1130, "Finger Bunch");
        Parada parada7 = new Parada(1129, "Transfer bunch");
        Parada parada8 = new Parada(1134, "Set De Rolos");
        Parada parada9 = new Parada(1270, "Tranque del set de rolos");
        Parada parada10 = new Parada(1135, "Knife Drop");
        Parada parada11 = new Parada(1136, "Collaring");
        Parada parada12 = new Parada(1137, "Plato");
        Parada parada13 = new Parada(1138, "Flag Knife");
        Parada parada14 = new Parada(1139, "Head Block");
        Parada parada15 = new Parada(1168, "Aguja");
        Parada parada16 = new Parada(1169, "Felpa de aguja");
        Parada parada17 = new Parada(1170, "Rod Bushing de la Aguja");
        Parada parada18 = new Parada(1211, "Exentrica de Aguja");
        Parada parada19 = new Parada(1252, "Calibración Felpa de Aguja");
        Parada parada20 = new Parada(1253, "Cambio Can roller de Aguja");
        Parada parada21 = new Parada(1212, "Brazo de Aguja");
        Parada parada22 = new Parada(1140, "Empujador Rolling Device");
        Parada parada23 = new Parada(1141, "Soporte Rolling Device");
        Parada parada24 = new Parada(1142, "Pulley arm Rolling Device");
        Parada parada25 = new Parada(1143, "Spring Rolling Device");
        Parada parada26 = new Parada(1184, "Nouzle");
        Parada parada27 = new Parada(1220, "Pin del Head Block");
        Parada parada28 = new Parada(1268, "Cambio de Roll Stud");
        Parada parada29 = new Parada(1171, "Paster Loop");
        Parada parada30 = new Parada(1185, "TORRE WRAPER");
        Parada parada31 = new Parada(1186, "Cuchillas");
        Parada parada32 = new Parada(1187, "Transfer wrapper");
        Parada parada33 = new Parada(1188, "Spring Transfer");
        Parada parada34 = new Parada(1274, "Tranque del paster loop");
        Parada parada35 = new Parada(1189, "Bandeja sistema alimentación");
        Parada parada36 = new Parada(1163, "Dardo");
        Parada parada37 = new Parada(1164, "Rodamientos del Rolo de Corte");
        Parada parada38 = new Parada(1165, "Felpas del Rolo de Corte");
        Parada parada39 = new Parada(1279, "Tranque de rolos de corte");
        Parada parada40 = new Parada(1280, "Tranque en la base de los rolo de corte.(AMF)");
        Parada parada41 = new Parada(1281, "Calibración carro rolos de corte ( Arenco ).");
        Parada parada42 = new Parada(1272, "Tranque de leva de rolos de corte");
        Parada parada43 = new Parada(1166, "Rolo De Corte");
        Parada parada44 = new Parada(1172, "En espera de atención mecánica");
        Parada parada45 = new Parada(1174, "Arreglo de Conveyor");
        Parada parada46 = new Parada(1175, "Descalibracion del Jaw Opening");
        Parada parada47 = new Parada(1177, "Spring tensor correa de clochet roto");
        Parada parada48 = new Parada(1178, "Spring del Crimper roto");
        Parada parada49 = new Parada(1179, "Correa rota");
        Parada parada50 = new Parada(1180, "Espera de Repuestos");
        Parada parada51 = new Parada(1190, "Máquina sometida a evaluación");
        Parada parada52 = new Parada(1191, "Carro transportador");
        Parada parada53 = new Parada(1192, "Fingers del carro transportador");
        Parada parada54 = new Parada(1193, "Plunyer");
        Parada parada55 = new Parada(1194, "Magazine");
        Parada parada56 = new Parada(1195, "Cuchillas del Magazine");
        Parada parada57 = new Parada(1196, "Transfer de Picadura");
        Parada parada58 = new Parada(1197, "Fingers del Transfer de Picadura");
        Parada parada59 = new Parada(1198, "Caja de Picadura");
        Parada parada60 = new Parada(1199, "Transfer Transportador de Capa");
        Parada parada61 = new Parada(1200, "Lona");
        Parada parada62 = new Parada(1201, "Calibración de los tiempos del Backend (los ceros)");
        Parada parada63 = new Parada(1217, "En espera de pieza desde máquinas herramientas");
        Parada parada64 = new Parada(1218, "Mal funcionamiento de Guardas");
        Parada parada65 = new Parada(1254, "Callibración de Clutch");
        Parada parada66 = new Parada(1221, "Maquina sometida a Reparacion");
        Parada parada67 = new Parada(1298, "Falla dispositivo/sistema para casquillos");
        Parada parada68 = new Parada(1283, "Tranque Jaw Opening.");
        Parada parada69 = new Parada(1278, "Tranque de levas");
        Parada parada70 = new Parada(1284, "Tranque del plato.");
        Parada parada71 = new Parada(1285, "Tranque de la manivela del clutch.");
        Parada parada72 = new Parada(1286, "Tranque del clutch.");
        Parada parada73 = new Parada(1269, "Calibración de Crimpers");
        Parada parada74 = new Parada(1202, "Carro rolador del cigarro");
        Parada parada75 = new Parada(1287, "Tranque en la base de los rolos de corte. (Backend)");
        Parada parada76 = new Parada(1288, "Tranque en el carro transportador de cigarro. (Backend)");
        Parada parada77 = new Parada(1289, "Tranque en el joke. (Backend)");
        Parada parada78 = new Parada(1290, "Tranque en el conveyor. (Backend)");
        Parada parada79 = new Parada(1291, "Rotura del pin de la cuchilla del magazine. (Backend)");
        Parada parada80 = new Parada(1292, "Rotura del pedal del freno. (Backend)");
        Parada parada81 = new Parada(1293, "Rotura del pin de protección de la máquina. (Backend)");
        Parada parada82 = new Parada(1294, "Calibración del pedal de freno. (Backend)");
        Parada parada83 = new Parada(1295, "Calibración de palanca de emergencia. (Backend)");
        Parada parada84 = new Parada(1203, "En espera de Técnico Eléctrico");
        Parada parada85 = new Parada(1204, "Falla en fusibles");
        Parada parada86 = new Parada(1205, "Falla de interruptores");
        Parada parada87 = new Parada(1206, "Falla de Relay");
        Parada parada88 = new Parada(1207, "Falla de Swicht Magnetico");
        Parada parada89 = new Parada(1208, "Falla en el Pedal Swicht");
        Parada parada90 = new Parada(1209, "Falla en las Escobillas");
        Parada parada91 = new Parada(1210, "Falla en Pista del Cluch");
        Parada parada92 = new Parada(1222, "Luz operacional quemada");
        Parada parada93 = new Parada(1223, "Problemas eléctrico de motor principal");
        Parada parada94 = new Parada(1144, "Head Knuler");
        Parada parada95 = new Parada(1145, "Cuchillas del cangrejo");
        Parada parada96 = new Parada(1146, "Manguera del Knuler");
        Parada parada97 = new Parada(1147, "Guias del Knuler");
        Parada parada98 = new Parada(1148, "Cam Roll Knuler");
        Parada parada99 = new Parada(1149, "Cangrejo del Knuler");
        Parada parada100 = new Parada(1150, "Finger knuler");
        Parada parada101 = new Parada(1224, "Sensor inductivo averiado");
        Parada parada102 = new Parada(1225, "Ajuste de sensor inductivo");
        Parada parada103 = new Parada(1226, "Falla de sensor de hopper");
        Parada parada104 = new Parada(1227, "Sensor de cigarros averiado");
        Parada parada105 = new Parada(1228, "Sensor de papel averiado");
        Parada parada106 = new Parada(1229, "Tarjeta temporizadora averiada");
        Parada parada107 = new Parada(1230, "Problemas de serie");
        Parada parada108 = new Parada(1151, "Soporte del Knuler");
        Parada parada109 = new Parada(1152, "Spring del Knuler");
        Parada parada110 = new Parada(1275, "Tranque del joke");
        Parada parada111 = new Parada(1276, "Tranque de cangrejo");
        Parada parada112 = new Parada(1277, "Tranque del eje del head knuler");
        Parada parada113 = new Parada(1214, "Levas de Cangrejos");
        Parada parada114 = new Parada(1215, "Spring de Cangrejo");
        Parada parada115 = new Parada(1231, "Configuracion de serie");
        Parada parada116 = new Parada(1232, "Falla de la succión");
        Parada parada117 = new Parada(1233, "Falla de fuente de alimentación DC Tray Loader");
        Parada parada118 = new Parada(1234, "Falla de Suministro Eléctrico");
        Parada parada119 = new Parada(1235, "Falla Sistema de Iluminación");
        Parada parada120 = new Parada(1236, "Falla de Variador Backend");
        Parada parada121 = new Parada(1237, "Falla de Braker Principal Backend");
        Parada parada122 = new Parada(1238, "Falla de sensor conteo de cigarros Backend");
        Parada parada123 = new Parada(1153, "Válvula de Succión");
        Parada parada124 = new Parada(1154, "Succión Head");
        Parada parada125 = new Parada(1155, "Bomba de Succión");
        Parada parada126 = new Parada(1156, "Logueo Inferior");
        Parada parada127 = new Parada(1157, "Rodamiento Succión Head");
        Parada parada128 = new Parada(1158, "Impele sJoke");
        Parada parada129 = new Parada(1159, "Logueo Superior Joke");
        Parada parada130 = new Parada(1160, "Filtros Del Top Carrier");
        Parada parada131 = new Parada(1255, "Cambio de Rodamiento Suction Head");
        Parada parada132 = new Parada(1239, "Falla de motor de succión Backed");
        Parada parada133 = new Parada(1240, "Falla sensor entrada de cigarros");
        Parada parada134 = new Parada(1241, "Falla / Cambio sensor conteo de cigarros");
        Parada parada135 = new Parada(1242, "Falla / cambio de sensor Tray Loader en posición");
        Parada parada136 = new Parada(1243, "Falla / Cambio sensor entrada de Tray Loader");
        Parada parada137 = new Parada(1244, "Falla / Cambio Variador de Tray Loader");
        Parada parada138 = new Parada(1245, "Falla / Cambio Sensores inductivos Tray Loader");
        Parada parada139 = new Parada(1246, "Máquina entregada a Mantenimiento");
        Parada parada140 = new Parada(1247, "Espera de llamada del Técnico Eléctrico");
        Parada parada141 = new Parada(1256, "Cambio del tiempo Válvula con el Suction Head");
        Parada parada142 = new Parada(1257, "Alineación Top Carrier con Suction Head");
        Parada parada143 = new Parada(1258, "Limpieza Suction Head");
        Parada parada144 = new Parada(1282, "Tranque del succión head");
        Parada parada145 = new Parada(1259, "Limpieza Top Carrier");
        Parada parada146 = new Parada(1161, "Cremallera Del Top Carrier");
        Parada parada147 = new Parada(1126, "Cadena Del Hopper");
        Parada parada148 = new Parada(1271, "Tranque del Hopper");
        Parada parada149 = new Parada(1127, "Tip Vibrador");
        Parada parada150 = new Parada(1128, "Bandeja");
        Parada parada151 = new Parada(1181, "Correas trancadas");
        Parada parada152 = new Parada(1182, "Descalibración Transfer bunch");
        Parada parada153 = new Parada(1183, "Tray loader");
        paradaService.crear(parada0, parada1, parada2, parada3, parada4, parada5, parada6, parada7, parada8, parada9,
                parada10, parada11, parada12, parada13, parada14, parada15, parada16, parada17, parada18, parada19,
                parada20, parada21, parada22, parada23, parada24, parada25, parada26, parada27, parada28, parada29,
                parada30, parada31, parada32, parada33, parada34, parada35, parada36, parada37, parada38, parada39,
                parada40, parada41, parada42, parada43, parada44, parada45, parada46, parada47, parada48, parada49,
                parada50, parada51, parada52, parada53, parada54, parada55, parada56, parada57, parada58, parada59,
                parada60, parada61, parada62, parada63, parada64, parada65, parada66, parada67, parada68, parada69,
                parada70, parada71, parada72, parada73, parada74, parada75, parada76, parada77, parada78, parada79,
                parada80, parada81, parada82, parada83, parada84, parada85, parada86, parada87, parada88, parada89,
                parada90, parada91, parada92, parada93, parada94, parada95, parada96, parada97, parada98, parada99,
                parada100, parada101, parada102, parada103, parada104, parada105, parada106, parada107, parada108,
                parada109, parada110, parada111, parada112, parada113, parada114, parada115, parada116, parada117,
                parada118, parada119, parada120, parada121, parada122, parada123, parada124, parada125, parada126,
                parada127, parada128, parada129, parada130, parada131, parada132, parada133, parada134, parada135,
                parada136, parada137, parada138, parada139, parada140, parada141, parada142, parada143, parada144,
                parada145, parada146, parada147, parada148, parada149, parada150, parada151, parada152, parada153);

        // Turno 1
        Inspeccion inspeccion = new Inspeccion("Limpieza Lona", LocalTime.of(6, 30));
        Inspeccion inspeccion2 = new Inspeccion("Limpieza Lona", LocalTime.of(7, 30));
        Inspeccion inspeccion3 = new Inspeccion("Limpieza Lona", LocalTime.of(8, 45));
        Inspeccion inspeccion4 = new Inspeccion("Limpieza Lona", LocalTime.of(9, 45));
        Inspeccion inspeccion5 = new Inspeccion("Limpieza Lona", LocalTime.of(10, 45));
        Inspeccion inspeccion6 = new Inspeccion("Limpieza Lona", LocalTime.of(11, 45));
        Inspeccion inspeccion7 = new Inspeccion("Limpieza Lona", LocalTime.of(12, 45));
        Inspeccion inspeccion8 = new Inspeccion("Limpieza Lona", LocalTime.of(14, 30));
        Inspeccion inspeccion9 = new Inspeccion("Limpieza Lona", LocalTime.of(15, 30));

        Inspeccion inspeccion10 = new Inspeccion("Limpieza filtro", LocalTime.of(6, 30));
        Inspeccion inspeccion11 = new Inspeccion("Limpieza filtro", LocalTime.of(8, 45));
        Inspeccion inspeccion12 = new Inspeccion("Limpieza filtro", LocalTime.of(10, 45));
        Inspeccion inspeccion13 = new Inspeccion("Limpieza filtro", LocalTime.of(12, 45));

        Inspeccion inspeccion14 = new Inspeccion("Limpieza lubricacion de maquina", LocalTime.of(6, 30));
        Inspeccion inspeccion15 = new Inspeccion("Verificacion de calibracion de paste loop", LocalTime.of(6, 30));
        Inspeccion inspeccion16 = new Inspeccion("Verificacion de los sprints del top carier", LocalTime.of(6, 30));

        // Turno 2
        Inspeccion inspeccion17 = new Inspeccion("Limpieza Lona", LocalTime.of(16, 30));
        Inspeccion inspeccion18 = new Inspeccion("Limpieza Lona", LocalTime.of(17, 30));
        Inspeccion inspeccion19 = new Inspeccion("Limpieza Lona", LocalTime.of(18, 30));
        Inspeccion inspeccion20 = new Inspeccion("Limpieza Lona", LocalTime.of(19, 30));
        Inspeccion inspeccion21 = new Inspeccion("Limpieza Lona", LocalTime.of(20, 30));
        Inspeccion inspeccion22 = new Inspeccion("Limpieza Lona", LocalTime.of(21, 30));
        Inspeccion inspeccion23 = new Inspeccion("Limpieza Lona", LocalTime.of(22, 30));
        Inspeccion inspeccion24 = new Inspeccion("Limpieza Lona", LocalTime.of(23, 30));
        Inspeccion inspeccion25 = new Inspeccion("Limpieza Lona", LocalTime.of(0, 30));
        System.out.println("tiempo hora 0 o 12am " + inspeccion25);
        Inspeccion inspeccion26 = new Inspeccion("Limpieza Lona", LocalTime.of(1, 30));

        Inspeccion inspeccion27 = new Inspeccion("Limpieza lubricacion de maquina", LocalTime.of(16, 30));
        Inspeccion inspeccion28 = new Inspeccion("Verificacion de calibracion de paste loop", LocalTime.of(16, 30));
        Inspeccion inspeccion29 = new Inspeccion("Verificacion de los sprints del top carier", LocalTime.of(16, 30));

        inspeccionService.crear(inspeccion, inspeccion2, inspeccion3, inspeccion4, inspeccion5, inspeccion6,
                inspeccion7, inspeccion8, inspeccion9, inspeccion10, inspeccion11, inspeccion12, inspeccion13,
                inspeccion14, inspeccion15, inspeccion16);

        inspeccionService.crear(inspeccion17, inspeccion18, inspeccion19, inspeccion20, inspeccion21, inspeccion22,
                inspeccion23, inspeccion24, inspeccion25, inspeccion26, inspeccion27, inspeccion28, inspeccion29);

    }

}
