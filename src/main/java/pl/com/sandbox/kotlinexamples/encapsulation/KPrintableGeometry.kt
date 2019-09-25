package pl.com.sandbox.kotlinexamples.encapsulation

class KPrintableGeometry(geometry: IGeometry, printAttributes: IPrintableGeometry) : IGeometry by geometry,
    IPrintableGeometry by printAttributes