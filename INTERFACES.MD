# Código de interfaces 

<!-- Agregar y Registro de Libro -->
<!DOCTYPE html><html lang="es" style=""><head><meta charset="utf-8"><meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover" name="viewport"><link href="https://fonts.googleapis.com" rel="preconnect"><link crossorigin="" href="https://fonts.gstatic.com" rel="preconnect"><link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&amp;family=Manrope:wght@600;700&amp;family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0&amp;display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:wght,FILL@100..700,0..1&amp;display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&amp;family=Manrope:wght@100..900&amp;display=swap" rel="stylesheet"><style>@layer base{html,body{width:100vw;margin:0;padding:0;}body{overscroll-behavior:none;}.pb-safe{padding-bottom:env(safe-area-inset-bottom,0px);}.pt-safe{padding-top:env(safe-area-inset-top,0px);}main>:first-child{margin-top:0!important;}main>:last-child{margin-bottom:0!important;}}::-webkit-scrollbar{display:none;}</style><script src="https://cdn.tailwindcss.com"></script><script id="tailwind-config">tailwind.config = { darkMode: "class", theme: { extend: { "colors": { "surface-container-high": "#e6e8ea", "on-error": "#ffffff", "on-secondary-container": "#fffbff", "surface-container-lowest": "#ffffff", "primary-fixed": "#d8e3fb", "inverse-surface": "#2d3133", "secondary": "#4b41e1", "surface": "#f7f9fb", "on-surface": "#191c1e", "secondary-container": "#645efb", "inverse-primary": "#bcc7de", "primary-container": "#1e293b", "tertiary-fixed": "#6ffbbe", "on-primary-container": "#8590a6", "on-tertiary-fixed": "#002113", "outline": "#75777d", "surface-container-low": "#f2f4f6", "tertiary-fixed-dim": "#4edea3", "on-primary": "#ffffff", "surface-container": "#eceef0", "outline-variant": "#c5c6cd", "on-error-container": "#93000a", "on-tertiary-fixed-variant": "#005236", "error": "#ba1a1a", "on-tertiary": "#ffffff", "surface-variant": "#e0e3e5", "background": "#f7f9fb", "on-secondary-fixed": "#0f0069", "secondary-fixed-dim": "#c3c0ff", "tertiary": "#00190e", "tertiary-container": "#00301e", "secondary-fixed": "#e2dfff", "on-primary-fixed-variant": "#3c475a", "primary-fixed-dim": "#bcc7de", "inverse-on-surface": "#eff1f3", "on-background": "#191c1e", "on-surface-variant": "#45474c", "surface-dim": "#d8dadc", "on-secondary-fixed-variant": "#3323cc", "on-secondary": "#ffffff", "surface-container-highest": "#e0e3e5", "on-tertiary-container": "#00a472", "primary": "#091426", "surface-tint": "#545f73", "surface-bright": "#f7f9fb", "on-primary-fixed": "#111c2d", "error-container": "#ffdad6" }, "borderRadius": { "DEFAULT": "0.25rem", "lg": "0.5rem", "xl": "0.75rem", "full": "9999px" }, "spacing": { "space-2xs": "0.25rem", "screen-margin-tablet": "1.5rem", "space-xl": "1.5rem", "card-padding": "1rem", "screen-margin-mobile": "1rem", "bottom-nav-height": "4.5rem", "space-xs": "0.5rem", "space-2xl": "2rem", "space-sm": "0.75rem", "space-md": "1rem", "space-lg": "1.25rem", "space-3xl": "2.5rem" }, "fontFamily": { "headline-lg": ["Manrope"], "headline-md": ["Manrope"], "label-lg": ["Inter"], "body-md": ["Inter"], "body-sm": ["Inter"], "headline-lg-mobile": ["Manrope"], "body-lg": ["Inter"], "title-md": ["Manrope"], "label-md": ["Inter"], "label-sm": ["Inter"], "display-lg": ["Manrope"] }, "fontSize": { "headline-lg": ["28px", { "lineHeight": "36px", "letterSpacing": "-0.015em", "fontWeight": "700" }], "headline-md": ["20px", { "lineHeight": "28px", "letterSpacing": "-0.01em", "fontWeight": "600" }], "label-lg": ["14px", { "lineHeight": "20px", "letterSpacing": "0.01em", "fontWeight": "600" }], "body-md": ["14px", { "lineHeight": "22px", "letterSpacing": "0em", "fontWeight": "400" }], "body-sm": ["12px", { "lineHeight": "18px", "letterSpacing": "0.01em", "fontWeight": "400" }], "headline-lg-mobile": ["24px", { "lineHeight": "32px", "letterSpacing": "-0.01em", "fontWeight": "700" }], "body-lg": ["16px", { "lineHeight": "26px", "letterSpacing": "-0.005em", "fontWeight": "400" }], "title-md": ["16px", { "lineHeight": "24px", "letterSpacing": "0em", "fontWeight": "600" }], "label-md": ["12px", { "lineHeight": "16px", "letterSpacing": "0.02em", "fontWeight": "500" }], "label-sm": ["10px", { "lineHeight": "14px", "letterSpacing": "0.04em", "fontWeight": "600" }], "display-lg": ["36px", { "lineHeight": "44px", "letterSpacing": "-0.02em", "fontWeight": "700" }] } } } }</script></head><body class="bg-surface text-on-surface font-body-md text-body-md flex flex-col min-h-screen"><header class="fixed top-0 w-full z-50 pt-safe bg-surface/80 backdrop-blur-xl shadow-[0_1px_8px_rgba(0,0,0,0.04)]"><div class="h-16 px-screen-margin-mobile flex items-center justify-between"><div class="flex items-center gap-space-sm"><div class="w-9 h-9 rounded-xl bg-surface-container flex items-center justify-center"><span class="material-symbols-outlined text-secondary text-[22px]">auto_stories</span></div><div class="flex flex-col"><span class="font-headline-md text-headline-md text-on-surface tracking-tight leading-none">Mylib</span><div class="flex items-center gap-1.5 mt-0.5"><span class="font-label-sm text-label-sm text-on-surface-variant">Nueva entrada</span></div></div></div><div class="flex items-center gap-space-xs"><button class="w-11 h-11 flex items-center justify-center text-on-surface-variant hover:text-on-surface transition-colors"><span class="material-symbols-outlined text-[22px]">cloud_done</span></button><div class="w-8 h-8 rounded-full bg-primary flex items-center justify-center"><span class="material-symbols-outlined text-on-primary text-[18px]">person</span></div></div></div></header><main class="flex-1 flex flex-col relative w-full pt-16 pb-bottom-nav-height bg-surface"><div class="flex flex-col w-full px-screen-margin-mobile pb-space-2xl gap-space-lg"><div class="flex flex-col gap-1 pt-2"><h1 class="font-headline-md text-headline-md text-on-surface font-bold">Registrar lectura</h1><p class="font-body-sm text-body-sm text-on-surface-variant">Añade los libros y avances a tu biblioteca personal</p></div><div class="bg-surface-container-lowest p-space-lg rounded-xl shadow-sm flex flex-col gap-space-md"><form class="flex flex-col gap-space-md" id="bookForm" onsubmit="return false;"><div class="flex flex-col gap-1.5"><label class="font-label-md text-label-md text-on-surface font-medium" for="bookTitle">Título del libro</label><div class="relative flex items-center"><span class="material-symbols-outlined absolute left-3.5 text-on-surface-variant text-[20px] pointer-events-none">menu_book</span><input class="w-full h-13 pl-11 pr-4 bg-surface-container-low text-on-surface font-body-md text-body-md rounded-lg outline-none focus:bg-surface-container-lowest focus:shadow-[0_0_0_2px_#4b41e1] transition-all placeholder:text-outline" id="bookTitle" placeholder="ej. Cien años de soledad" type="text" value="Cien años de soledad"></div></div><div class="flex flex-col gap-1.5"><label class="font-label-md text-label-md text-on-surface font-medium" for="bookAuthor">Autor</label><div class="relative flex items-center"><span class="material-symbols-outlined absolute left-3.5 text-on-surface-variant text-[20px] pointer-events-none">person</span><input class="w-full h-13 pl-11 pr-4 bg-surface-container-low text-on-surface font-body-md text-body-md rounded-lg outline-none focus:bg-surface-container-lowest focus:shadow-[0_0_0_2px_#4b41e1] transition-all placeholder:text-outline" id="bookAuthor" placeholder="ej. Gabriel García Márquez" type="text" value="Gabriel García Márquez"></div></div><div class="flex flex-col gap-1.5"><label class="font-label-md text-label-md text-on-surface font-medium" for="bookPages">Páginas totales</label><div class="relative flex items-center"><span class="material-symbols-outlined absolute left-3.5 text-on-surface-variant text-[20px] pointer-events-none">auto_stories</span><input class="w-full h-13 pl-11 pr-4 bg-surface-container-low text-on-surface font-body-md text-body-md rounded-lg outline-none focus:bg-surface-container-lowest focus:shadow-[0_0_0_2px_#4b41e1] transition-all placeholder:text-outline" id="bookPages" inputmode="numeric" min="1" placeholder="ej. 320" type="number" value="320"></div></div><div class="flex flex-col gap-1.5"><label class="font-label-md text-label-md text-on-surface font-medium">Portada del libro</label><label class="flex flex-col items-center justify-center w-full h-28 border-2 border-dashed border-outline-variant hover:border-secondary rounded-xl bg-surface-container-low/60 hover:bg-surface-container-low transition-colors cursor-pointer group px-4 py-3 relative" for="bookCoverInput"><input accept="image/*" class="hidden" id="bookCoverInput" type="file"><div class="flex flex-col items-center justify-center gap-1"><div class="w-10 h-10 rounded-full bg-surface-container flex items-center justify-center text-secondary group-hover:scale-105 transition-transform"><span class="material-symbols-outlined text-[22px]">add_photo_alternate</span></div><div class="flex items-center gap-1.5"><span class="font-label-sm text-label-sm font-semibold text-secondary">Subir foto / carátula</span><span class="font-body-sm text-body-sm text-on-surface-variant">(PNG, JPG)</span></div><span class="font-label-sm text-label-sm text-outline">Toca para seleccionar archivo</span></div></label></div><div class="flex flex-col sm:flex-row gap-space-sm pt-2"><button class="w-full h-12 rounded-lg bg-primary text-on-primary font-label-lg text-label-lg flex items-center justify-center gap-2 active:scale-[0.98] transition-transform shadow-sm" id="btnSave" type="button"><span class="material-symbols-outlined text-[20px]">save</span><span class="">Guardar</span></button><button class="w-full h-12 rounded-lg bg-surface-container text-on-surface font-label-lg text-label-lg flex items-center justify-center gap-2 active:scale-[0.98] transition-transform" id="btnRead" type="button"><span class="material-symbols-outlined text-[20px]">visibility</span><span class="">Ver registro</span></button></div></form></div><div class="flex flex-col gap-space-xs"><span class="font-label-md text-label-md text-on-surface font-semibold px-1">Último registro guardado</span><div class="bg-surface-container-lowest rounded-xl p-space-md shadow-sm flex flex-col gap-space-sm border border-surface-container"><div class="flex items-start justify-between"><div class="flex items-center gap-space-xs"><div class="w-9 h-9 rounded-lg bg-secondary-fixed flex items-center justify-center text-on-secondary-fixed-variant"><span class="material-symbols-outlined text-[20px]">book</span></div><div><h3 class="font-label-lg text-label-lg text-on-surface font-semibold" id="displayTitle">Cien años de soledad</h3><p class="font-body-sm text-body-sm text-on-surface-variant" id="displayAuthor">Gabriel García Márquez</p></div></div><span class="font-label-sm text-label-sm text-on-tertiary-container bg-tertiary-fixed px-2 py-0.5 rounded-full font-medium">Guardado</span></div><div class="flex items-center justify-between pt-2 border-t border-surface-container text-on-surface-variant"><span class="font-body-sm text-body-sm">Páginas totales</span><span class="font-label-md text-label-md font-semibold text-on-surface" id="displayPages">320 págs.</span></div></div></div></div>
<script>
  (function() {
    const inputTitle = document.getElementById('bookTitle');
    const inputAuthor = document.getElementById('bookAuthor');
    const inputPages = document.getElementById('bookPages');
    const btnSave = document.getElementById('btnSave');
    const btnRead = document.getElementById('btnRead');
    const saveFeedback = document.getElementById('saveFeedback');
    const labelSave = document.getElementById('labelSave');
    const iconSave = document.getElementById('iconSave');
    const parsedDisplay = document.getElementById('parsedContentDisplay');
    const logcatSpan = document.getElementById('logcatConsoleSpan');
    const fileTimestamp = document.getElementById('fileTimestamp');

    // Local in-memory representation of Android internal storage file
    let internalFileContent = "Título: Cien años de soledad | Autor: Gabriel García Márquez | Páginas: 142";

    // Format current time for file metadata
    function getCurrentFormattedTime() {
      const d = new Date();
      let hours = d.getHours();
      const minutes = d.getMinutes().toString().padStart(2, '0');
      const ampm = hours >= 12 ? 'PM' : 'AM';
      hours = hours % 12 || 12;
      return `Modificado: Hoy, ${hours}:${minutes} ${ampm}`;
    }

    // Save Action (Simulating openFileOutput(FILENAME, Context.MODE_PRIVATE))
    btnSave.addEventListener('click', () => {
      const title = inputTitle.value.trim() || "Sin Título";
      const author = inputAuthor.value.trim() || "Anónimo";
      const pages = inputPages.value.trim() || "0";

      // Serialize text line
      internalFileContent = `Título: ${title} | Autor: ${author} | Páginas: ${pages}`;

      // Visual write feedback
      labelSave.textContent = "Guardando...";
      iconSave.textContent = "hourglass_top";
      btnSave.classList.add('opacity-80');

      setTimeout(() => {
        labelSave.textContent = "¡Guardado!";
        iconSave.textContent = "check";
        saveFeedback.classList.remove('hidden');
        saveFeedback.classList.add('flex');
        fileTimestamp.textContent = getCurrentFormattedTime();

        setTimeout(() => {
          labelSave.textContent = "Guardar";
          iconSave.textContent = "save";
          btnSave.classList.remove('opacity-80');
          saveFeedback.classList.add('hidden');
          saveFeedback.classList.remove('flex');
        }, 2200);
      }, 350);
    });

    // Read Action (Simulating openFileInput() and Log.d())
    btnRead.addEventListener('click', () => {
      btnRead.classList.add('scale-95');
      setTimeout(() => btnRead.classList.remove('scale-95'), 120);

      // Update screen text
      parsedDisplay.innerHTML = `“${internalFileContent}”`;

      // Update Logcat output simulation
      const logMessage = `Leyendo registro: ${internalFileContent}`;
      logcatSpan.textContent = logMessage;
      
      // Pulse log container for tactile feedback
      logcatSpan.parentElement.classList.add('bg-primary');
      setTimeout(() => {
        logcatSpan.parentElement.classList.remove('bg-primary');
      }, 300);
    });
})();
</script></main><nav class="fixed bottom-0 w-full z-50 pb-safe bg-surface/85 backdrop-blur-xl shadow-[0_-4px_16px_rgba(0,0,0,0.03)]" data-active-classes="[&amp;_[data-pill]]:bg-secondary-fixed [&amp;_[data-pill]]:w-16 [&amp;_[data-icon]]:text-secondary [&amp;_[data-label]]:font-label-lg [&amp;_[data-label]]:text-on-surface"><div class="flex justify-around items-center h-bottom-nav-height px-screen-margin-mobile"><a class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface" data-path="ahora" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">menu_book</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Ahora</span></a><a class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface" data-path="registros" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">inventory_2</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Registros</span></a><a aria-current="page" class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface [&amp;_[data-pill]]:bg-secondary-fixed [&amp;_[data-pill]]:w-16 [&amp;_[data-icon]]:text-secondary [&amp;_[data-label]]:font-label-lg [&amp;_[data-label]]:text-on-surface" data-path="agregar-libro" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">library_add</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Agregar Libro</span></a></div></nav>

</body></html>

<!-- LectorApp Logo -->
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100" fill="none"><rect width="100" height="100" rx="24" fill="#1E293B"/><path d="M26 34C26 30 30 28 36 28C44 28 48 31 50 34C52 31 56 28 64 28C70 28 74 30 74 34V68C74 72 70 74 64 74C56 74 52 71 50 68C48 71 44 74 36 74C30 74 26 72 26 68V34Z" fill="#4F46E5" fill-opacity="0.25" stroke="#818CF8" stroke-width="3" stroke-linecap="round" stroke-linejoin="round"/><path d="M50 34V68" stroke="#818CF8" stroke-width="3" stroke-linecap="round"/><circle cx="68" cy="24" r="4" fill="#10B981"/></svg>

<!-- Ahora - Lecturas en Curso -->
<!DOCTYPE html><html lang="es" style=""><head><meta charset="utf-8"><meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover" name="viewport"><link href="https://fonts.googleapis.com" rel="preconnect"><link crossorigin="" href="https://fonts.gstatic.com" rel="preconnect"><link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&amp;family=Manrope:wght@600;700&amp;family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0&amp;display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:wght,FILL@100..700,0..1&amp;display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&amp;family=Manrope:wght@100..900&amp;display=swap" rel="stylesheet"><style>@layer base{html,body{width:100vw;margin:0;padding:0;}body{overscroll-behavior:none;}.pb-safe{padding-bottom:env(safe-area-inset-bottom,0px);}.pt-safe{padding-top:env(safe-area-inset-top,0px);}main>:first-child{margin-top:0!important;}main>:last-child{margin-bottom:0!important;}}::-webkit-scrollbar{display:none;}</style><script src="https://cdn.tailwindcss.com"></script><script id="tailwind-config">tailwind.config = { darkMode: "class", theme: { extend: { "colors": { "surface-container-high": "#e6e8ea", "on-error": "#ffffff", "on-secondary-container": "#fffbff", "surface-container-lowest": "#ffffff", "primary-fixed": "#d8e3fb", "inverse-surface": "#2d3133", "secondary": "#4b41e1", "surface": "#f7f9fb", "on-surface": "#191c1e", "secondary-container": "#645efb", "inverse-primary": "#bcc7de", "primary-container": "#1e293b", "tertiary-fixed": "#6ffbbe", "on-primary-container": "#8590a6", "on-tertiary-fixed": "#002113", "outline": "#75777d", "surface-container-low": "#f2f4f6", "tertiary-fixed-dim": "#4edea3", "on-primary": "#ffffff", "surface-container": "#eceef0", "outline-variant": "#c5c6cd", "on-error-container": "#93000a", "on-tertiary-fixed-variant": "#005236", "error": "#ba1a1a", "on-tertiary": "#ffffff", "surface-variant": "#e0e3e5", "background": "#f7f9fb", "on-secondary-fixed": "#0f0069", "secondary-fixed-dim": "#c3c0ff", "tertiary": "#00190e", "tertiary-container": "#00301e", "secondary-fixed": "#e2dfff", "on-primary-fixed-variant": "#3c475a", "primary-fixed-dim": "#bcc7de", "inverse-on-surface": "#eff1f3", "on-background": "#191c1e", "on-surface-variant": "#45474c", "surface-dim": "#d8dadc", "on-secondary-fixed-variant": "#3323cc", "on-secondary": "#ffffff", "surface-container-highest": "#e0e3e5", "on-tertiary-container": "#00a472", "primary": "#091426", "surface-tint": "#545f73", "surface-bright": "#f7f9fb", "on-primary-fixed": "#111c2d", "error-container": "#ffdad6" }, "borderRadius": { "DEFAULT": "0.25rem", "lg": "0.5rem", "xl": "0.75rem", "full": "9999px" }, "spacing": { "space-2xs": "0.25rem", "screen-margin-tablet": "1.5rem", "space-xl": "1.5rem", "card-padding": "1rem", "screen-margin-mobile": "1rem", "bottom-nav-height": "4.5rem", "space-xs": "0.5rem", "space-2xl": "2rem", "space-sm": "0.75rem", "space-md": "1rem", "space-lg": "1.25rem", "space-3xl": "2.5rem" }, "fontFamily": { "headline-lg": ["Manrope"], "headline-md": ["Manrope"], "label-lg": ["Inter"], "body-md": ["Inter"], "body-sm": ["Inter"], "headline-lg-mobile": ["Manrope"], "body-lg": ["Inter"], "title-md": ["Manrope"], "label-md": ["Inter"], "label-sm": ["Inter"], "display-lg": ["Manrope"] }, "fontSize": { "headline-lg": ["28px", { "lineHeight": "36px", "letterSpacing": "-0.015em", "fontWeight": "700" }], "headline-md": ["20px", { "lineHeight": "28px", "letterSpacing": "-0.01em", "fontWeight": "600" }], "label-lg": ["14px", { "lineHeight": "20px", "letterSpacing": "0.01em", "fontWeight": "600" }], "body-md": ["14px", { "lineHeight": "22px", "letterSpacing": "0em", "fontWeight": "400" }], "body-sm": ["12px", { "lineHeight": "18px", "letterSpacing": "0.01em", "fontWeight": "400" }], "headline-lg-mobile": ["24px", { "lineHeight": "32px", "letterSpacing": "-0.01em", "fontWeight": "700" }], "body-lg": ["16px", { "lineHeight": "26px", "letterSpacing": "-0.005em", "fontWeight": "400" }], "title-md": ["16px", { "lineHeight": "24px", "letterSpacing": "0em", "fontWeight": "600" }], "label-md": ["12px", { "lineHeight": "16px", "letterSpacing": "0.02em", "fontWeight": "500" }], "label-sm": ["10px", { "lineHeight": "14px", "letterSpacing": "0.04em", "fontWeight": "600" }], "display-lg": ["36px", { "lineHeight": "44px", "letterSpacing": "-0.02em", "fontWeight": "700" }] } } } }</script></head><body class="bg-surface text-on-surface font-body-md text-body-md flex flex-col min-h-screen"><header class="fixed top-0 w-full z-50 pt-safe bg-surface/80 backdrop-blur-xl shadow-[0_1px_8px_rgba(0,0,0,0.04)]"><div class="h-16 px-screen-margin-mobile flex items-center justify-between"><div class="flex items-center gap-space-sm"><div class="w-9 h-9 rounded-xl bg-surface-container flex items-center justify-center"><span class="material-symbols-outlined text-secondary text-[22px]">auto_stories</span></div><div class="flex flex-col"><span class="font-headline-md text-headline-md text-on-surface tracking-tight leading-none">Mylib</span><div class="flex items-center gap-1.5 mt-0.5"><span class="w-1.5 h-1.5 rounded-full bg-on-tertiary-container"></span><span class="font-label-sm text-label-sm text-on-surface-variant">Ahora</span></div></div></div><div class="flex items-center gap-space-xs"><button class="w-11 h-11 flex items-center justify-center text-on-surface-variant hover:text-on-surface transition-colors"><span class="material-symbols-outlined text-[22px]">cloud_done</span></button><div class="w-8 h-8 rounded-full bg-primary flex items-center justify-center"><span class="material-symbols-outlined text-on-primary text-[18px]">person</span></div></div></div></header><main class="flex-1 flex flex-col relative w-full pt-16 pb-bottom-nav-height bg-surface"><div class="flex flex-col w-full px-screen-margin-mobile pb-space-2xl gap-space-lg">
<!-- Top Literary Status & Streak Banner -->
<section class="flex items-center justify-between pt-space-sm pb-1"><div class="flex flex-col"><h1 class="font-headline-lg-mobile text-headline-lg-mobile text-on-surface tracking-tight font-bold">Leyendo Ahora</h1><p class="font-body-sm text-body-sm text-on-surface-variant">2 libros en curso</p></div><div class="inline-flex items-center gap-1.5 bg-surface-container-high px-3 py-1.5 rounded-full"><span class="material-symbols-outlined text-[18px] text-tertiary-container" style="font-variation-settings: 'FILL' 1;">local_fire_department</span><span class="font-label-sm text-label-sm font-semibold text-on-surface">12 días</span></div></section>
<!-- Hero Reading Card: El Principito -->
<article class="flex flex-col bg-surface-container-lowest rounded-2xl p-card-padding shadow-sm gap-space-md"><div class="flex gap-space-md items-center"><div class="relative w-16 flex-shrink-0 aspect-[2/3] rounded-lg overflow-hidden bg-surface-container-high shadow-sm"><img class="w-full h-full object-cover" alt="Hábitos Atómicos" src="https://lh3.googleusercontent.com/aida-public/AB6AXuDShjJuuSuQjt73nESoF77ykAMHCN5Ie9lGeOCcw1KM2s8rEd7S05kUHm0LYyH4SQlgtCAKZDc99QRTJ2p9QU7LTqSHUZlZyb9QjKJ8faKuma8EWwrtBVase1-JBRxadosbkKOWGkkiZxxbR74AA6btuSPUG9k_jdNLjgWEEAqkfxaxhlb2dnloBWc-wgv46Xxt3g6MBUNebyhWo3MqY452GoYGP-PwyE2-a3n6H5L_0mW8aIPqgzEk"></div><div class="flex flex-col flex-1 min-w-0"><div class="flex items-center justify-between"><h3 class="font-title-md text-title-md text-on-surface font-semibold truncate leading-tight">Hábitos Atómicos</h3><span class="font-label-sm text-label-sm font-bold text-on-surface-variant bg-surface-container px-2 py-0.5 rounded-md">37%</span></div><p class="font-body-sm text-body-sm text-on-surface-variant truncate mt-0.5">James Clear</p><div class="mt-3"><div class="flex items-center justify-between font-label-sm text-label-sm text-on-surface-variant mb-1.5"><span class="">Pág. 120 de 320 totales</span><span class="text-[12px]">200 restantes</span></div><div class="w-full bg-surface-container h-1.5 rounded-full overflow-hidden"><div class="bg-secondary h-full rounded-full" style="width: 37.5%;"></div></div></div></div></div><div class="flex items-center gap-2 pt-1"><button class="flex-1 h-11 bg-surface-container-low hover:bg-surface-container text-on-surface rounded-xl flex items-center justify-center gap-2 font-label-md text-label-md transition-colors" onclick="showToast('Página actualizada')"><span class="material-symbols-outlined text-[18px]">bookmark_add</span><span class="">Actualizar página</span></button><button class="h-11 px-4 bg-surface-container-low hover:bg-surface-container text-on-surface font-label-md text-label-md font-semibold rounded-xl flex items-center justify-center active:scale-95 transition-transform" onclick="showToast('+1 pág registrada')">+1 pág</button></div></article>
<!-- Secondary Reading Card: Hábitos Atómicos -->
<article class="flex flex-col bg-surface-container-lowest rounded-2xl p-card-padding shadow-sm gap-space-md"><div class="flex gap-space-md items-center"><div class="relative w-16 flex-shrink-0 aspect-[2/3] rounded-lg overflow-hidden bg-surface-container-high shadow-sm"><img class="w-full h-full object-cover" alt="Hábitos Atómicos" src="https://lh3.googleusercontent.com/aida-public/AB6AXuDShjJuuSuQjt73nESoF77ykAMHCN5Ie9lGeOCcw1KM2s8rEd7S05kUHm0LYyH4SQlgtCAKZDc99QRTJ2p9QU7LTqSHUZlZyb9QjKJ8faKuma8EWwrtBVase1-JBRxadosbkKOWGkkiZxxbR74AA6btuSPUG9k_jdNLjgWEEAqkfxaxhlb2dnloBWc-wgv46Xxt3g6MBUNebyhWo3MqY452GoYGP-PwyE2-a3n6H5L_0mW8aIPqgzEk"></div><div class="flex flex-col flex-1 min-w-0"><div class="flex items-center justify-between"><h3 class="font-title-md text-title-md text-on-surface font-semibold truncate leading-tight">Hábitos Atómicos</h3><span class="font-label-sm text-label-sm font-bold text-on-surface-variant bg-surface-container px-2 py-0.5 rounded-md">37%</span></div><p class="font-body-sm text-body-sm text-on-surface-variant truncate mt-0.5">James Clear</p><div class="mt-3"><div class="flex items-center justify-between font-label-sm text-label-sm text-on-surface-variant mb-1.5"><span class="">Pág. 120 de 320 totales</span><span class="text-[12px]">200 restantes</span></div><div class="w-full bg-surface-container h-1.5 rounded-full overflow-hidden"><div class="bg-secondary h-full rounded-full" style="width: 37.5%;"></div></div></div></div></div><div class="flex items-center gap-2 pt-1"><button class="flex-1 h-11 bg-surface-container-low hover:bg-surface-container text-on-surface rounded-xl flex items-center justify-center gap-2 font-label-md text-label-md transition-colors" onclick="showToast('Página actualizada')"><span class="material-symbols-outlined text-[18px]">bookmark_add</span><span class="">Actualizar página</span></button><button class="h-11 px-4 bg-surface-container-low hover:bg-surface-container text-on-surface font-label-md text-label-md font-semibold rounded-xl flex items-center justify-center active:scale-95 transition-transform" onclick="showToast('+1 pág registrada')">+1 pág</button></div></article>
<!-- Editorial Micro-Inspiration Quote / Delight Prompt -->

<!-- Notification Toast Simulation -->
<div class="fixed bottom-20 left-4 right-4 z-40 transform translate-y-12 opacity-0 pointer-events-none transition-all duration-300 bg-primary text-on-primary px-4 py-3 rounded-xl shadow-xl flex items-center justify-between" id="reading-toast">
<div class="flex items-center gap-2 min-w-0">
<span class="material-symbols-outlined text-tertiary-fixed text-[20px]">check_circle</span>
<span class="font-label-md text-label-md truncate" id="toast-message">¡Progreso actualizado!</span>
</div>
<span class="font-label-sm text-label-sm text-on-primary-container">+ racha activa</span>
</div>
</div>
<script>
  let principitoCurrentPage = 68;
  const principitoTotalPages = 96;

function toggleQuickStepper(id) {
const stepper = document.getElementById(id + '-stepper');
if (stepper) {
stepper.classList.toggle('hidden');
stepper.classList.toggle('flex');
}
}

function updatePrincipitoProgress(newPage) {
principitoCurrentPage = Math.min(Math.max(newPage, 1), principitoTotalPages);
const percentage = Math.round((principitoCurrentPage / principitoTotalPages) * 100);

    // Update displays
    document.getElementById('principito-page-display').innerHTML = `Pág. ${principitoCurrentPage} <span class="text-on-surface-variant font-normal">de ${principitoTotalPages}</span>`;
    document.getElementById('principito-percent-text').innerText = `${percentage}%`;
    document.getElementById('principito-linear-progress').style.width = `${percentage}%`;
    document.getElementById('principito-ring').setAttribute('stroke-dasharray', `${percentage}, 100`);

    showToast(`Registrado en página ${principitoCurrentPage} (${percentage}%)`);
}

function quickAddPages(count) {
updatePrincipitoProgress(principitoCurrentPage + count);
}

function promptCustomPage() {
const val = prompt('Ingresa la página actual (1 - 96):', principitoCurrentPage);
if (val !== null && !isNaN(parseInt(val))) {
updatePrincipitoProgress(parseInt(val));
}
}

function toggleAtomicToast() {
showToast("Hábitos Atómicos: +1 página anotada");
}

function showToast(msg) {
const toast = document.getElementById('reading-toast');
const label = document.getElementById('toast-message');
if (!toast || !label) return;

    label.innerText = msg;
    toast.classList.remove('translate-y-12', 'opacity-0', 'pointer-events-none');
    toast.classList.add('translate-y-0', 'opacity-100');

    setTimeout(() => {
      toast.classList.add('translate-y-12', 'opacity-0', 'pointer-events-none');
      toast.classList.remove('translate-y-0', 'opacity-100');
    }, 2400);
}
</script></main><nav class="fixed bottom-0 w-full z-50 pb-safe bg-surface/85 backdrop-blur-xl shadow-[0_-4px_16px_rgba(0,0,0,0.03)]" data-active-classes="[&amp;_[data-pill]]:bg-secondary-fixed [&amp;_[data-pill]]:w-16 [&amp;_[data-icon]]:text-secondary [&amp;_[data-label]]:font-label-lg [&amp;_[data-label]]:text-on-surface"><div class="flex justify-around items-center h-bottom-nav-height px-screen-margin-mobile"><a aria-current="page" class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface [&amp;_[data-pill]]:bg-secondary-fixed [&amp;_[data-pill]]:w-16 [&amp;_[data-icon]]:text-secondary [&amp;_[data-label]]:font-label-lg [&amp;_[data-label]]:text-on-surface" data-path="ahora" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">menu_book</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Ahora</span></a><a class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface" data-path="registros" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">inventory_2</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Registros</span></a><a class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface" data-path="agregar-libro" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">library_add</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Agregar Libro</span></a></div></nav>

</body></html>

<!-- Registros Anteriores -->
<!DOCTYPE html><html lang="es" style=""><head><meta charset="utf-8"><meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover" name="viewport"><link href="https://fonts.googleapis.com" rel="preconnect"><link crossorigin="" href="https://fonts.gstatic.com" rel="preconnect"><link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&amp;family=Manrope:wght@600;700&amp;family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0&amp;display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:wght,FILL@100..700,0..1&amp;display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&amp;family=Manrope:wght@100..900&amp;display=swap" rel="stylesheet"><style>@layer base{html,body{width:100vw;margin:0;padding:0;}body{overscroll-behavior:none;}.pb-safe{padding-bottom:env(safe-area-inset-bottom,0px);}.pt-safe{padding-top:env(safe-area-inset-top,0px);}main>:first-child{margin-top:0!important;}main>:last-child{margin-bottom:0!important;}}::-webkit-scrollbar{display:none;}</style><script src="https://cdn.tailwindcss.com"></script><script id="tailwind-config">tailwind.config = { darkMode: "class", theme: { extend: { "colors": { "surface-container-high": "#e6e8ea", "on-error": "#ffffff", "on-secondary-container": "#fffbff", "surface-container-lowest": "#ffffff", "primary-fixed": "#d8e3fb", "inverse-surface": "#2d3133", "secondary": "#4b41e1", "surface": "#f7f9fb", "on-surface": "#191c1e", "secondary-container": "#645efb", "inverse-primary": "#bcc7de", "primary-container": "#1e293b", "tertiary-fixed": "#6ffbbe", "on-primary-container": "#8590a6", "on-tertiary-fixed": "#002113", "outline": "#75777d", "surface-container-low": "#f2f4f6", "tertiary-fixed-dim": "#4edea3", "on-primary": "#ffffff", "surface-container": "#eceef0", "outline-variant": "#c5c6cd", "on-error-container": "#93000a", "on-tertiary-fixed-variant": "#005236", "error": "#ba1a1a", "on-tertiary": "#ffffff", "surface-variant": "#e0e3e5", "background": "#f7f9fb", "on-secondary-fixed": "#0f0069", "secondary-fixed-dim": "#c3c0ff", "tertiary": "#00190e", "tertiary-container": "#00301e", "secondary-fixed": "#e2dfff", "on-primary-fixed-variant": "#3c475a", "primary-fixed-dim": "#bcc7de", "inverse-on-surface": "#eff1f3", "on-background": "#191c1e", "on-surface-variant": "#45474c", "surface-dim": "#d8dadc", "on-secondary-fixed-variant": "#3323cc", "on-secondary": "#ffffff", "surface-container-highest": "#e0e3e5", "on-tertiary-container": "#00a472", "primary": "#091426", "surface-tint": "#545f73", "surface-bright": "#f7f9fb", "on-primary-fixed": "#111c2d", "error-container": "#ffdad6" }, "borderRadius": { "DEFAULT": "0.25rem", "lg": "0.5rem", "xl": "0.75rem", "full": "9999px" }, "spacing": { "space-2xs": "0.25rem", "screen-margin-tablet": "1.5rem", "space-xl": "1.5rem", "card-padding": "1rem", "screen-margin-mobile": "1rem", "bottom-nav-height": "4.5rem", "space-xs": "0.5rem", "space-2xl": "2rem", "space-sm": "0.75rem", "space-md": "1rem", "space-lg": "1.25rem", "space-3xl": "2.5rem" }, "fontFamily": { "headline-lg": ["Manrope"], "headline-md": ["Manrope"], "label-lg": ["Inter"], "body-md": ["Inter"], "body-sm": ["Inter"], "headline-lg-mobile": ["Manrope"], "body-lg": ["Inter"], "title-md": ["Manrope"], "label-md": ["Inter"], "label-sm": ["Inter"], "display-lg": ["Manrope"] }, "fontSize": { "headline-lg": ["28px", { "lineHeight": "36px", "letterSpacing": "-0.015em", "fontWeight": "700" }], "headline-md": ["20px", { "lineHeight": "28px", "letterSpacing": "-0.01em", "fontWeight": "600" }], "label-lg": ["14px", { "lineHeight": "20px", "letterSpacing": "0.01em", "fontWeight": "600" }], "body-md": ["14px", { "lineHeight": "22px", "letterSpacing": "0em", "fontWeight": "400" }], "body-sm": ["12px", { "lineHeight": "18px", "letterSpacing": "0.01em", "fontWeight": "400" }], "headline-lg-mobile": ["24px", { "lineHeight": "32px", "letterSpacing": "-0.01em", "fontWeight": "700" }], "body-lg": ["16px", { "lineHeight": "26px", "letterSpacing": "-0.005em", "fontWeight": "400" }], "title-md": ["16px", { "lineHeight": "24px", "letterSpacing": "0em", "fontWeight": "600" }], "label-md": ["12px", { "lineHeight": "16px", "letterSpacing": "0.02em", "fontWeight": "500" }], "label-sm": ["10px", { "lineHeight": "14px", "letterSpacing": "0.04em", "fontWeight": "600" }], "display-lg": ["36px", { "lineHeight": "44px", "letterSpacing": "-0.02em", "fontWeight": "700" }] } } } }</script></head><body class="bg-surface text-on-surface font-body-md text-body-md flex flex-col min-h-screen"><header class="fixed top-0 w-full z-50 pt-safe bg-surface/80 backdrop-blur-xl shadow-[0_1px_8px_rgba(0,0,0,0.04)]"><div class="h-16 px-screen-margin-mobile flex items-center justify-between"><div class="flex items-center gap-space-sm"><div class="w-9 h-9 rounded-xl bg-surface-container flex items-center justify-center"><span class="material-symbols-outlined text-secondary text-[22px]">auto_stories</span></div><div class="flex flex-col"><span class="font-headline-md text-headline-md text-on-surface tracking-tight leading-none">Mylib</span><div class="flex items-center gap-1.5 mt-0.5"><span class="w-1.5 h-1.5 rounded-full bg-on-tertiary-container"></span><span class="font-label-sm text-label-sm text-on-surface-variant">Registros</span></div></div></div><div class="flex items-center gap-space-xs"><button class="w-11 h-11 flex items-center justify-center text-on-surface-variant hover:text-on-surface transition-colors"><span class="material-symbols-outlined text-[22px]">cloud_done</span></button><div class="w-8 h-8 rounded-full bg-primary flex items-center justify-center"><span class="material-symbols-outlined text-on-primary text-[18px]">person</span></div></div></div></header><main class="flex-1 flex flex-col relative w-full pt-16 pb-bottom-nav-height bg-surface"><div class="flex flex-col w-full px-screen-margin-mobile pb-space-2xl space-y-space-md">
<!-- Header Module: Title, count badge & export trigger -->
<section class="flex flex-col gap-space-sm pt-space-xs"><div class="flex items-baseline justify-between pt-space-xs"><h1 class="font-headline-lg-mobile text-headline-lg-mobile text-on-surface font-bold">Registros anteriores</h1><span class="font-label-md text-label-md text-on-surface-variant font-medium">18 libros leídos</span></div></section>
<!-- Filter chips pill row -->
<nav aria-label="Filtros de historial" class="flex items-center gap-2 overflow-x-auto py-1 scrollbar-none">
<button class="filter-chip px-3.5 py-1.5 rounded-full font-label-md text-label-md bg-primary text-on-primary shadow-sm transition-all flex-shrink-0" data-filter="all">
      Todos
    </button>
<button class="filter-chip px-3.5 py-1.5 rounded-full font-label-md text-label-md bg-surface-container text-on-surface-variant hover:bg-surface-container-high transition-all flex-shrink-0" data-filter="completed">
      Completados
    </button>
<button class="filter-chip px-3.5 py-1.5 rounded-full font-label-md text-label-md bg-surface-container text-on-surface-variant hover:bg-surface-container-high transition-all flex-shrink-0 flex items-center gap-1" data-filter="notes">
<span class="material-symbols-outlined text-[14px]">edit_note</span>
<span class="">Notas guardadas</span>
</button>
<button class="filter-chip px-3.5 py-1.5 rounded-full font-label-md text-label-md bg-surface-container text-on-surface-variant hover:bg-surface-container-high transition-all flex-shrink-0 flex items-center gap-1" data-filter="favorites">
<span class="material-symbols-outlined text-[14px]">grade</span>
<span class="">5 estrellas</span>
</button>
</nav>
<!-- Book List Collection -->
<section class="flex flex-col space-y-space-md" id="books-container"><article class="flex items-center gap-space-md bg-surface-container-lowest rounded-xl p-card-padding shadow-sm hover:shadow-md transition-all"><div class="relative w-16 h-20 flex-shrink-0 rounded-lg overflow-hidden bg-surface-container-high shadow-sm"><img class="w-full h-full object-cover" alt="Portada de 1984 por George Orwell" src="https://lh3.googleusercontent.com/aida-public/AB6AXuCRSQsUsR6lJwmUpPwBeBs9BQjJZyjsWw8ZF64EDmzaqeRYYyHqquIk1TulakZn_3-2UjXkfv53GwDpBnHnP2z4o-0_3gK7vuC08mF7yOvfoe7zLQDqefNKSurkpmt4m4dPjJCG5ks7MiB8q-ZdiLLL0HZFUuz4r9fmfHkqDN7H53lfAc0_Y-SREtqxCxUMjZ_sIulVjn8oTFbdKdH0LJ25v9n61p3tGTTo13GqorZWydzWuWKV3-yh"></div><div class="flex flex-col flex-1 min-w-0 justify-center"><div class="flex items-baseline justify-between gap-2"><h2 class="font-title-md text-title-md text-on-surface truncate font-semibold">1984</h2><span class="font-label-sm text-label-sm text-on-tertiary-container font-medium flex-shrink-0">Completado</span></div><p class="font-body-sm text-body-sm text-on-surface-variant truncate">George Orwell</p><div class="flex items-center gap-2 mt-1"><span class="flex items-center gap-1 font-label-sm text-label-sm bg-surface-container px-2 py-0.5 rounded-full text-on-surface-variant"><span class="material-symbols-outlined text-[14px]">auto_stories</span>Páginas totales: 326</span><span class="text-on-surface-variant text-body-sm">•</span><span class="font-body-sm text-body-sm text-on-surface-variant">14 Oct</span></div></div></article><article class="flex items-center gap-space-md bg-surface-container-lowest rounded-xl p-card-padding shadow-sm hover:shadow-md transition-all"><div class="relative w-16 h-20 flex-shrink-0 rounded-lg overflow-hidden bg-surface-container-high shadow-sm"><img class="w-full h-full object-cover" alt="Portada de Sapiens por Yuval Noah Harari" src="https://lh3.googleusercontent.com/aida-public/AB6AXuB0S8p3UsSIXhxcLpKizENWUAZK2h7KQFgA_hYrbvJS_m5Nw2RpPRehwnzLGvd5d2QJTsiJNpqrJWfTrCzngT9wrk0x5gIu7yCu2MxIklCpvprk6B1rfbwMIJk29A4FbokvYLzyEiUEzmfldg75GB04TXQ6P1-1xWJEjxFfGAYTIU1ZfDs5dp2X75Jqo8XqBhwBs9H3c6wV56VvV3kwOMupCZ5t6Wltc40tP84UdnwSK-FA5jAxBSOe"></div><div class="flex flex-col flex-1 min-w-0 justify-center"><div class="flex items-baseline justify-between gap-2"><h2 class="font-title-md text-title-md text-on-surface truncate font-semibold">Sapiens</h2><span class="font-label-sm text-label-sm text-secondary font-medium flex-shrink-0">Guardado</span></div><p class="font-body-sm text-body-sm text-on-surface-variant truncate">Yuval Noah Harari</p><div class="flex items-center gap-2 mt-1"><span class="flex items-center gap-1 font-label-sm text-label-sm bg-surface-container px-2 py-0.5 rounded-full text-on-surface-variant"><span class="material-symbols-outlined text-[14px]">auto_stories</span>Páginas totales: 496</span><span class="text-on-surface-variant text-body-sm">•</span><span class="font-body-sm text-body-sm text-on-surface-variant">18h leídas</span></div></div></article><article class="flex items-center gap-space-md bg-surface-container-lowest rounded-xl p-card-padding shadow-sm hover:shadow-md transition-all"><div class="relative w-16 h-20 flex-shrink-0 rounded-lg overflow-hidden bg-surface-container-high shadow-sm"><img class="w-full h-full object-cover" alt="Portada de Fahrenheit 451 por Ray Bradbury" src="https://lh3.googleusercontent.com/aida-public/AB6AXuDrBjp1OvgckQRdddykvDZsR6iW_hMQMt5m4MPK9bndXqIudvr71g33LyyVQFaVs2aBh_iMSzXLy_v9Rr0A8iS665Jm8_Pxh6iNtSovP5-l6GYr9Bc9HRUTkVrFSt56CIMt8e1MUNj9tHd0md4ydoamgYfCtk3bg6dScS84FZRuf-vbTrVnNfkZFAf2ueUa4h9748C_vznBC2gb-c0wH1SJ_pZrxAOww5GgaPUuf2zTcP1OfYfVCnEb"></div><div class="flex flex-col flex-1 min-w-0 justify-center"><div class="flex items-baseline justify-between gap-2"><h2 class="font-title-md text-title-md text-on-surface truncate font-semibold">Fahrenheit 451</h2><span class="font-label-sm text-label-sm text-on-tertiary-container font-medium flex-shrink-0">Completado</span></div><p class="font-body-sm text-body-sm text-on-surface-variant truncate">Ray Bradbury</p><div class="flex items-center gap-2 mt-1"><span class="flex items-center gap-1 font-label-sm text-label-sm bg-surface-container px-2 py-0.5 rounded-full text-on-surface-variant"><span class="material-symbols-outlined text-[14px]">auto_stories</span>Páginas totales: 192</span><span class="text-on-surface-variant text-body-sm">•</span><span class="font-body-sm text-body-sm text-on-surface-variant">28 Sep</span></div></div></article></section>
<!-- Summary Statistics Bento Tile -->

<!-- Quick Floating Action Dock for New Entry -->
<div class="sticky bottom-4 z-20 w-full pt-space-xs"><a class="flex items-center justify-center gap-2 w-full py-3.5 px-space-md bg-primary text-on-primary rounded-xl shadow-md hover:bg-primary/80 transition-all active:scale-[0.98] font-label-lg text-label-lg" data-path="agregar-libro" href="#"><span class="material-symbols-outlined text-[20px]">add</span><span class="">Agregar nuevo libro</span></a></div>
<!-- Export Log Modal Summary Overlay (Hidden by default) -->
<div class="fixed inset-0 z-50 bg-inverse-surface/40 backdrop-blur-sm hidden flex items-center justify-center p-screen-margin-mobile" id="export-modal">
<div class="w-full max-w-sm bg-surface-container-lowest rounded-xl p-card-padding shadow-xl space-y-space-md">
<div class="flex items-center justify-between">
<div class="flex items-center gap-2">
<span class="material-symbols-outlined text-secondary">verified_user</span>
<h3 class="font-title-md text-title-md text-on-surface">Resumen de Registros</h3>
</div>
<button class="w-8 h-8 rounded-full flex items-center justify-center text-on-surface-variant hover:bg-surface-container" id="close-modal-btn">
<span class="material-symbols-outlined text-[20px]">close</span>
</button>
</div>
<div class="space-y-2 bg-surface-container-low p-3 rounded-lg font-body-sm text-body-sm text-on-surface-variant">
<div class="flex justify-between">
<span class="">Libros archivados:</span>
<span class="font-medium text-on-surface">18</span>
</div>
<div class="flex justify-between">
<span class="">Páginas registradas:</span>
<span class="font-medium text-on-surface">4.820</span>
</div>
<div class="flex justify-between">
<span class="">Último guardado:</span>
<span class="font-medium text-on-surface">14 Oct, 2024</span>
</div>
<div class="flex justify-between">
<span class="">Checksum hash:</span>
<span class="font-mono text-label-sm text-on-surface">#LC-883902</span>
</div>
</div>
<div class="flex gap-2">
<button class="flex-1 py-2.5 px-3 rounded-lg bg-secondary text-on-secondary font-label-md text-label-md flex items-center justify-center gap-1.5 shadow-sm active:scale-95" id="download-json-btn">
<span class="material-symbols-outlined text-[16px]">download</span>
          Descargar JSON
        </button>
<button class="py-2.5 px-3 rounded-lg bg-surface-container text-on-surface-variant font-label-md text-label-md flex items-center justify-center gap-1 hover:bg-surface-container-high active:scale-95" id="copy-summary-btn">
<span class="material-symbols-outlined text-[16px]">content_copy</span>
</button>
</div>
</div>
</div>
</div>
<script>
  // Simple micro-interactions for filters and modal preview
  document.addEventListener('DOMContentLoaded', () => {
    const filterButtons = document.querySelectorAll('.filter-chip');
    filterButtons.forEach(btn => {
      btn.addEventListener('click', () => {
        filterButtons.forEach(b => {
          b.classList.remove('bg-primary', 'text-on-primary');
          b.classList.add('bg-surface-container', 'text-on-surface-variant');
        });
        btn.classList.add('bg-primary', 'text-on-primary');
        btn.classList.remove('bg-surface-container', 'text-on-surface-variant');
      });
    });

    const exportBtn = document.getElementById('export-summary-btn');
    const modal = document.getElementById('export-modal');
    const closeBtn = document.getElementById('close-modal-btn');
    const downloadBtn = document.getElementById('download-json-btn');

    if (exportBtn && modal && closeBtn) {
      exportBtn.addEventListener('click', () => {
        modal.classList.remove('hidden');
      });

      closeBtn.addEventListener('click', () => {
        modal.classList.add('hidden');
      });

      modal.addEventListener('click', (e) => {
        if (e.target === modal) {
          modal.classList.add('hidden');
        }
      });
    }

    if (downloadBtn) {
      downloadBtn.addEventListener('click', () => {
        downloadBtn.innerHTML = '<span class="material-symbols-outlined text-[16px]">done</span> Exportado';
        setTimeout(() => {
          modal.classList.add('hidden');
          downloadBtn.innerHTML = '<span class="material-symbols-outlined text-[16px]">download</span> Descargar JSON';
        }, 900);
      });
    }
});
</script></main><nav class="fixed bottom-0 w-full z-50 pb-safe bg-surface/85 backdrop-blur-xl shadow-[0_-4px_16px_rgba(0,0,0,0.03)]" data-active-classes="[&amp;_[data-pill]]:bg-secondary-fixed [&amp;_[data-pill]]:w-16 [&amp;_[data-icon]]:text-secondary [&amp;_[data-label]]:font-label-lg [&amp;_[data-label]]:text-on-surface"><div class="flex justify-around items-center h-bottom-nav-height px-screen-margin-mobile"><a class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface" data-path="ahora" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">menu_book</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Ahora</span></a><a aria-current="page" class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface [&amp;_[data-pill]]:bg-secondary-fixed [&amp;_[data-pill]]:w-16 [&amp;_[data-icon]]:text-secondary [&amp;_[data-label]]:font-label-lg [&amp;_[data-label]]:text-on-surface" data-path="registros" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">inventory_2</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Registros</span></a><a class="group flex flex-col items-center justify-center min-w-[64px] min-h-[44px] transition-all text-on-surface-variant hover:text-on-surface" data-path="agregar-libro" href="#"><div class="h-8 w-12 rounded-full flex items-center justify-center transition-all duration-200" data-pill=""><span class="material-symbols-outlined text-[22px] transition-colors" data-icon="">library_add</span></div><span class="font-label-sm text-label-sm mt-0.5 text-on-surface-variant transition-colors" data-label="">Agregar Libro</span></a></div></nav>

</body></html>