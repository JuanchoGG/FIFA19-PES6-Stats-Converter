package fifa.to.pes6;

import java.awt.Color;
import java.awt.Desktop;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.*;
import java.net.URI;
import javax.swing.JFileChooser;

public class forma extends javax.swing.JFrame {

    public forma() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/fifa/to/pes6/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        panelChido = new javax.swing.JTabbedPane();
        panelGeneral = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        clean = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        completeDef = new javax.swing.JRadioButton();
        tactician = new javax.swing.JRadioButton();
        playmaker = new javax.swing.JRadioButton();
        dribbler = new javax.swing.JRadioButton();
        crosser = new javax.swing.JRadioButton();
        distanceShoot = new javax.swing.JRadioButton();
        completeMid = new javax.swing.JRadioButton();
        fkSpecialist = new javax.swing.JRadioButton();
        poacher = new javax.swing.JRadioButton();
        tackling = new javax.swing.JRadioButton();
        speedster = new javax.swing.JRadioButton();
        clinicalFinisher = new javax.swing.JRadioButton();
        completeFor = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        longTrow = new javax.swing.JRadioButton();
        injuryFree = new javax.swing.JRadioButton();
        finesseShot = new javax.swing.JRadioButton();
        injuryProne = new javax.swing.JRadioButton();
        beatOffside = new javax.swing.JRadioButton();
        avoidsWKFoot = new javax.swing.JRadioButton();
        diver = new javax.swing.JRadioButton();
        outsideFootShot = new javax.swing.JRadioButton();
        gkLongThrow = new javax.swing.JRadioButton();
        giantThrow = new javax.swing.JRadioButton();
        powerHeader = new javax.swing.JRadioButton();
        leadership = new javax.swing.JRadioButton();
        powerFK = new javax.swing.JRadioButton();
        flair = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        GK = new javax.swing.JCheckBox();
        LWB = new javax.swing.JCheckBox();
        LB = new javax.swing.JCheckBox();
        CB = new javax.swing.JCheckBox();
        RB = new javax.swing.JCheckBox();
        RWB = new javax.swing.JCheckBox();
        LM = new javax.swing.JCheckBox();
        CDM = new javax.swing.JCheckBox();
        CM = new javax.swing.JCheckBox();
        CAM = new javax.swing.JCheckBox();
        RM = new javax.swing.JCheckBox();
        CF = new javax.swing.JCheckBox();
        LW = new javax.swing.JCheckBox();
        ST = new javax.swing.JCheckBox();
        RW = new javax.swing.JCheckBox();
        jLabel91 = new javax.swing.JLabel();
        regPos = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        overRating = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        goalkeeper = new javax.swing.JRadioButton();
        player = new javax.swing.JRadioButton();
        attWR = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        weakFoot = new javax.swing.JComboBox<>();
        jLabel96 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        nation = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        prefFoot = new javax.swing.JComboBox<>();
        panelStats = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        crossing = new javax.swing.JTextField();
        finishing = new javax.swing.JTextField();
        headingAcc = new javax.swing.JTextField();
        shortPass = new javax.swing.JTextField();
        volleys = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        dribbling = new javax.swing.JTextField();
        curve = new javax.swing.JTextField();
        fkAcc = new javax.swing.JTextField();
        ballControl = new javax.swing.JTextField();
        longPass = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        acceleration = new javax.swing.JTextField();
        sprintSpeed = new javax.swing.JTextField();
        agility = new javax.swing.JTextField();
        reactions = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        shotPower = new javax.swing.JTextField();
        jumping = new javax.swing.JTextField();
        stamina = new javax.swing.JTextField();
        strenght = new javax.swing.JTextField();
        longShots = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        agression = new javax.swing.JTextField();
        interceptions = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        positioning = new javax.swing.JTextField();
        vision = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        penalties = new javax.swing.JTextField();
        composture = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        gkDiving1 = new javax.swing.JTextField();
        gkHandling = new javax.swing.JTextField();
        gkKicking = new javax.swing.JTextField();
        gkPositioning = new javax.swing.JTextField();
        gkReflexes = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        marking = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        standTackle = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        slidTackle = new javax.swing.JTextField();
        pes6 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        wfFreq = new javax.swing.JTextField();
        consistency = new javax.swing.JTextField();
        wfAcc = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        injuryTolerancy = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        condition = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        foot = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        shortPassSpeed = new javax.swing.JTextField();
        shortPassAcc = new javax.swing.JTextField();
        dribbleAcc = new javax.swing.JTextField();
        dribbleSpeed = new javax.swing.JTextField();
        response = new javax.swing.JTextField();
        agility1 = new javax.swing.JTextField();
        acceleration1 = new javax.swing.JTextField();
        speed = new javax.swing.JTextField();
        stamina1 = new javax.swing.JTextField();
        balance1 = new javax.swing.JTextField();
        defence = new javax.swing.JTextField();
        attack = new javax.swing.JTextField();
        shotAccuracy = new javax.swing.JTextField();
        longPassAcc = new javax.swing.JTextField();
        longPassSpeed = new javax.swing.JTextField();
        shotPower1 = new javax.swing.JTextField();
        shotTechnique = new javax.swing.JTextField();
        fkAccuracy = new javax.swing.JTextField();
        swerve = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        gkSkills = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        teamWork = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        mentality = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        agression1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        technique = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jump = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        heading = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        dribbling1 = new javax.swing.JRadioButton();
        tacDrib = new javax.swing.JRadioButton();
        position = new javax.swing.JRadioButton();
        reaction = new javax.swing.JRadioButton();
        playmaking = new javax.swing.JRadioButton();
        passing = new javax.swing.JRadioButton();
        scoring = new javax.swing.JRadioButton();
        scoring1 = new javax.swing.JRadioButton();
        postPlayer = new javax.swing.JRadioButton();
        lines = new javax.swing.JRadioButton();
        moddleShoot = new javax.swing.JRadioButton();
        side = new javax.swing.JRadioButton();
        centre = new javax.swing.JRadioButton();
        penalties1 = new javax.swing.JRadioButton();
        touchPass = new javax.swing.JRadioButton();
        outside = new javax.swing.JRadioButton();
        marking1 = new javax.swing.JRadioButton();
        sliding = new javax.swing.JRadioButton();
        covering = new javax.swing.JRadioButton();
        dLine = new javax.swing.JRadioButton();
        penaltyStop = new javax.swing.JRadioButton();
        stopper1 = new javax.swing.JRadioButton();
        longThrow = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        gk6 = new javax.swing.JCheckBox();
        cwp6 = new javax.swing.JCheckBox();
        cbt6 = new javax.swing.JCheckBox();
        sb6 = new javax.swing.JCheckBox();
        dm6 = new javax.swing.JCheckBox();
        wb6 = new javax.swing.JCheckBox();
        cm6 = new javax.swing.JCheckBox();
        sm6 = new javax.swing.JCheckBox();
        am6 = new javax.swing.JCheckBox();
        wg6 = new javax.swing.JCheckBox();
        ss6 = new javax.swing.JCheckBox();
        cf6 = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        regPos1 = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        juancho = new javax.swing.JLabel();
        pesRetro = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FIFA19 to PES6 Stats Converter 1.0 by Juancho GG ©");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(570, 609));
        setPreferredSize(new java.awt.Dimension(570, 609));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 609));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 54, -1, -1));

        panelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/13.png"))); // NOI18N
        panelGeneral.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("General");
        jLabel39.setOpaque(true);
        panelGeneral.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, -1));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Position");
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel55.setOpaque(true);
        panelGeneral.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 60, -1));

        clean.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clean.setText("Clean");
        clean.setMaximumSize(new java.awt.Dimension(89, 25));
        clean.setMinimumSize(new java.awt.Dimension(89, 25));
        clean.setPreferredSize(new java.awt.Dimension(89, 25));
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });
        panelGeneral.add(clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 110, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.setMaximumSize(new java.awt.Dimension(89, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(89, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelGeneral.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 110, 40));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Specialities");
        jLabel47.setOpaque(true);
        panelGeneral.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, -1));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Traits");
        jLabel48.setOpaque(true);
        panelGeneral.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 40, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        completeDef.setBackground(new java.awt.Color(255, 255, 255));
        completeDef.setText("Complete Def.");
        jPanel3.add(completeDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        tactician.setBackground(new java.awt.Color(255, 255, 255));
        tactician.setText("Tactician");
        jPanel3.add(tactician, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        playmaker.setBackground(new java.awt.Color(255, 255, 255));
        playmaker.setText("Playmaker");
        jPanel3.add(playmaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        dribbler.setBackground(new java.awt.Color(255, 255, 255));
        dribbler.setText("Dribbler");
        jPanel3.add(dribbler, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        crosser.setBackground(new java.awt.Color(255, 255, 255));
        crosser.setText("Crosser");
        jPanel3.add(crosser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        distanceShoot.setBackground(new java.awt.Color(255, 255, 255));
        distanceShoot.setText("Distance Shooting");
        jPanel3.add(distanceShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        completeMid.setBackground(new java.awt.Color(255, 255, 255));
        completeMid.setText("Complete Mid.");
        jPanel3.add(completeMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        fkSpecialist.setBackground(new java.awt.Color(255, 255, 255));
        fkSpecialist.setText("FK Specialist");
        jPanel3.add(fkSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        poacher.setBackground(new java.awt.Color(255, 255, 255));
        poacher.setText("Poacher");
        poacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poacherActionPerformed(evt);
            }
        });
        jPanel3.add(poacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tackling.setBackground(new java.awt.Color(255, 255, 255));
        tackling.setText("Tackling");
        jPanel3.add(tackling, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        speedster.setBackground(new java.awt.Color(255, 255, 255));
        speedster.setText("Speedster");
        jPanel3.add(speedster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        clinicalFinisher.setBackground(new java.awt.Color(255, 255, 255));
        clinicalFinisher.setText("Clinical Finisher");
        jPanel3.add(clinicalFinisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        completeFor.setBackground(new java.awt.Color(255, 255, 255));
        completeFor.setText("Complete For.");
        jPanel3.add(completeFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        panelGeneral.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 270, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        longTrow.setBackground(new java.awt.Color(255, 255, 255));
        longTrow.setText("Long Throw-in");
        jPanel2.add(longTrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        injuryFree.setBackground(new java.awt.Color(255, 255, 255));
        injuryFree.setText("Injury Free");
        jPanel2.add(injuryFree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        finesseShot.setBackground(new java.awt.Color(255, 255, 255));
        finesseShot.setText("Finesse Shot");
        jPanel2.add(finesseShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        injuryProne.setBackground(new java.awt.Color(255, 255, 255));
        injuryProne.setText("Injury Prone");
        jPanel2.add(injuryProne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        beatOffside.setBackground(new java.awt.Color(255, 255, 255));
        beatOffside.setText("Beat Offside Trap");
        jPanel2.add(beatOffside, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        avoidsWKFoot.setBackground(new java.awt.Color(255, 255, 255));
        avoidsWKFoot.setText("Avoids Use WK Foot");
        jPanel2.add(avoidsWKFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        diver.setBackground(new java.awt.Color(255, 255, 255));
        diver.setText("Diver");
        jPanel2.add(diver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        outsideFootShot.setBackground(new java.awt.Color(255, 255, 255));
        outsideFootShot.setText("Outside Foot Shot");
        jPanel2.add(outsideFootShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        gkLongThrow.setBackground(new java.awt.Color(255, 255, 255));
        gkLongThrow.setText("GK Long Throw");
        jPanel2.add(gkLongThrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        giantThrow.setBackground(new java.awt.Color(255, 255, 255));
        giantThrow.setText("Giant Throw-in");
        jPanel2.add(giantThrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        powerHeader.setBackground(new java.awt.Color(255, 255, 255));
        powerHeader.setText("Power Header");
        jPanel2.add(powerHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        leadership.setBackground(new java.awt.Color(255, 255, 255));
        leadership.setText("Leadership");
        jPanel2.add(leadership, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        powerFK.setBackground(new java.awt.Color(255, 255, 255));
        powerFK.setText("Power Free-Kick");
        jPanel2.add(powerFK, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        flair.setBackground(new java.awt.Color(255, 255, 255));
        flair.setText("Flair");
        jPanel2.add(flair, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        panelGeneral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 280, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GK.setBackground(new java.awt.Color(255, 255, 255));
        GK.setText("GK");
        jPanel4.add(GK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        LWB.setBackground(new java.awt.Color(255, 255, 255));
        LWB.setText("LWB");
        jPanel4.add(LWB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        LB.setBackground(new java.awt.Color(255, 255, 255));
        LB.setText("LB");
        jPanel4.add(LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        CB.setBackground(new java.awt.Color(255, 255, 255));
        CB.setText("CB");
        jPanel4.add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        RB.setBackground(new java.awt.Color(255, 255, 255));
        RB.setText("RB");
        jPanel4.add(RB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        RWB.setBackground(new java.awt.Color(255, 255, 255));
        RWB.setText("RWB");
        jPanel4.add(RWB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        LM.setBackground(new java.awt.Color(255, 255, 255));
        LM.setText("LM");
        jPanel4.add(LM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        CDM.setBackground(new java.awt.Color(255, 255, 255));
        CDM.setText("CDM");
        jPanel4.add(CDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        CM.setBackground(new java.awt.Color(255, 255, 255));
        CM.setText("CM");
        jPanel4.add(CM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        CAM.setBackground(new java.awt.Color(255, 255, 255));
        CAM.setText("CAM");
        jPanel4.add(CAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        RM.setBackground(new java.awt.Color(255, 255, 255));
        RM.setText("RM");
        jPanel4.add(RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        CF.setBackground(new java.awt.Color(255, 255, 255));
        CF.setText("CF");
        jPanel4.add(CF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        LW.setBackground(new java.awt.Color(255, 255, 255));
        LW.setText("LW");
        jPanel4.add(LW, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        ST.setBackground(new java.awt.Color(255, 255, 255));
        ST.setText("ST");
        jPanel4.add(ST, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        RW.setBackground(new java.awt.Color(255, 255, 255));
        RW.setText("RW");
        jPanel4.add(RW, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel91.setText("Registered Position:");
        jPanel4.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        regPos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GK", "LWB", "RWB", "LB", "RB", "CB", "LM", "RM", "CDM", "CM", "CAM", "LW", "RW", "CF", "ST" }));
        jPanel4.add(regPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        panelGeneral.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 260, 140));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(overRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 30, -1));

        jLabel94.setText("Height:");
        jPanel6.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel95.setText("Weight:");
        jPanel6.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));
        jPanel6.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 30, -1));
        jPanel6.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 30, -1));

        jLabel93.setText("Age:");
        jPanel6.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));
        jPanel6.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 30, -1));

        goalkeeper.setBackground(new java.awt.Color(255, 255, 255));
        field.add(goalkeeper);
        goalkeeper.setText("Goalkeeper");
        goalkeeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goalkeeperActionPerformed(evt);
            }
        });
        jPanel6.add(goalkeeper, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        player.setBackground(new java.awt.Color(255, 255, 255));
        field.add(player);
        player.setSelected(true);
        player.setText("Player");
        player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });
        jPanel6.add(player, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        attWR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));
        jPanel6.add(attWR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 70, -1));

        jLabel54.setText("Attacking WR:");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel45.setText("Weak Foot:");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        weakFoot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel6.add(weakFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, -1));

        jLabel96.setText("Country:");
        jPanel6.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel49.setText("Over Rating:");
        jPanel6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        nation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "England", "Montenegro", "Faroe Islands", "Finland", "France", "FYR Macedonia", "Georgia", "Germany", "Greece", "Hungary", "Iceland", "Republic of Ireland", "Israel", "Italy", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta", "Moldova", "Netherlands", "Northem Ireland", "Norway", "Poland", "Portugal", "Romania", "Russia", "Scotland", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "Wales", "Serbia", "Kazakhstan", "Estonia", "Kosovo", "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela", "Antigua & Barbuda", "Barbados", "Belize", "Bermuda", "Canada", "Costa Rica", "Cuba", "El Salvador", "Grenada", "Guatemala", "Guyana", "Haiti", "Honduras", "Mexico", "Montserrat", "Curacao", "Nicaragua", "Panama", "Puerto Rico", "St Kitts Nervis", "St Lucia", "Suriname", "Trinidad & Tobago", "USA", "Dominican Republic", "Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cameroon", "Cape Verde", "Central African Rep.", "Chad", "Congo", "Ivory Coast", "DR Congo", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea Bissau", "Kenya", "Liberia", "Libya", "Madagascar", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Nigeria", "Rwanda", "Sao Tomé & Príncipe", "Senegal", "Sierra Leone", "South Africa", "Sudan", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe", "Comoros", "South Sudan", "Afghanistan", "China PR", "Guam", "Hong Kong", "India", "Indonesia", "Iran", "Iraq", "Japan", "Jordan", "Korea DPR", "Korea Republic", "Kuwuait", "Lebanon", "Oman", "Palestine", "Philippines", "Qatar", "Saudi Arabia", "Syria", "Thailand", "United Arab Emirates", "Uzbekistan", "Australia", "Fiji", "New Zealand", "New Caledonia" }));
        jPanel6.add(nation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, -1));

        jLabel53.setText("Player's Name:");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel6.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        jLabel97.setText("Pref. Foot:");
        jPanel6.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        prefFoot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left", "Right" }));
        jPanel6.add(prefFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, -1));

        panelGeneral.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 190));

        panelChido.addTab("General", panelGeneral);

        panelStats.setBackground(new java.awt.Color(255, 255, 255));
        panelStats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/13.png"))); // NOI18N
        panelStats.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel46.setText("Defending");
        jLabel46.setOpaque(true);
        panelStats.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 70, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Skill");
        jLabel7.setOpaque(true);
        panelStats.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 40, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Attacking");
        jLabel2.setOpaque(true);
        panelStats.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel30.setText("Mentality");
        jLabel30.setOpaque(true);
        panelStats.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 70, -1));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Goalkeeping");
        jLabel38.setOpaque(true);
        panelStats.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Movement");
        jLabel18.setOpaque(true);
        panelStats.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Power");
        jLabel24.setOpaque(true);
        panelStats.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 50, -1));

        convertButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        panelStats.add(convertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 130, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Crossing:");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("Finishing:");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setText("Heading Acc:");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setText("Short Pass:");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setText("Volleys:");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel8.add(crossing, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel8.add(finishing, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));
        jPanel8.add(headingAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));
        jPanel8.add(shortPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));
        jPanel8.add(volleys, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, -1));

        panelStats.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 130));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(dribbling, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel10.add(curve, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));
        jPanel10.add(fkAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));
        jPanel10.add(ballControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, -1));
        jPanel10.add(longPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));

        jLabel12.setText("Ball Control:");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel11.setText("Long Pass:");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel10.setText("FK Accuracy:");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel9.setText("Curve:");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setText("Dribbling:");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        panelStats.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, 130));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Accel:");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel14.setText("Sprint Spd:");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel15.setText("Agility:");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel16.setText("Reactions:");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel17.setText("Balance:");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel11.add(acceleration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel11.add(sprintSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));
        jPanel11.add(agility, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));
        jPanel11.add(reactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));
        jPanel11.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, -1));

        panelStats.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 130));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Shot Power:");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel12.add(shotPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel12.add(jumping, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));
        jPanel12.add(stamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));
        jPanel12.add(strenght, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));
        jPanel12.add(longShots, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, -1));

        jLabel20.setText("Jumping:");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel21.setText("Stamina:");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel22.setText("Strenght:");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel23.setText("Long Shots:");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        panelStats.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 140, 130));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Agression:");
        jPanel13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel13.add(agression, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel13.add(interceptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));

        jLabel26.setText("Intercep:");
        jPanel13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel27.setText("Positioning:");
        jPanel13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel13.add(positioning, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));
        jPanel13.add(vision, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));

        jLabel28.setText("Vision:");
        jPanel13.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel29.setText("Penalites:");
        jPanel13.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel13.add(penalties, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, -1));
        jPanel13.add(composture, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 30, -1));

        jLabel31.setText("Composture:");
        jPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        panelStats.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 150));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("GK Diving:");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel34.setText("GK Handling:");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel35.setText("GK Kicking:");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel36.setText("GK Position:");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel37.setText("GK Reflexes:");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel14.add(gkDiving1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel14.add(gkHandling, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));
        jPanel14.add(gkKicking, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));
        jPanel14.add(gkPositioning, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));
        jPanel14.add(gkReflexes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, -1));

        panelStats.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 140, 140));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setText("Marking:");
        jPanel15.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel15.add(marking, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel51.setText("Standing Tackle:");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel15.add(standTackle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, -1));

        jLabel52.setText("Sliding Tackle:");
        jPanel15.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel15.add(slidTackle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 30, -1));

        panelStats.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 150, 100));

        panelChido.addTab("FIFA Stats", panelStats);

        pes6.setBackground(new java.awt.Color(255, 255, 255));
        pes6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("General");
        jLabel56.setOpaque(true);
        pes6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, -1));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Special Ability");
        jLabel58.setOpaque(true);
        pes6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 100, -1));

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Ability");
        jLabel89.setOpaque(true);
        pes6.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 50, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setText("Consistency:");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(wfFreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, -1));
        jPanel1.add(consistency, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 30, -1));
        jPanel1.add(wfAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 30, -1));

        jLabel86.setText("WF Acc:");
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel87.setText("WF Freq: ");
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel88.setText("Injury Tolerancy:");
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel1.add(injuryTolerancy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, -1));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Player's Name:");
        jLabel42.setOpaque(true);
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, -1));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("Shirt Name:");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));
        jPanel1.add(condition, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 30, -1));

        jLabel57.setText("Condition/Fitness:");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel1.add(foot, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 30, -1));

        jLabel98.setText("Foot/Side:");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        pes6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 240));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setText("Attack:");
        jPanel5.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel60.setText("Defence:");
        jPanel5.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel61.setText("Balance:");
        jPanel5.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel62.setText("Stamina:");
        jPanel5.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel63.setText("Speed:");
        jPanel5.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel64.setText("Acceleration:");
        jPanel5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel65.setText("Response:");
        jPanel5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel66.setText("Agility:");
        jPanel5.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel67.setText("Dribble Acc:");
        jPanel5.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel68.setText("Dribble Speed:");
        jPanel5.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel69.setText("Short Pass Acc:");
        jPanel5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel70.setText("Short Pass Spd:");
        jPanel5.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel71.setText("Long Pass Acc:");
        jPanel5.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel72.setText("Long Pass Spd:");
        jPanel5.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel73.setText("Shot Accuracy:");
        jPanel5.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel74.setText("Shot Power:");
        jPanel5.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel75.setText("Shot Tech:");
        jPanel5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel76.setText("FK Accuracy:");
        jPanel5.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel5.add(shortPassSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, -1));
        jPanel5.add(shortPassAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 30, -1));
        jPanel5.add(dribbleAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 30, -1));
        jPanel5.add(dribbleSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 30, -1));
        jPanel5.add(response, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 30, -1));
        jPanel5.add(agility1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 30, -1));
        jPanel5.add(acceleration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, -1));
        jPanel5.add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 30, -1));
        jPanel5.add(stamina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 30, -1));
        jPanel5.add(balance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, -1));
        jPanel5.add(defence, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 30, -1));
        jPanel5.add(attack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 30, -1));
        jPanel5.add(shotAccuracy, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 30, -1));
        jPanel5.add(longPassAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 30, -1));
        jPanel5.add(longPassSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 30, -1));
        jPanel5.add(shotPower1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 30, -1));
        jPanel5.add(shotTechnique, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 30, -1));
        jPanel5.add(fkAccuracy, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 30, -1));
        jPanel5.add(swerve, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 30, -1));

        jLabel77.setText("Swerve:");
        jPanel5.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel78.setText("Heading:");
        jPanel5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        jPanel5.add(gkSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 30, -1));

        jLabel79.setText("Jump:");
        jPanel5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        jPanel5.add(teamWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 30, -1));

        jLabel80.setText("Technique");
        jPanel5.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));
        jPanel5.add(mentality, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 30, -1));

        jLabel81.setText("Agression:");
        jPanel5.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));
        jPanel5.add(agression1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 30, -1));

        jLabel82.setText("Mentality:");
        jPanel5.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));
        jPanel5.add(technique, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 30, -1));

        jLabel83.setText("GK Skills:");
        jPanel5.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));
        jPanel5.add(jump, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 30, -1));

        jLabel84.setText("Team Work:");
        jPanel5.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));
        jPanel5.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 30, -1));

        pes6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 150, 540));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dribbling1.setBackground(new java.awt.Color(255, 255, 255));
        dribbling1.setText("Dribbling");
        jPanel7.add(dribbling1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tacDrib.setBackground(new java.awt.Color(255, 255, 255));
        tacDrib.setText("Tactical Dribble");
        jPanel7.add(tacDrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        position.setBackground(new java.awt.Color(255, 255, 255));
        position.setText("Positioning");
        jPanel7.add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        reaction.setBackground(new java.awt.Color(255, 255, 255));
        reaction.setText("Reaction");
        jPanel7.add(reaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        playmaking.setBackground(new java.awt.Color(255, 255, 255));
        playmaking.setText("Playmaking");
        jPanel7.add(playmaking, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        passing.setBackground(new java.awt.Color(255, 255, 255));
        passing.setText("Passing");
        jPanel7.add(passing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        scoring.setBackground(new java.awt.Color(255, 255, 255));
        scoring.setText("Scoring");
        jPanel7.add(scoring, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        scoring1.setBackground(new java.awt.Color(255, 255, 255));
        scoring1.setText("1-1 Scoring");
        jPanel7.add(scoring1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        postPlayer.setBackground(new java.awt.Color(255, 255, 255));
        postPlayer.setText("Post Player");
        jPanel7.add(postPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lines.setBackground(new java.awt.Color(255, 255, 255));
        lines.setText("Lines");
        jPanel7.add(lines, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        moddleShoot.setBackground(new java.awt.Color(255, 255, 255));
        moddleShoot.setText("Middle Shooting");
        jPanel7.add(moddleShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        side.setBackground(new java.awt.Color(255, 255, 255));
        side.setText("Side");
        jPanel7.add(side, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        centre.setBackground(new java.awt.Color(255, 255, 255));
        centre.setText("Centre");
        jPanel7.add(centre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        penalties1.setBackground(new java.awt.Color(255, 255, 255));
        penalties1.setText("Penalties");
        jPanel7.add(penalties1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        touchPass.setBackground(new java.awt.Color(255, 255, 255));
        touchPass.setText("1-Touch Pass");
        jPanel7.add(touchPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        outside.setBackground(new java.awt.Color(255, 255, 255));
        outside.setText("Outside");
        jPanel7.add(outside, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        marking1.setBackground(new java.awt.Color(255, 255, 255));
        marking1.setText("Marking");
        jPanel7.add(marking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        sliding.setBackground(new java.awt.Color(255, 255, 255));
        sliding.setText("Sliding");
        jPanel7.add(sliding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        covering.setBackground(new java.awt.Color(255, 255, 255));
        covering.setText("Covering");
        jPanel7.add(covering, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        dLine.setBackground(new java.awt.Color(255, 255, 255));
        dLine.setText("D-Line Control");
        jPanel7.add(dLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        penaltyStop.setBackground(new java.awt.Color(255, 255, 255));
        penaltyStop.setText("Penalty Stopper");
        jPanel7.add(penaltyStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        stopper1.setBackground(new java.awt.Color(255, 255, 255));
        stopper1.setText("1-On-1 Stopper");
        jPanel7.add(stopper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        longThrow.setBackground(new java.awt.Color(255, 255, 255));
        longThrow.setText("Long Throw");
        jPanel7.add(longThrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        pes6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, 480));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/pes2006.png"))); // NOI18N
        pes6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Position");
        jLabel90.setOpaque(true);
        pes6.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gk6.setBackground(new java.awt.Color(255, 255, 255));
        gk6.setText("GK");
        jPanel9.add(gk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cwp6.setBackground(new java.awt.Color(255, 255, 255));
        cwp6.setText("CWP");
        jPanel9.add(cwp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cbt6.setBackground(new java.awt.Color(255, 255, 255));
        cbt6.setText("CBT");
        jPanel9.add(cbt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        sb6.setBackground(new java.awt.Color(255, 255, 255));
        sb6.setText("SB");
        jPanel9.add(sb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        dm6.setBackground(new java.awt.Color(255, 255, 255));
        dm6.setText("DM");
        jPanel9.add(dm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        wb6.setBackground(new java.awt.Color(255, 255, 255));
        wb6.setText("WB");
        jPanel9.add(wb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        cm6.setBackground(new java.awt.Color(255, 255, 255));
        cm6.setText("CM");
        jPanel9.add(cm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        sm6.setBackground(new java.awt.Color(255, 255, 255));
        sm6.setText("SM");
        jPanel9.add(sm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        am6.setBackground(new java.awt.Color(255, 255, 255));
        am6.setText("AM");
        jPanel9.add(am6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        wg6.setBackground(new java.awt.Color(255, 255, 255));
        wg6.setText("WG");
        jPanel9.add(wg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        ss6.setBackground(new java.awt.Color(255, 255, 255));
        ss6.setText("SS");
        jPanel9.add(ss6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        cf6.setBackground(new java.awt.Color(255, 255, 255));
        cf6.setText("CF");
        jPanel9.add(cf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel92.setText("Registered Position:");
        jPanel9.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        regPos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GK", "CWP", "CBT", "SB", "DM", "WB", "CM", "SM", "AM", "WG", "SS", "CF" }));
        jPanel9.add(regPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        pes6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 140));

        save.setText("PES Editor Format");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        pes6.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 140, 40));

        panelChido.addTab("PES Stats", pes6);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/13.png"))); // NOI18N
        jPanel16.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/pes2006.png"))); // NOI18N
        jPanel16.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/5.png"))); // NOI18N
        jPanel16.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/6.png"))); // NOI18N
        jPanel16.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel103.setText("FIFA19 to PES6");
        jPanel16.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, -1));

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel104.setText("Stats Converter");
        jPanel16.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel105.setText("© Juancho GG Production. All Rights Reserved ");
        jPanel16.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Credits to: Agustín Romeo, Agustin13F");
        jPanel16.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        juancho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/marca.png"))); // NOI18N
        juancho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juanchoMouseClicked(evt);
            }
        });
        jPanel16.add(juancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        pesRetro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/pr.png"))); // NOI18N
        pesRetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesRetroMouseClicked(evt);
            }
        });
        jPanel16.add(pesRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel107.setText("Version: 1.0");
        jPanel16.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa/to/pes6/mex.png"))); // NOI18N
        jPanel16.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        panelChido.addTab("About", jPanel16);

        getContentPane().add(panelChido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void color(JTextField campo){
        int valor = Integer.parseInt(campo.getText());
        if(valor>=75&&valor<=79){
            campo.setBackground(Color.green);
        } else if(valor>=80&&valor<=89){
            campo.setBackground(Color.yellow);
        } else if(valor>=90&&valor<=94){
            campo.setBackground(Color.orange);
        } else if(valor>=95&&valor<=99){
            campo.setBackground(Color.red);
        } else{
            campo.setBackground(Color.white);
        }
    }
    
    String foot1="";
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        attack.setText(positioning.getText());
        color(attack);
        defe();
        balance1.setText(strenght.getText());
        color(balance1);
        stamina1.setText(stamina.getText());
        color(stamina1);
        speed.setText(sprintSpeed.getText());
        color(speed);
        acceleration1.setText(acceleration.getText());
        color(acceleration1);
        response.setText(reactions.getText());
        color(response);
        agility1.setText(agility.getText());
        color(agility1);
        dribbleAcc.setText(dribbling.getText());
        color(dribbleAcc);
        dribbleSpeed.setText(sprintSpeed.getText());
        color(dribbleSpeed);
        shortPassAcc.setText(shortPass.getText());
        color(shortPassAcc);
        shortPassSpeed();
        longPassAcc();
        longPassSpeed();
        shotAccuracy.setText(finishing.getText());
        color(shotAccuracy);
        int paw = Integer.parseInt(shotPower.getText());
        int stre = Integer.parseInt(strenght.getText());
        if(stre>paw){
            shotPower1.setText(strenght.getText());
        } else{
            shotPower1.setText(shotPower.getText());
        }
        color(shotPower1);
        shotTec();
        fkAccuracy.setText(fkAcc.getText());
        color(fkAccuracy);
        swerve.setText(curve.getText());
        color(swerve);
        heading.setText(headingAcc.getText());
        color(heading);
        jump.setText(jumping.getText());
        color(jump);
        technique.setText(ballControl.getText());
        color(technique);
        agress();
        mentality.setText(composture.getText());
        color(mentality);
        gk();

        int twrk = Integer.parseInt(vision.getText());
        int inter = Integer.parseInt(interceptions.getText());
        if(inter>twrk){
            teamWork.setText(""+inter);
        } else{
            teamWork.setText(""+twrk);
        }
        color(teamWork);
        
        if(goalkeeper.isSelected()){
            gkStats();
        }
        
        int indexFoot = prefFoot.getSelectedIndex();
        if(indexFoot==0){
            foot1="L";
        } else if(indexFoot==1){
            foot1="R";
        }
        
        wkFoot();
        consis();
        condition();
        
        if(injuryFree.isSelected()){
            injuryTolerancy.setText("A");
            injuryTolerancy.setBackground(Color.red);
        } else if(injuryProne.isSelected()){
            injuryTolerancy.setText("C");
        } else{
            injuryTolerancy.setText("B");
            injuryTolerancy.setBackground(Color.yellow);
        }
        
        if(longTrow.isSelected()){
            longThrow.setSelected(true);
        }
        if(diver.isSelected()){
            int div = Integer.parseInt(jump.getText());
            if(div<=95){
                div+=4;
                jump.setText(""+div);
            }
            color(jump);
        }
        if(beatOffside.isSelected()){
            lines.setSelected(true);
            postPlayer.setSelected(true);
        }
        if(finesseShot.isSelected()){
            scoring1.setSelected(true);
        }
        if(flair.isSelected()){
            touchPass.setSelected(true);
        }
        if(gkLongThrow.isSelected()){
            longThrow.setSelected(true);
        }
        if(powerHeader.isSelected()){
            int pow = Integer.parseInt(heading.getText());
            pow+=3;
            heading.setText(""+pow);
            color(heading);
        }
        if(giantThrow.isSelected()){
            longThrow.setSelected(true);
        }
        if(powerFK.isSelected()){
            int fk = Integer.parseInt(fkAccuracy.getText());
            fk+=5;
            fkAccuracy.setText(""+fk);
            color(fkAccuracy);
        }
        if(outsideFootShot.isSelected()){
            side.setSelected(true);
        }
        if(leadership.isSelected()){
            if(cwp6.isSelected()){
                dLine.setSelected(true);
            }
            if(cbt6.isSelected()){
                dLine.setSelected(true);
            }
            if(sb6.isSelected()){
                dLine.setSelected(true);
            }
            if(dm6.isSelected()){
                dLine.setSelected(true);
            }
        }
        if(poacher.isSelected()){
            postPlayer.setSelected(true);
            reaction.setSelected(true);
            position.setSelected(true);
        }
        if(speedster.isSelected()){
            reaction.setSelected(true);
            position.setSelected(true);
        }
        if(dribbler.isSelected()){
            dribbling1.setSelected(true);
            tacDrib.setSelected(true);
        }
        if(playmaker.isSelected()){
            playmaking.setSelected(true);
            centre.setSelected(true);
        }
        if(distanceShoot.isSelected()){
            moddleShoot.setSelected(true);
        }
        if(crosser.isSelected()){
            side.setSelected(true);
        }
        if(fkSpecialist.isSelected()){
            int fk = Integer.parseInt(fkAccuracy.getText());
            fk+=3;
            fkAccuracy.setText(""+fk);
            color(fkAccuracy);
        }
        if(tackling.isSelected()){
            sliding.setSelected(true);
        }
        if(tactician.isSelected()){
            covering.setSelected(true);
            dLine.setSelected(true);
        }
        if(clinicalFinisher.isSelected()){
            scoring1.setSelected(true);
            penalties1.setSelected(true);
        }
        if(completeDef.isSelected()){
            passing.setSelected(true);
            marking1.setSelected(true);
            sliding.setSelected(true);
            covering.setSelected(true);
            dLine.setSelected(true);
        }
        if(completeMid.isSelected()){
            playmaking.setSelected(true);
            centre.setSelected(true);
            passing.setSelected(true);
            touchPass.setSelected(true);
            covering.setSelected(true);
        }
        if(completeFor.isSelected()){
            position.setSelected(true);
            reaction.setSelected(true);
            scoring.setSelected(true);
            scoring1.setSelected(true);
            postPlayer.setSelected(true);
        }
        int pen = Integer.parseInt(penalties.getText());
        if(pen>85){
            penalties1.setSelected(true);
        }
        position();
        
        foot.setText(foot1+"/"+side1);
        
        String nombre = name.getText();
        
        name1.setText(nombre);
        name2.setText(nombre.toUpperCase());
        panelChido.setSelectedIndex(2);
    }//GEN-LAST:event_convertButtonActionPerformed

    private void poacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poacherActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelChido.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void goalkeeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalkeeperActionPerformed

    }//GEN-LAST:event_goalkeeperActionPerformed

    private void playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerActionPerformed

    }//GEN-LAST:event_playerActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        name.setText("");
        age.setText("");
        height.setText("");
        weight.setText("");
        overRating.setText("");
        player.setSelected(true);
        
        nation.setSelectedIndex(0);
        prefFoot.setSelectedIndex(0);
        attWR.setSelectedIndex(0);
        weakFoot.setSelectedIndex(0);
        
        poacher.setSelected(false);
        speedster.setSelected(false);
        dribbler.setSelected(false);
        playmaker.setSelected(false);
        distanceShoot.setSelected(false);
        crosser.setSelected(false);
        fkSpecialist.setSelected(false);
        tackling.setSelected(false);
        tactician.setSelected(false);
        clinicalFinisher.setSelected(false);
        completeDef.setSelected(false);
        completeMid.setSelected(false);
        completeFor.setSelected(false);
        
        longTrow.setSelected(false);
        finesseShot.setSelected(false);
        diver.setSelected(false);
        injuryProne.setSelected(false);
        injuryFree.setSelected(false);
        avoidsWKFoot.setSelected(false);
        beatOffside.setSelected(false);
        powerFK.setSelected(false);
        flair.setSelected(false);
        gkLongThrow.setSelected(false);
        leadership.setSelected(false);
        outsideFootShot.setSelected(false);
        powerHeader.setSelected(false);
        giantThrow.setSelected(false);
        
        GK.setSelected(false);
        LWB.setSelected(false);
        RWB.setSelected(false);
        LB.setSelected(false);
        RB.setSelected(false);
        CB.setSelected(false);
        LM.setSelected(false);
        RM.setSelected(false);
        CDM.setSelected(false);
        CM.setSelected(false);
        CAM.setSelected(false);
        LW.setSelected(false);
        RW.setSelected(false);
        CF.setSelected(false);
        ST.setSelected(false);
        
        regPos.setSelectedIndex(0);
        
        crossing.setText("");
        finishing.setText("");
        headingAcc.setText("");
        shortPass.setText("");
        volleys.setText("");
        
        dribbling.setText("");
        curve.setText("");
        fkAcc.setText("");
        longPass.setText("");
        ballControl.setText("");
        
        acceleration.setText("");
        sprintSpeed.setText("");
        agility.setText("");
        reactions.setText("");
        balance.setText("");
        
        shotPower.setText("");
        jumping.setText("");
        stamina.setText("");
        strenght.setText("");
        longShots.setText("");
        
        agression.setText("");
        interceptions.setText("");
        positioning.setText("");
        vision.setText("");
        penalties.setText("");
        composture.setText("");
        
        gkDiving1.setText("");
        gkHandling.setText("");
        gkKicking.setText("");
        gkPositioning.setText("");
        gkReflexes.setText("");
        
        marking.setText("");
        standTackle.setText("");
        slidTackle.setText("");
        
        name1.setText("");
        name2.setText("");
        
        wfAcc.setText("");
        wfAcc.setBackground(Color.white);
        wfFreq.setText("");
        wfFreq.setBackground(Color.white);
        consistency.setText("");
        consistency.setBackground(Color.white);
        condition.setText("");
        condition.setBackground(Color.white);
        injuryTolerancy.setText("");
        injuryTolerancy.setBackground(Color.white);
        foot.setText("");
        
        gk6.setSelected(false);
        cwp6.setSelected(false);
        cbt6.setSelected(false);
        sb6.setSelected(false);
        dm6.setSelected(false);
        wb6.setSelected(false);
        cm6.setSelected(false);
        sm6.setSelected(false);
        am6.setSelected(false);
        wg6.setSelected(false);
        ss6.setSelected(false);
        cf6.setSelected(false);
        
        regPos1.setSelectedIndex(0);
        
        attack.setText("");
        attack.setBackground(Color.white);
        defence.setText("");
        defence.setBackground(Color.white);
        balance1.setText("");
        balance1.setBackground(Color.white);
        stamina1.setText("");
        stamina1.setBackground(Color.white);
        speed.setText("");
        speed.setBackground(Color.white);
        acceleration1.setText("");
        acceleration1.setBackground(Color.white);
        response.setText("");
        response.setBackground(Color.white);
        agility1.setText("");
        agility1.setBackground(Color.white);
        dribbleAcc.setText("");
        dribbleAcc.setBackground(Color.white);
        dribbleSpeed.setText("");
        dribbleSpeed.setBackground(Color.white);
        shortPassAcc.setText("");
        shortPassAcc.setBackground(Color.white);
        shortPassSpeed.setText("");
        shortPassSpeed.setBackground(Color.white);
        longPassAcc.setText("");
        longPassAcc.setBackground(Color.white);
        longPassSpeed.setText("");
        longPassSpeed.setBackground(Color.white);
        shotAccuracy.setText("");
        shotAccuracy.setBackground(Color.white);
        shotPower1.setText("");
        shotPower1.setBackground(Color.white);
        shotTechnique.setText("");
        shotTechnique.setBackground(Color.white);
        fkAccuracy.setText("");
        fkAccuracy.setBackground(Color.white);
        swerve.setText("");
        swerve.setBackground(Color.white);
        heading.setText("");
        heading.setBackground(Color.white);
        jump.setText("");
        jump.setBackground(Color.white);
        technique.setText("");
        technique.setBackground(Color.white);
        agression1.setText("");
        agression1.setBackground(Color.white);
        mentality.setText("");
        mentality.setBackground(Color.white);
        gkSkills.setText("");
        gkSkills.setBackground(Color.white);
        teamWork.setText("");
        teamWork.setBackground(Color.white);
        
        dribbling1.setSelected(false);
        tacDrib.setSelected(false);
        position.setSelected(false);
        reaction.setSelected(false);
        playmaking.setSelected(false);
        passing.setSelected(false);
        scoring.setSelected(false);
        scoring1.setSelected(false);
        postPlayer.setSelected(false);
        lines.setSelected(false);
        moddleShoot.setSelected(false);
        side.setSelected(false);
        centre.setSelected(false);
        penalties1.setSelected(false);
        touchPass.setSelected(false);
        outside.setSelected(false);
        marking1.setSelected(false);
        sliding.setSelected(false);
        covering.setSelected(false);
        dLine.setSelected(false);
        penaltyStop.setSelected(false);
        stopper1.setSelected(false);
        longThrow.setSelected(false);
        
        positions="";
        foot1="";
        side1="";
        
    }//GEN-LAST:event_cleanActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        int limite = 15;
        if(name.getText().length()>=limite){
           evt.consume();
           JOptionPane.showMessageDialog(null, "Maximum 15 characters");
        }
    }//GEN-LAST:event_nameKeyTyped

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String alv = positions;
        escribir("stats.txt", alv);
        abrirarchivo("stats.txt");
//        JOptionPane.showMessageDialog(null, "stats.txt has been saved successfully");
    }//GEN-LAST:event_saveActionPerformed

    private void juanchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juanchoMouseClicked
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("https://www.facebook.com/shsjuan"));
                }
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_juanchoMouseClicked

    private void pesRetroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesRetroMouseClicked
       try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("http://www.foro.pesretro.net/index.php"));
                }
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_pesRetroMouseClicked
    
    String positions="";
    String side1="";
    public void position(){
        int index= regPos.getSelectedIndex();
        
        switch (index){
            case 0:
               regPos1.setSelectedIndex(0);
               side1="B";
               break;
            case 1:
               regPos1.setSelectedIndex(1);
               side1="L";
               break;
            case 2:
                regPos1.setSelectedIndex(1);
                side1="R";
                break;
            case 3:
                regPos1.setSelectedIndex(3);
                side1="L";
                break;
            case 4:
                regPos1.setSelectedIndex(3);
                side1="R";
                break;
            case 5:
                regPos1.setSelectedIndex(2);
                side1="B";
                break;
            case 6:
                regPos1.setSelectedIndex(7);
                side1="L";
                break;   
            case 7:
                regPos1.setSelectedIndex(7);
                side1="R";
                break;
            case 8:
                regPos1.setSelectedIndex(4);
                side1="B";
                break;
            case 9:
                regPos1.setSelectedIndex(6);
                side1="B";
                break;
            case 10:
                regPos1.setSelectedIndex(8);
                side1="B";
                break;
            case 11:
                regPos1.setSelectedIndex(9);
                side1="L";
                break;  
            case 12:
                regPos1.setSelectedIndex(9);
                side1="R";
                break; 
            case 13:
                regPos1.setSelectedIndex(10);
                side1="B";
                break; 
            case 14:
                regPos1.setSelectedIndex(11);
                side1="B";
                break;    
       }
        
        int x = regPos1.getSelectedIndex();
        if(GK.isSelected()){
            gk6.setSelected(true);
            if(x==0){
                positions+="GK★, ";
            } else{
                positions+="GK, ";
            }
        }
        if(LWB.isSelected()){
            cwp6.setSelected(true);
            if(x==1){
                positions+="CWP★, ";
            } else{
                positions+="CWP, ";
            }
        }
        if(RWB.isSelected()){
            cwp6.setSelected(true);
            if(x==1){
                positions+="CWP★, ";
            } else{
                positions+="CWP, ";
            }
        }
        if(CB.isSelected()){
            cbt6.setSelected(true);
            if(x==2){
                positions+="CBT★, ";
            } else{
                positions+="CBT, ";
            }
        }
        if(LB.isSelected()){
            sb6.setSelected(true);
            if(x==3){
                positions+="SB★, ";
            } else{
                positions+="SB, ";
            }
        }
        if(RB.isSelected()){
            sb6.setSelected(true);
            if(x==3){
                positions+="SB★, ";
            } else{
                positions+="SB, ";
            }
        }
        if(CDM.isSelected()){
            dm6.setSelected(true);
            if(x==4){
                positions+="DM★, ";
            } else{
                positions+="DM, ";
            }
        }
        if(LM.isSelected()){
            wb6.setSelected(true);
            sm6.setSelected(true);
            if(x==7){
                positions+="SM★, WB, ";
            } else{
                positions+="SM, WB, ";
            }
        }
        if(RM.isSelected()){
            wb6.setSelected(true);
            sm6.setSelected(true);
            if(x==7){
                positions+="SM★, WB, ";
            } else{
                positions+="SM, WB, ";
            }
        }
        if(CM.isSelected()){
            cm6.setSelected(true);
            if(x==6){
                positions+="CM★, ";
            } else{
                positions+="CM, ";
            }
        }
        if(CAM.isSelected()){
            am6.setSelected(true);
            if(x==8){
                positions+="AM★, ";
            } else{
                positions+="AM, ";
            }
        }
        if(LW.isSelected()){
            wg6.setSelected(true);
            if(x==9){
                positions+="WG★, ";
            } else{
                positions+="WG, ";
            }
        }
        if(RW.isSelected()){
            wg6.setSelected(true);
            if(x==9){
                positions+="WG★, ";
            } else{
                positions+="WG, ";
            }
        }
        if(CF.isSelected()){
            ss6.setSelected(true);
            if(x==10){
                positions+="SS★, ";
            } else{
                positions+="SS, ";
            }
        }
        if(ST.isSelected()){
            cf6.setSelected(true);
            if(x==11){
                positions+="CF★, ";
            } else{
                positions+="CF, ";
            }
        }
    }
    
    public void consis(){
        int cons = Integer.parseInt(overRating.getText());
        if(cons>=50&&cons<65){
            consistency.setText("4");
        }
        if(cons>=65&&cons<75){
            consistency.setText("5");
        }
        if(cons>=75&&cons<85){
            consistency.setText("6");
        }
        if(cons>=85&&cons<92){
            consistency.setText("7");
            consistency.setBackground(Color.orange);
        }
        if(cons>=92&&cons<100){
            consistency.setText("8");
            consistency.setBackground(Color.red);
        }
    }
    
    public void condition(){
        int consis = (Integer.parseInt(consistency.getText()))-1;
        condition.setText(""+consis);
        switch(consis){
            case 7:
                condition.setBackground(Color.orange);
                break;
            case 8:
                condition.setBackground(Color.red);
        }
        
    }
    
    public void wkFoot(){
       String wk = weakFoot.getSelectedItem().toString();
       int weak = Integer.parseInt(wk);
       switch (weak){
            case 1:
               wfAcc.setText("4");
               break;
            case 2:
                wfAcc.setText("5");
                break;
            case 3:
                wfAcc.setText("6");
                break;
            case 4:
                wfAcc.setText("7");
                wfAcc.setBackground(Color.orange);
                break;
            case 5:
                wfAcc.setText("8");
                wfAcc.setBackground(Color.red);
                break;
       }
       
       if(avoidsWKFoot.isSelected()){
           wfFreq.setText("3");
       } else{
           int lol = (Integer.parseInt(wfAcc.getText()))-1;
           wfFreq.setText(""+lol);
           switch (lol){
            case 7:
                wfFreq.setBackground(Color.orange);
                break;
            case 8:
                wfFreq.setBackground(Color.red);
                break;
       }
       }
    }
    
    public void defe(){
        int def = Integer.parseInt(marking.getText())+Integer.parseInt(standTackle.getText())+Integer.parseInt(slidTackle.getText());
        int defe = def/3;
        defence.setText(""+defe);
        color(defence);
    }
    
    public void gkStats(){
        
            int att = Integer.parseInt(attack.getText());
            att+=15;
            attack.setText(""+att);
            color(attack);
            
            defence.setText(gkPositioning.getText());
            color(defence);
            
            int sta = Integer.parseInt(stamina1.getText());
            sta+=25;
            stamina1.setText(""+sta);
            color(stamina1);
            
            int spd = Integer.parseInt(speed.getText());
            spd+=7;
            speed.setText(""+spd);
            color(speed);
            
            int acc = Integer.parseInt(acceleration1.getText());
            if(acc<60){
                acc+=20;
                acceleration1.setText(""+acc);
            } else{
                acc+=10;
                acceleration1.setText(""+acc);
            }
            color(acceleration1);
            
            response.setText(gkReflexes.getText());
            color(response);
            
            int agi = Integer.parseInt(agility1.getText());
            if(agi<60){
                agi+=25;
                agility1.setText(""+agi);
            } else{
                agi+=3;
                agility1.setText(""+agi);
            }
            color(agility1);
            
            int drib = Integer.parseInt(dribbleAcc.getText());
            drib+=40;
            dribbleAcc.setText(""+drib);
            color(dribbleAcc);
            
            int shorPA = Integer.parseInt(shortPassAcc.getText());
            if(shorPA<40){
                shorPA+=25;
            } else if(shorPA>40){
                shorPA+=20;
            }
            shortPassAcc.setText(""+shorPA);
            color(shortPassAcc);
            
            int shorPS = Integer.parseInt(shortPassSpeed.getText());
            shorPS+=10;
            shortPassSpeed.setText(""+shorPS);
            color(shortPassSpeed);
            
            int longPA = Integer.parseInt(longPassAcc.getText());
            if(longPA<35){
                longPA+=30;
            } else if(longPA>25){
                longPA+=25;
            }
            longPassAcc.setText(""+longPA);
            color(longPassAcc);
            
            int longPS = Integer.parseInt(longPassSpeed.getText());
            longPS+=20;
            longPassSpeed.setText(""+longPS);
            color(longPassSpeed);
            
            int shotAcc = Integer.parseInt(shotAccuracy.getText());
            shotAcc+=41;
            shotAccuracy.setText(""+shotAcc);
            color(shotAccuracy);
            
            shotPower1.setText(gkKicking.getText());
            color(shotPower1);
            
            int shotTec = Integer.parseInt(shotTechnique.getText());
            shotTec+=35;
            shotTechnique.setText(""+shotTec);
            color(shotTechnique);
            
            int FKA = Integer.parseInt(fkAccuracy.getText());
            FKA+=41;
            fkAccuracy.setText(""+FKA);
            color(fkAccuracy);
            
            int swe = Integer.parseInt(swerve.getText());
            swe+=41;
            swerve.setText(""+swe);
            color(swerve);
            
            int hea = Integer.parseInt(heading.getText());
            hea+=43;
            heading.setText(""+hea);
            color(heading);
            
            int jum = Integer.parseInt(jump.getText());
            jum+=5;
            jump.setText(""+jum);
            color(jump);
            
            int tec = Integer.parseInt(technique.getText());
            tec+=25;
            technique.setText(""+tec);
            color(technique);
            
            int men = Integer.parseInt(composture.getText());
            men+=10;
            mentality.setText(""+men);
            color(mentality);
            
//            int gk2 = Integer.parseInt(gkSkills.getText());
//            gk2+=5;
//            gkSkills.setText(""+gk2);
//            color(gkSkills);
            
            int tim = Integer.parseInt(reactions.getText());
            tim-=10;
            teamWork.setText(""+tim);
            color(teamWork);
    }
    
    public void shortPassSpeed(){
        int sum = Integer.parseInt(shortPass.getText())+Integer.parseInt(sprintSpeed.getText());
        int prom = sum/2;
        prom++;
        shortPassSpeed.setText(""+prom);
        color(shortPassSpeed);
    }
    
    public void longPassAcc(){
        int lon = Integer.parseInt(longPass.getText());
        int cro = Integer.parseInt(crossing.getText());
        if(lon>cro){
             longPassAcc.setText(longPass.getText());
        } else{
            longPassAcc.setText(crossing.getText());
        }
        color(longPassAcc);
    }
    
    public void longPassSpeed(){
        int sum = Integer.parseInt(longPassAcc.getText())+Integer.parseInt(sprintSpeed.getText());
        int prom = sum/2;
        prom++;
        longPassSpeed.setText(""+prom);
        color(longPassSpeed);
    }
    
    public void shotTec(){
        int vol = Integer.parseInt(volleys.getText());
        int lon = Integer.parseInt(longShots.getText());
        if(vol>lon){
            shotTechnique.setText(volleys.getText());
        } else{
            shotTechnique.setText(longShots.getText());
        }
        color(shotTechnique);
    }
    
     public void gk(){
        int sum = Integer.parseInt(gkDiving1.getText())+Integer.parseInt(gkHandling.getText())+Integer.parseInt(gkKicking.getText())+Integer.parseInt(gkPositioning.getText())+Integer.parseInt(gkReflexes.getText());
        int prom = sum/5;
        prom++;
        if(prom<50){
            gkSkills.setText("50");
        } else{
             gkSkills.setText(""+prom);
        }
        color(gkSkills);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CAM;
    private javax.swing.JCheckBox CB;
    private javax.swing.JCheckBox CDM;
    private javax.swing.JCheckBox CF;
    private javax.swing.JCheckBox CM;
    private javax.swing.JCheckBox GK;
    private javax.swing.JCheckBox LB;
    private javax.swing.JCheckBox LM;
    private javax.swing.JCheckBox LW;
    private javax.swing.JCheckBox LWB;
    private javax.swing.JCheckBox RB;
    private javax.swing.JCheckBox RM;
    private javax.swing.JCheckBox RW;
    private javax.swing.JCheckBox RWB;
    private javax.swing.JCheckBox ST;
    private javax.swing.JTextField acceleration;
    private javax.swing.JTextField acceleration1;
    private javax.swing.JTextField age;
    private javax.swing.JTextField agility;
    private javax.swing.JTextField agility1;
    private javax.swing.JTextField agression;
    private javax.swing.JTextField agression1;
    private javax.swing.JCheckBox am6;
    private javax.swing.JComboBox<String> attWR;
    private javax.swing.JTextField attack;
    private javax.swing.JRadioButton avoidsWKFoot;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField balance1;
    private javax.swing.JTextField ballControl;
    private javax.swing.JRadioButton beatOffside;
    private javax.swing.JCheckBox cbt6;
    private javax.swing.JRadioButton centre;
    private javax.swing.JCheckBox cf6;
    private javax.swing.JButton clean;
    private javax.swing.JRadioButton clinicalFinisher;
    private javax.swing.JCheckBox cm6;
    private javax.swing.JRadioButton completeDef;
    private javax.swing.JRadioButton completeFor;
    private javax.swing.JRadioButton completeMid;
    private javax.swing.JTextField composture;
    private javax.swing.JTextField condition;
    private javax.swing.JTextField consistency;
    private javax.swing.JButton convertButton;
    private javax.swing.JRadioButton covering;
    private javax.swing.JRadioButton crosser;
    private javax.swing.JTextField crossing;
    private javax.swing.JTextField curve;
    private javax.swing.JCheckBox cwp6;
    private javax.swing.JRadioButton dLine;
    private javax.swing.JTextField defence;
    private javax.swing.JRadioButton distanceShoot;
    private javax.swing.JRadioButton diver;
    private javax.swing.JCheckBox dm6;
    private javax.swing.JTextField dribbleAcc;
    private javax.swing.JTextField dribbleSpeed;
    private javax.swing.JRadioButton dribbler;
    private javax.swing.JTextField dribbling;
    private javax.swing.JRadioButton dribbling1;
    private javax.swing.ButtonGroup field;
    private javax.swing.JRadioButton finesseShot;
    private javax.swing.JTextField finishing;
    private javax.swing.JTextField fkAcc;
    private javax.swing.JTextField fkAccuracy;
    private javax.swing.JRadioButton fkSpecialist;
    private javax.swing.JRadioButton flair;
    private javax.swing.JTextField foot;
    private javax.swing.JRadioButton giantThrow;
    private javax.swing.JCheckBox gk6;
    private javax.swing.JTextField gkDiving1;
    private javax.swing.JTextField gkHandling;
    private javax.swing.JTextField gkKicking;
    private javax.swing.JRadioButton gkLongThrow;
    private javax.swing.JTextField gkPositioning;
    private javax.swing.JTextField gkReflexes;
    private javax.swing.JTextField gkSkills;
    private javax.swing.JRadioButton goalkeeper;
    private javax.swing.JTextField heading;
    private javax.swing.JTextField headingAcc;
    private javax.swing.JTextField height;
    private javax.swing.JRadioButton injuryFree;
    private javax.swing.JRadioButton injuryProne;
    private javax.swing.JTextField injuryTolerancy;
    private javax.swing.JTextField interceptions;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel juancho;
    private javax.swing.JTextField jump;
    private javax.swing.JTextField jumping;
    private javax.swing.JRadioButton leadership;
    private javax.swing.JRadioButton lines;
    private javax.swing.JTextField longPass;
    private javax.swing.JTextField longPassAcc;
    private javax.swing.JTextField longPassSpeed;
    private javax.swing.JTextField longShots;
    private javax.swing.JRadioButton longThrow;
    private javax.swing.JRadioButton longTrow;
    private javax.swing.JTextField marking;
    private javax.swing.JRadioButton marking1;
    private javax.swing.JTextField mentality;
    private javax.swing.JRadioButton moddleShoot;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JComboBox<String> nation;
    private javax.swing.JRadioButton outside;
    private javax.swing.JRadioButton outsideFootShot;
    private javax.swing.JTextField overRating;
    private javax.swing.JTabbedPane panelChido;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelStats;
    private javax.swing.JRadioButton passing;
    private javax.swing.JTextField penalties;
    private javax.swing.JRadioButton penalties1;
    private javax.swing.JRadioButton penaltyStop;
    private javax.swing.JPanel pes6;
    private javax.swing.JLabel pesRetro;
    private javax.swing.JRadioButton player;
    private javax.swing.JRadioButton playmaker;
    private javax.swing.JRadioButton playmaking;
    private javax.swing.JRadioButton poacher;
    private javax.swing.JRadioButton position;
    private javax.swing.JTextField positioning;
    private javax.swing.JRadioButton postPlayer;
    private javax.swing.JRadioButton powerFK;
    private javax.swing.JRadioButton powerHeader;
    private javax.swing.JComboBox<String> prefFoot;
    private javax.swing.JRadioButton reaction;
    private javax.swing.JTextField reactions;
    private javax.swing.JComboBox<String> regPos;
    private javax.swing.JComboBox<String> regPos1;
    private javax.swing.JTextField response;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox sb6;
    private javax.swing.JRadioButton scoring;
    private javax.swing.JRadioButton scoring1;
    private javax.swing.JTextField shortPass;
    private javax.swing.JTextField shortPassAcc;
    private javax.swing.JTextField shortPassSpeed;
    private javax.swing.JTextField shotAccuracy;
    private javax.swing.JTextField shotPower;
    private javax.swing.JTextField shotPower1;
    private javax.swing.JTextField shotTechnique;
    private javax.swing.JRadioButton side;
    private javax.swing.JTextField slidTackle;
    private javax.swing.JRadioButton sliding;
    private javax.swing.JCheckBox sm6;
    private javax.swing.JTextField speed;
    private javax.swing.JRadioButton speedster;
    private javax.swing.JTextField sprintSpeed;
    private javax.swing.JCheckBox ss6;
    private javax.swing.JTextField stamina;
    private javax.swing.JTextField stamina1;
    private javax.swing.JTextField standTackle;
    private javax.swing.JRadioButton stopper1;
    private javax.swing.JTextField strenght;
    private javax.swing.JTextField swerve;
    private javax.swing.JRadioButton tacDrib;
    private javax.swing.JRadioButton tackling;
    private javax.swing.JRadioButton tactician;
    private javax.swing.JTextField teamWork;
    private javax.swing.JTextField technique;
    private javax.swing.JRadioButton touchPass;
    private javax.swing.JTextField vision;
    private javax.swing.JTextField volleys;
    private javax.swing.JCheckBox wb6;
    private javax.swing.JComboBox<String> weakFoot;
    private javax.swing.JTextField weight;
    private javax.swing.JTextField wfAcc;
    private javax.swing.JTextField wfFreq;
    private javax.swing.JCheckBox wg6;
    // End of variables declaration//GEN-END:variables

    public void agress() {
       int wr = attWR.getSelectedIndex(), valorInicial=0, valorFinal=0, num=0;
       
       switch(wr){
           case 0:
            valorInicial=70;
            valorFinal=79;
            num=(int)(Math.random()*(valorFinal-valorInicial)+valorInicial);
            break;
            
           case 1:
            valorInicial=80;
            valorFinal=86;
            num=(int)(Math.random()*(valorFinal-valorInicial)+valorInicial);
            break;
            
           case 2:
            valorInicial=87;
            valorFinal=95;
            num=(int)(Math.random()*(valorFinal-valorInicial+1)+valorInicial);
            break;   
       }
       
       agression1.setText(""+num);
       color(agression1);
    }
    
    public String nation(){
        String nat="";
        int num = nation.getSelectedIndex();
        
        switch (num){
            case 0:
                nat = "Albanian";
                break;
            case 2:
                nat = "Armenia";
                break;
            case 3:
                nat = "Austrian";
                break;
            case 5:
                nat = "Belarusian";
                break;
            case 6:
                nat = "Belgian";
                break;
            case 7:
                nat = "Bosnian";
                break;
            case 8:
                nat = "Bulgarian";
                break;
            case 9:
                nat = "Croatian";
                break;
            case 10:
                nat = "Cyprus";
                break;
            case 11:
                nat = "Czech";
                break;
            case 12:
                nat = "Danish";
                break; 
            case 13:
                nat = "English";
                break; 
            case 16:
                nat = "Finish";
                break;
            case 17:
                nat = "French";
                break; 
            case 18:
                nat = "Macedonian";
                break;  
            case 19:
                nat = "Georgian";
                break;  
            case 20:
                nat = "German";
                break; 
            case 21:
                nat = "Greek";
                break; 
            case 22:
                nat = "Hungarian";
                break; 
            case 23:
                nat = "Icelandic";
                break;
            case 24:
                nat = "Irish";
                break; 
            case 25:
                nat = "Israeli";
                break; 
            case 26:
                nat = "Italian";
                break; 
            case 27:
                nat = "Latvia";
                break; 
            case 28:
                nat = "Liechtenstein";
                break; 
            case 29:
                nat = "Lithuania";
                break; 
            case 33:
                nat = "Dutch";
                break;   
            case 34:
                nat = "Northern Irish";
                break;   
            case 35:
                nat = "Norwegian";
                break;   
            case 36:
                nat = "Polish";
                break;   
            case 37:
                nat = "Portuguese";
                break;   
            case 38:
                nat = "Romanian";
                break;   
            case 39:
                nat = "Russian";
                break;   
            case 40:
                nat = "Scottish";
                break;   
            case 41:
                nat = "Slovak";
                break;   
            case 42:
                nat = "Slovenian";
                break;   
            case 43:
                nat = "Spanish";
                break;   
            case 44:
                nat = "Swedish";
                break;   
            case 45:
                nat = "Swiss";
                break;   
            case 46:
                nat = "Turkish";
                break;   
            case 47:
                nat = "Ukrainian";
                break;   
            case 48:
                nat = "Welsh";
                break;   
            case 49:
                nat = "Serbian";
                break;   
            case 51:
                nat = "Estonia";
                break; 
            case 53:
                nat = "Argentinian";
                break; 
            case 54:
                nat = "Bolivian";
                break; 
            case 55:
                nat = "Brazilian";
                break; 
            case 56:
                nat = "Chilean";
                break; 
            case 57:
                nat = "Colombian";
                break; 
            case 58:
                nat = "Ecuadorian";
                break; 
            case 59:
                nat = "Paraguayan";
                break; 
            case 60:
                nat = "Peruvian";
                break; 
            case 61:
                nat = "Uruguayan";
                break; 
            case 62:
                nat = "Venezuelan";
                break; 
            case 67:
                nat = "Canadian";
                break; 
            case 68:
                nat = "Costa Rican";
                break; 
            case 71:
                nat = "Grenada";
                break; 
            case 75:
                nat = "Honduran";
                break; 
            case 76:
                nat = "Mexican";
                break; 
            case 80:
                nat = "Panama";
                break; 
            case 85:
                nat = "Trinidadian";
                break; 
            case 86:
                nat = "American";
                break; 
            case 88:
                nat = "Algerian";
                break; 
            case 89:
                nat = "Angola";
                break; 
            case 90:
                nat = "Benin";
                break;  
            case 92:
                nat = "Burkina Faso";
                break;
            case 94:
                nat = "Cameroonian";
                break; 
            case 95:
                nat = "Cape Verde";
                break; 
            case 98:
                nat = "Congo";
                break;
            case 99:
                nat = "Ivorian";
                break; 
            case 100:
                nat = "DR Congo";
                break;
            case 101:
                nat = "Egypt";
                break;  
            case 102:
                nat = "Equatorial Guinea";
                break;
            case 105:
                nat = "Gabon";
                break;
            case 106:
                nat = "Gambia";
                break; 
            case 107:
                nat = "Ghanaian";
                break; 
            case 108:
                nat = "Guinea";
                break;
            case 109:
                nat = "Guinea-Bissau";
                break; 
            case 110:
                nat = "Kenya";
                break;
            case 111:
                nat = "Liberia";
                break;  
            case 112:
                nat = "Libya";
                break;
            case 114:
                nat = "Mali";
                break;
            case 117:
                nat = "Moroccan";
                break; 
            case 118:
                nat = "Mozambique";
                break;
            case 120:
                nat = "Nigerian";
                break; 
            case 123:
                nat = "Senegalese";
                break; 
            case 124:
                nat = "Sierra Leone";
                break; 
            case 125:
                nat = "South Africa";
                break;
            case 128:
                nat = "Togo";
                break;
            case 129:
                nat = "Tunisia";
                break;
            case 131:
                nat = "Zambia";
                break;
            case 132:
                nat = "Zimbabwean";
                break;
            case 136:
                nat = "China";
                break;
            case 141:
                nat = "Iran";
                break;
            case 143:
                nat = "Japanese";
                break; 
            case 146:
                nat = "South Korean";
                break;  
            case 149:
                nat = "Oman";
                break; 
            case 153:
                nat = "Saudi Arabia";
                break; 
            case 157:
                nat = "Uzbekistan";
                break;  
            case 158:
                nat = "Australian";
                break;  
            case 160:
                nat = "New Zealand";
                break;    
            default:
                nat= "Free Nationality";
                break;
        }
        return nat;
    }
    
    public void escribir(String nombre, String poci){
        File f;
        FileWriter w;
        BufferedWriter bw;
    
        try {
            FileOutputStream fos = new FileOutputStream(nombre);
            Writer wr = new OutputStreamWriter(fos, "UTF8");

            wr.write("Name: "+name1.getText());
            wr.write("\r\nShirt Name: "+name2.getText());
            wr.write("\r\nPositions: "+poci);
            wr.write("\r\n" + "\r\nNationality: "+nation());
            wr.write("\r\nAge: "+age.getText()+"\r\n" + "\r\nHeight: "+height.getText()+" cm"+"\r\nWeight: "+weight.getText()+" kg");
            wr.write("\r\n" + "\r\nInjury Tolerance: "+injuryTolerancy.getText()+"\r\nFoot: "+foot1+"\r\nSide: "+side1);
            wr.write("\r\n" + "\r\nAttack: "+attack.getText()+"\r\nDefence: "+defence.getText()+"\r\nBalance: "+balance1.getText()+"\r\nStamina: "+stamina1.getText()+"\r\nSpeed: "+speed.getText()+"\r\nAcceleration: "+acceleration1.getText()+"\r\nResponse: "+response.getText()+"\r\nAgility: "+agility1.getText()+"\r\nDribble Accuracy: "+dribbleAcc.getText()+"\r\nDribble Speed: "+dribbleSpeed.getText()+"\r\nShort Pass Accuracy: "+shortPassAcc.getText()+"\r\nShort Pass Speed: "+shortPassSpeed.getText()+"\r\nLong Pass Accuracy: "+longPassAcc.getText()+"\r\nLong Pass Speed: "+longPassSpeed.getText()+"\r\nShot Accuracy: "+shotAccuracy.getText()+"\r\nShot Power: "+shotPower1.getText()+"\r\nShot Technique: "+shotTechnique.getText()+"\r\nFree Kick Accuracy: "+fkAccuracy.getText()+"\r\nSwerve: "+swerve.getText()+"\r\nHeading: "+heading.getText()+"\r\nJump: "+jump.getText()+"\r\nTechnique: "+technique.getText()+"\r\nAggression: "+agression1.getText()+"\r\nMentality: "+mentality.getText()+"\r\nGK Skills: "+gkSkills.getText()+"\r\nTeam Work: "+teamWork.getText());
            wr.write("\r\n" + "\r\nConsistency: " +consistency.getText()+"\r\nCondition/Fitness: "+condition.getText()+"\r\nWeak Foot Accuracy: "+wfAcc.getText()+"\r\nWeak Foot Frequency: "+wfFreq.getText());
            wr.write("\r\n" + "\r\nSPECIAL ABILITIES:" +specialA());
            wr.close();
            fos.close();
            
            
        } catch (Exception e) {
        }
    }
    
    public String specialA(){
        String alv = "";
        if(dribbling1.isSelected()){
            alv+="\r\n★Dribbling";
        }
        if (tacDrib.isSelected()) {
           alv+="\r\n★Tactical Dribble"; 
        }
        if (position.isSelected()) {
           alv+="\r\n★Positioning"; 
        }
        if (reaction.isSelected()) {
           alv+="\r\n★Reaction"; 
        }
        if (playmaking.isSelected()) {
           alv+="\r\n★Playmaking"; 
        }
        if (passing.isSelected()) {
           alv+="\r\n★Passing"; 
        }
        if (scoring.isSelected()) {
           alv+="\r\n★Scoring"; 
        }
        if (scoring1.isSelected()) {
           alv+="\r\n★1-1 Scoring"; 
        }
        if (postPlayer.isSelected()) {
           alv+="\r\n★Post Player"; 
        }
        if (lines.isSelected()) {
           alv+="\r\n★Lines"; 
        }
        if (moddleShoot.isSelected()) {
           alv+="\r\n★Middle Schooting"; 
        }
        if (side.isSelected()) {
           alv+="\r\n★Side"; 
        }
        if (centre.isSelected()) {
           alv+="\r\n★Centre"; 
        }
        if (penalties1.isSelected()) {
           alv+="\r\n★Penalties"; 
        }
        if (touchPass.isSelected()) {
           alv+="\r\n★1-Touch Pass"; 
        }
        if (outside.isSelected()) {
           alv+="\r\n★Outside"; 
        }
        if (marking1.isSelected()) {
           alv+="\r\n★Marking"; 
        }
        if (sliding.isSelected()) {
           alv+="\r\n★Sliding"; 
        }
        if (covering.isSelected()) {
           alv+="\r\n★Covering"; 
        }
        if (dLine.isSelected()) {
           alv+="\r\n★D-Line Control"; 
        }
        if (penaltyStop.isSelected()) {
           alv+="\r\n★Penalty Stopper"; 
        }
        if (stopper1.isSelected()) {
           alv+="\r\n★1-On-1 Stopper"; 
        }
        if (longThrow.isSelected()) {
           alv+="\r\n★Long Throw"; 
        }
        return alv;
    }
    
    public void abrirarchivo(String archivo){

     try {
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }

    }       
}
