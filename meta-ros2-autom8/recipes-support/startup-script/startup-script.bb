DESCRIPTON = "Startup script to launch commands at startup"
LICENSE = "CLOSED"

RDEPENDS_${PN} += "bash"
SRC_URI = " file://startup-script-001 "

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/startup-script-001  ${D}${sysconfdir}/init.d/
    install -d ${D}${sysconfdir}/rcS.d
    install -d ${D}${sbindir}
    ln -sf ../init.d/startup-script-001  ${D}${sysconfdir}/rcS.d/S90startup-script-001
    
}
